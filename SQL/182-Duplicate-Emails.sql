# Write your MySQL query statement below
select email as Email 
from Person 
group BY email
having count(email)>1;