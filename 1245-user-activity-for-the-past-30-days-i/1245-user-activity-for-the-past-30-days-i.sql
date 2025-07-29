select activity_date day,count(distinct user_id)active_users 
from Activity 
where timestampdiff(day,activity_date,'2019-07-27' ) between 0 and 29  
group by 1