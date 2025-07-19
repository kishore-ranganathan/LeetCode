CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
     select distinct salary  from ( select e.salary,dense_rank() over (order by e.salary desc) as rnk from employee e ) as rnk_s where rnk = n

  );
END