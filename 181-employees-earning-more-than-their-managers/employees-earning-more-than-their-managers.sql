SELECT Employee.name     AS Employee FROM Employee
FULL OUTER JOIN Employee AS Manager 
ON  Employee.managerId = Manager.id
WHERE Employee.salary > Manager.salary