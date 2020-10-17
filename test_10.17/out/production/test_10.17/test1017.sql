-- Q13:从titles表获取按照title进行分组，每组个数大于等于2，给出title以及对应的数目t
select title,count(title) as t
from titles
group by title

-- Q14:从titles表获取按照title进行分组，每组个数大于等于2，给出title以及对应的数目t
-- 注意对于重复的emp_no进行忽略（即emp_no重复的title不计算，title对应的数目t不增加）
select title,count(distinct emp_no) as t
from titles
group by title
having t >=2;

-- Q15:查找employees表所有emp_no为奇数，且lastname不为Mary的员工信息
-- 并按照hire_date逆序排列
select *
from employees
where last_name != 'Mary'
  and emp_no%2=1
order by hire_date desc;

-- Q16:统计当前各个title类型对应的员工当前薪水对应的平均工资。
-- 结果给出title以及平均工资avg
select t.title,count(s.salary)/count(title) as avg
from titles as t
inner join salaries as a
on s.emp_no=t.emp_no
where t.to_date='9999-01-01'
  and s.to_date='9999-01-01'

-- Q17:获取当前薪水第二多的员工的emp_no以及其对应的薪水salary
