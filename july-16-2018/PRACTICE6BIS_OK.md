THEORY TO SOLVE THIS PRACTICE IS IN PPTs 15 and 16.
VARIABLES OF VALUE AND REFERENCE.
## Step 1
Create a class called MyClass that contains at least one attribute, and a method called print (), that shows of the attribute. 

Ex:
```java
public class MyClass {
    private String aValue = "Hello";

    public void print () {
        System.out.println (aValue);
    }
} 
```
### Step 2 
Now create a class called Main that contains the main method. Inside the class, create a variable of type int called primitiveVariable. DO NOT INITIALIZE IT(Never assign any value). - Use the System.out.println method to print its contents. What does it print? 
### Step 3 
Create another variable in the main method that is of type MyClass. The variable is called variableObject. DO NOT INITIALIZE (Do not do NEW). - Use the System.out.println method to print its contents. What does it print? 
### Step 4 
Create an array type variable called myPrimitiveArray, where its elements are of type int. DO NOT INITIALIZE. - If I want to know the length of the array (with myPrimitiveArray.length), can I do it? What happens when you try to call the length method on the uninitialized array? 
### Step 5
Now create the array in the variable myPrimitiveArray, of 5 elements. Go through the array and print the value of each of its elements. What does it print? Do we have to initialize the elements to be able to print / use them? 
### Step 6 
Create another array called myArrayObject, where its elements are of type MyClass. Initialize it with 5 elements (new MyClass [5]). 
### Step 7 
Now, go through the array of objects and in each of its elements (which are of type MyClass) invoke the print () method. Can we do this? What happens? 

### Step 8 
If you could not execute the previous point, what should you do to be able to execute it successfully?
