# Java OOPS Practice

This repository contains my step by step Java OOPS learning journey.  
Each folder represents daily practice with clear concepts and examples.


## Day 01: Class, Object & Constructor

### Concepts Covered:
- What is a Class
- Object creation using `new`
- Constructor and its purpose
- Method definition and calling

### Example:
- Created a `Student` class
- Used constructor to initialize `name`, `roll`, and `marks`
- Used `display()` method to print student details

### Output:
Name, Roll, and Marks printed successfully.


## Day 02: Constructor Overloading & `this` Keyword

### Concepts Covered:
- Constructor overloading
- Using multiple constructors in a class
- Purpose of the `this` keyword
- Differentiating between instance variables and parameters

### Example:
- Created multiple constructors in the `Student` class
- Used `this` keyword to assign values to instance variables
- Demonstrated how different constructors are called based on arguments

### Key Learnings:
- Constructor name must be same as class name
- `this` refers to the current object
- Constructor overloading improves flexibility and readability

### Output:
Student details printed correctly using different constructors.


## Day 03: Inheritance & Method Overriding

### Concepts Covered:
- Inheritance using the `extends` keyword
- Parent class and child class
- Method overriding
- Code reusability

### Example:
- Created a `Person` parent class
- Created a `Student` child class that extends `Person`
- Overrode a method in the child class to display additional details

### Key Learnings:
- Inheritance helps in reusing existing code
- Child classes can access parent class methods and variables
- Method overriding allows a child class to provide its own implementation

### Output:
Person and student details printed successfully using inheritance.


## Day 04: Encapsulation

### Concepts Covered:
- Encapsulation and data hiding
- Using `private` access modifier
- Controlled access using getters and setters
- Protecting data from direct access

### Example:
- Created a `Student` class with private variables
- Used getter and setter methods to access and modify data
- Ensured data security by restricting direct access

### Key Learnings:
- Encapsulation improves data security
- Private variables cannot be accessed directly outside the class
- Getters and setters provide controlled access to data
- Makes code more maintainable and readable

### Output: 
Student details printed successfully using getter and setter methods.

## Day 05: Abstraction

### Concepts Covered:
- Abstraction in Java
- Abstract class
- Abstract methods
- Method implementation in child class
- Partial abstraction using abstract class

### Example:
- Created an abstract class `Person`
- Declared an abstract method `work()`
- Created a `Student` class that extends `Person`
- Implemented the abstract method in the child class
- Used normal methods inside an abstract class

### Key Learnings:
- Abstract classes cannot be instantiated
- Abstract methods have no body
- Child classes must implement all abstract methods
- Abstraction helps to hide implementation details
- Improves code structure and design

### Output:
Abstract method implementation executed successfully through child class object.

## Day 06: Interface & Multiple Inheritance

### Concepts Covered:
- Interface in Java
- Difference between Interface and Abstract Class
- `implements` keyword
- Multiple inheritance using interface
- 100% abstraction using interface
- Clean OOPS structure

### Example:
- Created an interface `Worker`
- Declared abstract methods inside the interface
- Created a `Student` class that implements `Worker`
- Implemented all interface methods in the class
- Demonstrated multiple inheritance using more than one interface

### Key Learnings:
- Interface supports 100% abstraction
- All methods in an interface are public and abstract by default
- A class can implement multiple interfaces
- `implements` keyword is used with interfaces
- Multiple inheritance is possible only through interfaces in Java
- Interfaces define **what to do**, not **how to do**

### Output:
Interface methods executed successfully through implementing class object.
