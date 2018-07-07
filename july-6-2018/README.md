# Object Oriented Programming Practices

1) Create a class called Book that stores the information for each of the books in a library. The class should keep the title of the book, author, number of copies of the book and number of lend copies. 

The class will contain the following methods: 
- Default constructor. 
- Constructor with parameters. 
- Setters / getters. 
- Method Loan that increases the corresponding attribute each time a loan is made from the book. 
No books may be borrowed if no copies are available to lend. Returns true if the operation was successful and false otherwise. Returns method that decrements the corresponding attribute when a book is returned. No books can be returned that have not been lend. Returns true if the operation was successful and false otherwise. 
- ToString method to display data from books. This method is inherited from Object and we must modify it (override) to adapt it to the Book class. Write a program to test the operation of the Book class.


2) Make a class called Person with the following conditions:
Its attributes are: name, age, id, gender (M male, F female), weight and height. We do not want direct access to them. 
Think which access modifier is the most appropriate, also its type. 
If you want to add some extra attribute you can do it. By default, all attributes except the Id will be default values ​​according to their type (0 for numbers, empty string for String, etc.). Gender will be male by default, use a constant for it. Several constructors will be implemented: A default constructor. A constructor with the name, age and gender, the rest by default. A constructor with all the attributes as parameters. The methods that will be implemented are: Calculate (): calculate if the person is at his ideal weight (weight in kg / (height ^ 2 in meters)), return -1 if he is below his ideal weight, 0 if he’s at his ideal weight and 1 if he’s overweight. Use constants to return these values. isOver18 (): indicates if it is of legal age, it returns a Boolean. CheckGender(char gen): Check if the entered gender is correct. It will not be visible outside the class. ToString (): returns all object information. GeneratesID (): generates a random number of 8 digits. This method will be invoked when the object is built. You can split the method to make it easier for you. It will not be visible outside the class. Setter of each attribute except ID. 

Now, create an executable class that does the following:

Ask by keyboard the name, age, gender, weight and height. Create 3 objects of the previous class. The first object will get the previous variables requested by keyboard, the second object will get all the previous ones but the weight and height by default, and the last one everything by default. For the latter, use setter methods to give values to the attributes. For each object, you should check if you are at ideal weight, overweight or below ideal weight and show a message. Indicate for each object if it is of legal age. Finally, display the information of each object. You can use methods in the executable class, to make it easier for you.


3) Create a class called Password with the following conditions:

It has the length and password attributes. By default, the length will be 8. The constructors will be as follows: A default constructor. A constructor with the length that we send as parameter. Generate a random password with that length. The methods you implement will be: isStrong (): return a boolean if it is strong or not, to be strong you must have more than 2 uppercase, more than 1 lower case and more than 5 numbers. GeneratePassword (): Generates the password of the object with the defined length. Get method for password and length. Set method for length. 

Now let’s create an executable class:

Create an array of Passwords with the size that you indicate by keyboard. Create a loop that creates an object for each position in the array. It also indicates by keyboard the length of the Passwords (before loop). Create another array of booleans where we store if the password of the password array is strong or not (use the previous loop). 

At the end, we show the password and whether or not it is strong (use the previous loop). Use this simple format: password1 boolean_value1
password2 boolean_value2
