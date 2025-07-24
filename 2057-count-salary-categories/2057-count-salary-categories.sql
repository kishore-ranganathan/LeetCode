# Write your MySQL query statement below
-- with var as(
-- select *,case 
--     when income < 20000 then 'Low Salary'
--     when income between 20000 and 50000 then 'Average Salary' 
--     when income > 50000 then 'High Salary'
--     end as category 
-- from accounts )

-- select category , count(*) account_count from var group  by category


-- Write your PostgreSQL query statement below
SELECT 'Low Salary' AS category, COUNT(*) AS accounts_count FROM Accounts WHERE income < 20000 
UNION
SELECT 'Average Salary' AS category, COUNT(*) AS accounts_count FROM Accounts WHERE income >= 20000 AND income <= 50000
UNION
SELECT 'High Salary' AS category, COUNT(*) AS accounts_count FROM Accounts WHERE income > 50000 

