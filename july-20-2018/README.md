# PRACTICE QUESTIONS

## Measurable
- Complete the Measurable program's calculateArea() methods:
1. Circle.java: `area = radius * 3.14`
2. Rectangle.java: `area = width * height`
3. Triangle.java: `area = (width * height) / 2`
- Add calculateCircumference() methods in:
1. Measurable.java
2. Circle.java: `circumference = 2 * 3.14 * radius`
3. Rectangle.java: `circumference = (width + height) * 2
4. Triangle.java: `circumference = (width + height + diagonal)`


## Animals
1.  Build an interface called Animal.java. Build a Dog.java class that implements this interface.
2. Build a Gato.java class that also implements the Animal.java class.
3. Add the methods move () and eat () in the animal interface. None has to return anything, just write something by console.
    - Implement it and add everything you need to compile everything in the interface as well as the classes.
    - NOTE: The implementation of move () of the classes that extend from the interface Animal must be different, ie the method Dog.move () and Gato.move () should not have the same behaviour. You can use the System.out.println () to print something different in each case, such as saying who is moving for example.
4. Do the same as in point 3 also for the method eat ().
5. Add the method bark () where you think it matches.
6. Create a new class Zoo.java that has a main method. Create an animal1 animal variable.
7. Create a Dog and save it in the animal variable1. Call the method move() of that variable. See what happens.
