# Write your MySQL query statement below
with salary_rank as (
    select *, dense_rank() over (partition by departmentid order by salary desc) as rnk from employee
)
select d.name as Department , e.name Employee , e.salary Salary from salary_rank e join department d on e.departmentid = d.id where e.rnk <=3