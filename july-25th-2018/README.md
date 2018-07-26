## Question 1 
1. Create an Employee class that has following attributes & methods:
  - Name
  - Base salary
  - Hours worked
  - calculateSalary() method: return baseSalary * hoursWorked
2. Create a President class that extends the Employee class
  - Override the calculateSalary() method so that it also adds 50% of total income on top of the current salary
3. Create a Manager class that extends the Employee class
  - Override the calculateSalary() method so that it also adds 2% of total income on top of current salary
4. Create a Supervisor class that extends the Manager class
  - Override the calculateSalary() method so that if he works for more than 35 hours, add (#Hours Worked Overtime * Base Salary) on top
5. Create an EmployeeProgram class and play around with your classes.
