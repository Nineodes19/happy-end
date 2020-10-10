-- Q1 查找最晚入职员工的所有信息
-- desc代表降序排序
select *
from employees
order by hire_date desc
limit 1


-- Q2 查找入职员工时间排名倒数第三的员工所有信息
select * from employees
where hire_date = (
  select distinct hire_date
  from employees
  order by hire_date desc
  limit 2,1 -- 从第二条开始的一个数据
);

-- Q3 查找各个部门当前薪水详情以及其对应的部门编号
-- join   on  表的连接
select s.*,d.dept_no
from salaries as s
join dept_manager as d
on s.emp_no = d.emp_no
where d.to_date = '9999-01-01'
  and s.to_date = '9999-01-01';

-- Q4:查找所有已经分配部门的员工的last_name和first_name以及dept_no
select em.last_name,em.first_name,d.dept_no
from employees as em
join dept_emp as d
on d.emp_no = em.emp_no;

-- Q5:查找所有员工的last_name和first_name以及对应的部门编号dept_no，也包括暂时没有分配具体部门的员工
-- inner join 两边表同时有对一个的数据，及任何一边缺失了数据就不显示了
-- left join 会读取左边数据表的全部数据，即便右边表没有对应数据也会输出
-- right join 会读取右边表的全部数据，即便左边表没有对应数据也会进行输出
select em.last_name,em.first_name,d.dept_no
from employees as em
left join dept_emp as d
on em.emp_no = d.emp_no;

-- Q6:查找所有员工入职时候的薪水情况，给出emp_no以及salary，并按照emp_no进行逆序
select e.emp_no,s.salary
from employees as e
inner join salaries as s
on s.emp_no = e.emp_no and e.hire_date = s.from_date
order by e.emp_no desc;