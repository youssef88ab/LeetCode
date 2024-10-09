SELECT Employee.name , Bonus.bonus from Employee 
LEFT JOIN Bonus ON Employee.empId = Bonus.empId 
WHERE bonus < 1000 or bonus is null