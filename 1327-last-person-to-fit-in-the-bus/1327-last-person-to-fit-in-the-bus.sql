# Write your MySQL query statement below

with  acs  as ( Select turn , person_name ,  sum(weight) over ( order by turn ) as total_weight from queue ) 

select person_name from acs where total_weight <= 1000 order by turn desc  limit 1;