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

## Day 07: Polymorphism

### Concepts Covered:
- Polymorphism in Java
- Types of Polymorphism
  - Compile-time Polymorphism
  - Runtime Polymorphism
- Method Overloading
- Method Overriding
- Upcasting and Dynamic Method Dispatch

### Example:
- Created a `Person` parent class with a `work()` method
- Created a `Student` child class that overrides the `work()` method
- Demonstrated runtime polymorphism using parent class reference
- Created multiple methods with same name but different parameters to show method overloading

### Key Learnings:
- Polymorphism means one name, many forms
- Method overloading is compile-time polymorphism
- Method overriding is runtime polymorphism
- Parent class reference can refer to child class object
- The method call is resolved at runtime based on object type
- Polymorphism improves flexibility and scalability of code

### Output:
Correct method executed based on object type demonstrating polymorphism.

## Day 08: static, final & super Keyword

### Concepts Covered:
- `static` keyword in Java
- `final` keyword in Java
- `super` keyword
- Static variables and methods
- Final variables
- Calling parent class constructor and methods
- Relationship between parent and child class

### Example:
- Created a `Person` parent class
- Used a `static` variable to store common data shared by all objects
- Created a `Student` child class that extends `Person`
- Used `final` keyword to make a variable constant
- Used `super()` to call parent class constructor
- Used `super.method()` to call parent class method

### Key Learnings:
- `static` members belong to the class, not to individual objects
- All objects share the same static variable
- `final` variables cannot be changed once initialized
- `super` keyword is used to refer to parent class
- `super()` calls the parent class constructor
- `super.method()` calls the parent class method
- These keywords help in writing clean and structured OOPS code

### Output:
Program executed successfully showing the use of static, final, and super keywords.

## Day 09: Exception Handling

### Concepts Covered:
- Exception in Java
- Types of exceptions
- `try` block
- `catch` block
- Multiple catch blocks
- `finally` block
- Runtime exceptions

### Example:
- Performed a division operation
- Handled `ArithmeticException` using try-catch
- Used multiple catch blocks for better error handling
- Used `finally` block to execute important code

### Key Learnings:
- Exceptions prevent program from crashing
- `try` block contains risky code
- `catch` block handles exceptions
- Multiple catch blocks handle different exceptions
- `finally` block always executes
- Exception handling makes programs robust and reliable

### Output:
Exception handled successfully without program crash.

## Day 10: Custom Exception

### Concepts Covered:
- Custom exception in Java
- Creating user-defined exceptions
- `Exception` class
- `throw` keyword
- `throws` keyword
- Handling custom exceptions using try-catch

### Example:
- Created a custom exception class `InvalidAgeException`
- Extended the `Exception` class
- Used constructor to pass custom error message
- Used `throw` keyword to explicitly throw exception
- Used `throws` keyword to declare exception
- Handled custom exception using try-catch block

### Key Learnings:
- Java allows creating user-defined exceptions
- Custom exceptions help in handling application-specific errors
- `throw` is used to throw an exception manually
- `throws` is used to declare exceptions in method signature
- Custom exceptions improve code clarity and error handling
- Program continues execution after exception handling

### Output:
Custom exception handled successfully without crashing the program.

## Day 11: File Handling

### Concepts Covered:
- File handling in Java
- Writing data to a file
- Reading data from a file
- `FileWriter` class
- `FileReader` class
- Handling file-related exceptions
- `IOException`

### Example:
- Created a text file using `FileWriter`
- Wrote text data into the file
- Read the file content using `FileReader`
- Used try-catch blocks to handle file exceptions

### Key Learnings:
- Java supports file handling through `java.io` package
- `FileWriter` is used to write data into a file
- `FileReader` is used to read data from a file
- Files are created automatically if they do not exist
- File operations can throw `IOException`
- File handling is important for data storage and retrieval

### Output:
File created successfully, data written and read without errors.

## Day 12: Packages & Access Modifiers

### Concepts Covered:
- Package in Java
- Folder structure using packages
- Creating custom packages
- `package` keyword
- `import` statement
- Code organization using packages
- Access modifiers in Java
  - `public`
  - `private`
  - `protected`
- Package-level access control

### Example:
- Created a custom package `com.school.student`
- Created a `Student` class inside the student package
- Declared variables with different access modifiers:
  - `public String name`
  - `private int roll`
  - `protected int marks`
- Created another package `com.school.main`
- Created `Main` class inside main package
- Imported `Student` class using `import` statement
- Created `Student` object in `Main` class
- Accessed only allowed members based on access modifier rules
- Demonstrated how packages help in structuring large projects

### Key Learnings:
- Package is used to group related classes
- Package name should match the folder structure
- `package` statement must be the first line of a Java file
- `import` is used to access classes from other packages
- `private` members are accessible only within the same class
- `protected` members are accessible within the same package or subclass
- `public` members are accessible from anywhere
- Packages improve code organization, readability, and maintainability
- Proper package structure is important for real-world and enterprise projects

### Output:
Student details printed successfully using class imported from another package.

## Day 13: Multithreading Basics

### Concepts Covered:
- Multithreading in Java
- Process vs Thread
- Main thread
- Creating thread using `Thread` class
- Creating thread using `Runnable` interface
- `start()` vs `run()` method
- Thread life cycle (basic idea)
- Concurrent execution

### Example:
- Created a thread by extending the `Thread` class
- Overrode the `run()` method to define thread task
- Created another thread using `Runnable` interface
- Passed `Runnable` object to `Thread` constructor
- Started threads using `start()` method
- Observed parallel execution of multiple threads
- Printed thread names to understand execution flow

### Key Learnings:
- Multithreading allows multiple tasks to run simultaneously
- A process can contain multiple threads
- `main()` itself runs inside the main thread
- `run()` contains thread logic, but `start()` creates a new thread
- Calling `run()` directly does NOT create a new thread
- `Thread` class and `Runnable` interface are two ways to create threads
- Using `Runnable` is better as it supports multiple inheritance
- Multithreading improves performance and resource utilization
- Threads are heavily used in real-world applications like servers and games

### Output:
Multiple threads executed concurrently showing parallel task execution.
