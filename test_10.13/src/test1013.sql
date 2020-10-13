-- Q9:获取所有部门当前manager的当前薪水情况，给出dept_no，emp_no以及salary
select d.dept_no,d.emp_no,s.salary
from dept_manager as d
join salaries as s
on d.emp_no = s.emp_no
where d.to_date = '9999-01-01' and
      s.to_date = '9999-01-01';

-- Q10：获取所有非manager的员工emp_no
select e.emp_no
from employees as e
left join dept_manager as d
on e.emp_no = d.emp_no
where d.dept_no is not null;
-- left join 会返回坐标所有行，不匹配的就赋值为null，
-- 所以满足d.dept_no is null就是非管理员

-- Q11：获取所有员工当前的manager，如果员工是manager的话不显示。
-- 输出结果第一列给出当前员工的emp_no，第二列给出其manager对应的emp_no
select d.emp_no,dm.emp_no
from dept_emp as d
join dept_manager as dm
on d.dept_no = dm.demp_no
where d.to_date = '9999-01-01'
  and dm.to_date = '9999-01-01'
  and d.emp_no != dm.emp_no;

--   Q12:获取所有部门中当前员工当前薪水最高的相关信息，
-- 给出dept_no,emp_no，以及其对应的salary，
-- 按照部门升序排列
select d.dept_no,d.emp_no,MAX(s.salary) as salary
from dept_emp as d
inner join salaries as s
on d.emp_no = s.emp_no
where d.to_date = '9999-01-01'
  and s.to_date = '9999-01-01'
group by dept_no;
