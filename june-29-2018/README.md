# Java Practices

 1. Write a program that read in 2 numbers
 and print the biggest of 2
 (scanner.nextInt())

 2. Write a program that reads in a series
 of positive numbers from keyboard and
 compute their sum and averages.
 Program terminate when user enter -1.

 3. Write a program that solves quadratic
 equations: ax^2 + bx + c = 0
 Read in a, b, c
 Solve using formula:
 x1 = (-b - squareRoot(b^2 - 4ac))/2a
 x2 = (-b + squareRoot(b^2 - 4ac))/2a
 Equations have no roots when (b^2 - 4ac) is negative
 
 # Rock, Paper, Scissor
 Write a program that will simulate the game of Rock Paper and Scissor.
 **Rule: Rock > Scissor > Paper > Rock**
 It will be a game of 2 players: the Computer and the User. 
 The Computer will randomly play Rock, Paper or Scissor. To generate a random number from [MIN - MAX], you can use the following method:
 
 ```java
 Random random = new Random();
 int computerTurn = random.nextInt(max - min + 1) + min;
 ```
 The Player who first wins 3 games will win the game.
 Display the game process and winner. 
 
 Example output:
 ```
 Please enter:
 1- For Rock
 2- For Paper
 3- For Scissor
 Your choice: 1
 
 You go Rock. Computer goes Scissor! You won 1 times. Computer won 0 times.
 
 Please enter: 
 1- For Rock
 2- For Paper
 3- For Scissor
 Your choice: 2
 
 You go Paper. Computer goes Scissor! You won 1 times. Computer won 1 times.
 
Please enter: 
 1- For Rock
 2- For Paper
 3- For Scissor
 Your choice: 2
 
 You go Paper. Computer goes Rock! You won 2 times. Computer won 1 times.
 
 Please enter: 
 1- For Rock
 2- For Paper
 3- For Scissor
 Your choice: 3
 
 You go Scissor. Computer goes Paper! You won 3 times. Computer won 1 times.
 
 CONGRATULATIONS! YOU WON! 
 ***End of Program***
 ```
 
 
 # Array Practices (Please do question 1 in class)
 
 1. Write a program that allows you to enter the height of 10 students, 
 then show the average height, 
 and how many elements are above average, how many are below average.
 
2. Write an algorithm (Vehicles.java) that, from reading and storing in vectors the commercial value of 20 vehicles and the type (family (1), public transportation (2), load (3)), calculate the value based on:
- For vehicles with a value greater than 100 million, charge VAT of 20%, for others VAT is 16%
- For vehicles type 1, with value up to 50 million, apply a discount equivalent to 50% of the VAT charged
- For vehicles type 2 and 3, with a value higher than 80 million, apply an additional cost of 5%
- For all vehicles, if the final value is less than 80 million, apply an additional discount of 5% of the commercial value

3. (Poll.java) A survey was carried out to 15 students in a University where the following information was requested: Photo ID #, SEX, SALARY, JOB.
- PHOTO ID # (It's an integer)
- SEX (1 - Male 2 - Female)
- JOB (1 - If you work 2 - Do not work)
- SALARY (An integer value)
Write the algorithm that allows reading and storing the requested data in vectors, then calculate and print:
- Percentage of men in the university
- Percentage of women in the university
- Percentage of men who work and average salary
- Percentage of working women and average salary
