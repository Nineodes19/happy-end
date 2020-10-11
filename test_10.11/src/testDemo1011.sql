-- Q6:查找所有员工入职时候的薪水情况，给出emp_no以及salary，并按照emp_no进行逆序
select e.emp_no,s.salary
from employees as e
join salaries as s
on e.emp_no = s.emp_no
  and e.hire_date = s.from_date
order by e.emp_no desc

-- Q7:查找薪水变动超过15次的员工号emp_no以及其对应的变动次数t
select emp_no,count(emp_no) as t
from salaries
group by emp_no
having t > 15;

-- Q8:找出所有员工当前具体的薪水salary情况，对于相同的薪水只显示一次，并按照逆序显示
select distinct salary
from salaries
order by salary desc
where to_date = '9999-01-01';
