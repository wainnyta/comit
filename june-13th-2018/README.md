# June 13th, 2018
We have learnt about
- for loop
- switch
- Data types
  - Primitive data types
  - Compound data types
- Operator Precedence
- Coding Style & Nomenclature

## Homework
- **READ AND STUDY THE SLIDES UNTIL YOU UNDERSTAND THE CONTENTS THOROUGHLY.**
- Please do all the algorithm practice exercises from Monday & today's class. 
  I prefer to have the homework submitted to me on paper.
- Next week I will go over the solutions to the homework. 
- Next class we will continue to learn about Algorithms. 

## Review
### Mutability of Variables
1. Variable: Its value can be changed throughout the course of the program.
Ex: 
```java
x = 2; //(valid) (x has a value of 2)
x = 4; //(still valid) (x can be reassigned to a new value) 
```

2. Constant: Its value is assigned ONCE and can never change. 
Ex: 
```java
final name = "Wainny";  // (valid) (name has the value "Wainny")
name = "Comit";  // (INVALID) (because name's value is FINAL it cannot be reassigned to a new value)
```

### Assignment
Assignment always goes from right hand side to left hand side: 
```java
/**
 * "2+3" is called EXPRESSION
 * the expression will be calculated first
 * and then the result will be assigned to
 * our variable x 
 */
x = 2 + 3;  // x <- 2 + 3 

// It doesn't make sense to say this:
2 + 3 <- x; 
```

### Variable Declaration
To "declare" a variable and assign it some initial value, follow the following syntax: \
`<DataType> <VariableName> = <Value>` \
Ex:
```java
// Declare an integer called "year" and assign its value 20:
int year = 20;

// Declare a boolean called "isAdult" that is either true of false: 
boolean isAdult = year >= 18;

// Declare a String called name and its value "ComIT":
String name = "ComIT";  // note double quotes

// Declare a char called firstCharacter and assign value 'a':
char firstCharacter = 'a'; // note single quotes
```

### Difference between normal assignment and declaration
To declare a variable you'll need to declare its `DataType`.
Normal Assignment means you work with an already-declared variable.
Ex: 
```java
// DECLARATION
int day = 29;  // note 'int'
String school = "ComIT"; // note 'String'

// ASSIGNMENT
day = 17; 
```

### If conditional
Ex: 
```java
int x = 0;
int y = 0;

read(x);
read(y);

if (x > y) {
    print("X is bigger than Y");

} else if (x < y) {
    print("X is smaller than Y");

} else {
    print("X is equal to Y");
}
```

### Switch 
Switch is very similar to If. The differences between *if* and *switch* are: 
- Switch can only work with certain Data Type (cannot switch on boolean)
- You switch on the *real value* of your *expression*, you cannot do range of values, however you can put multiple values in one switch case.

Ex: 
```java
char character;
read(character);

switch(character) {
    case('a'):
      print "You have entered the first character of the alphabet!";
      break;
    case('z'):
      print "You have entered the last character of the alphabet!";
      break;
    default:
      print "You have entered some character!";
}
```
**INVALID example**
```java
int x;
read(x);

switch(x) {
    // ERRROR; YOU CANNOT DO RANGE CHECK HERE
    // switch(x) means switch on THE REAL VALUE of x, not the possibility of what x might be
    case (x > 10): 
      print ("X > 10");
      break;
}
```

### While loop
Pay attention to the conditions of while loop. Your code needs to know when the loop will stop execution.

Ex:
```java
int counter = 0;
while (counter < 5){
  print "Counter is: " + counter;
  counter++;
}
```

### For loop
When you know ahead of time about how many times you want your loop to run, you can simplify the *counter while loop* using a for loop.

Ex:
```java
for (int counter = 0; counter < 5; counter++) {
  print "Counter is: " + counter;
}
```
3 parts of the for declaration: 
`for (int counter = 0; counter < 5; counter++)`

```java
1. int counter = 0; // 1st part is to initialize counter 
2. counter < 5; // 2nd part is  the CONDITION to stop the for loop
3. counter++; // What we do after finishing one iteration and about to move to the next one
```

Please go up and compare the for loop with while loop. 
