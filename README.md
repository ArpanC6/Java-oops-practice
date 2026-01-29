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

## Day 14: Collections Framework (List, Set, Map)

### Concepts Covered:
- Java Collections Framework
- Difference between Array and Collection
- List Interface
- Set Interface
- Map Interface
- ArrayList
- HashSet
- HashMap
- Iterating collections using loop


### List Interface (ArrayList)

- Allows duplicate elements
- Maintains insertion order
- Index-based access

### Example:
- Stored student names using ArrayList
- Printed elements using loop


### Set Interface (HashSet)

- Does not allow duplicate elements
- No guaranteed order

### Example:
- Stored unique numbers using HashSet
- Demonstrated duplicate removal


### Map Interface (HashMap)

- Stores data in key-value pairs
- Keys are unique
- Values can be duplicated

### Example:
- Stored roll number as key and name as value
- Retrieved data using keys


### Key Learnings:
- Collections are dynamic (size can grow/shrink)
- ArrayList is best when duplicates and order matter
- HashSet is used when uniqueness is required
- HashMap is used for fast key-value access
- Collections reduce coding complexity
- Widely used in real-world Java applications


### Output:
All collection operations executed successfully.

## Day 15: Generics & Iterator

### Concepts Covered:
- Generics in Java
- Type safety
- Generic methods
- Generic classes
- Iterator interface
- Iterating collections safely

### Example:
- Created generic method to print any data type
- Created a generic class using type parameter
- Used ArrayList with Iterator
- Traversed collection using Iterator

### Key Learnings:
- Generics provide compile-time type safety
- Generics reduce ClassCastException
- Generic classes can work with any data type
- Iterator is used to traverse collections safely
- Iterator supports hasNext() and next()
- Iterator is useful when modifying collections during traversal
- Generics and Iterator are heavily used in Java frameworks

### Output:
Generic methods, generic classes, and iterator traversal executed successfully.

## Day 16: Comparable & Comparator

### Concepts Covered:
- Comparable interface
- Comparator interface
- Natural sorting
- Custom sorting logic
- Collections.sort()

### Example:
- Created Student class implementing Comparable
- Sorted students by ID using compareTo()
- Used Comparator to sort by Name and Marks
- Demonstrated multiple sorting strategies

### Key Learnings:
- Comparable provides default sorting
- Comparator provides flexible custom sorting
- compareTo() is inside the class
- compare() is outside the class
- Used in real-world collection sorting

### Output:
Student objects sorted successfully using Comparable and Comparator.

## Day 17: Lambda Expression & Functional Interface

### Concepts Covered:
- Functional Interface
- @FunctionalInterface annotation
- Lambda Expression
- Anonymous function
- Cleaner & shorter syntax

### What I Did:
- Created a functional interface with a single abstract method
- Implemented the interface using lambda expression
- Executed method without creating a separate class

### Key Learnings:
- Functional interface contains only one abstract method
- Lambda expression removes boilerplate code
- Lambda improves readability and performance
- Used mostly in Java 8+ features (Streams, Collections)

### Output:
Hello from Lambda Expression!

## Day 18: Java Stream API

### Concepts Covered:
- Stream API
- filter()
- map()
- forEach()
- sorted()
- count()

### What I Did:
- Created a list of integers
- Used stream to filter even numbers
- Transformed data using map()
- Sorted elements using sorted()
- Counted elements based on condition

### Key Learnings:
- Stream works with collections
- Stream does not modify original data
- filter is used for condition checking
- map is used for transformation
- forEach is used for iteration
- Stream makes code clean and readable

### Output:
Even numbers, squares, sorted list and count printed successfully.

## Day 19: Optional Class in Java

### Concepts Covered:
- Optional class introduction
- Avoiding NullPointerException
- Optional.of()
- Optional.ofNullable()
- Optional.empty()
- isPresent()
- ifPresent()
- orElse()
- orElseThrow()

### Example:
- Created a Student class
- Wrapped objects using Optional
- Handled null values safely
- Used different Optional methods to access data

### Key Learnings:
- Optional is used to avoid null checks
- It makes code clean and readable
- Prevents NullPointerException
- orElse provides default value
- orElseThrow throws exception if value absent

### Output:
Program executed successfully with safe null handling using Optional class.

## Day 20: Optional & Date-Time API

### Concepts Covered:
- Optional class
- Avoiding NullPointerException
- LocalDate, LocalTime, LocalDateTime
- DateTimeFormatter
- Java 8 Date-Time API

### Key Learnings:
- Optional prevents null-related runtime errors
- Cleaner and safer code
- Java Date Time API is immutable and thread-safe
- Used widely in real-world backend projects

### Output:
- Optional values handled safely
- Current date and time printed in formatted style

## Day 21: JDBC Basics (Concept Demonstration)

### Purpose
This module demonstrates how JDBC works in Java
without establishing a real database connection.

### Concepts Explained
- JDBC Architecture
- DriverManager & Connection
- Statement & SQL execution
- ResultSet processing

### Why No Real DB?
- Focus on understanding JDBC flow
- Clean conceptual explanation
- Easy to read for beginners and recruiters

### SQL Example
SELECT id, name, marks FROM students;

# Day 22: PreparedStatement & SQL Injection

## Concepts Covered
- SQL Injection
- Problem with Statement
- PreparedStatement basics
- INSERT and UPDATE queries
- Query parameterization

## Key Learnings
- Statement is unsafe for user input
- PreparedStatement prevents SQL Injection
- Uses placeholders (?)
- Improves security and performance

## SQL Examples
INSERT INTO students (id, name, marks) VALUES (?, ?, ?);
UPDATE students SET marks = ? WHERE id = ?;

# Day 23: JDBC CRUD Operations (A to Z)

## Concepts Covered
- CRUD operations
- JDBC backend flow
- PreparedStatement usage
- INSERT, SELECT, UPDATE, DELETE

## CRUD Meaning
- Create  → INSERT
- Read    → SELECT
- Update  → UPDATE
- Delete  → DELETE

## Key Learnings
- CRUD is backbone of backend development
- PreparedStatement is used for all operations
- JDBC CRUD is base of Spring Boot + JPA

## Use Cases
- Student management system
- Admin dashboards
- Backend APIs

# Day 24: JDBC Mini Project – Student Management System

## Project Overview
A conceptual JDBC-based backend mini project
demonstrating real-world architecture.

## Layers Used
- Model
- DAO
- Service
- Utility
- Main Application

## Features
- Add student
- View students
- Update marks
- Delete student

## Key Learnings
- DAO pattern
- Layered architecture
- JDBC CRUD flow
- Foundation for Spring Boot & JPA

# Day 25: DAO Pattern (A to Z)

## What is DAO?
DAO (Data Access Object) separates database logic
from business logic.

## Why DAO Pattern?
- Clean code
- Loose coupling
- Easy testing
- Easy migration (JDBC → Hibernate/JPA)

## Layers
- Model
- DAO
- Service
- Controller (MainApp)

## Interview Points
- DAO hides DB implementation
- Service handles business logic
- Used in almost all enterprise apps

# Day 26: JDBC to Spring Boot Transition

## Purpose
Understand how JDBC-based backend architecture
maps to Spring Boot.

## Key Learnings
- Why Spring Boot is used
- Layer mapping from JDBC to Spring
- Role of Controller, Service, Repository
- Annotation-based backend development

## Outcome
Ready to start real Spring Boot development.

# Day 27: Spring Boot Core Annotations

## Concepts Covered
- Bootstrapping annotations
- Entity & ORM annotations
- Repository, Service, Controller
- Request mapping annotations
- Dependency Injection

## Key Learnings
- Annotations reduce boilerplate code
- Layer-based annotations improve structure
- Spring handles object creation automatically

## Outcome
Ready to build REST APIs using Spring Boot.

# Day 28: REST API Design (Spring Boot)

## Concepts Covered
- REST architecture
- HTTP methods
- CRUD to REST mapping
- Controller design
- Request & Response handling

## Endpoints Designed
- GET /students
- GET /students/{id}
- POST /students
- PUT /students/{id}
- DELETE /students/{id}

## Key Learnings
- REST APIs are backbone of backend systems
- Controller handles HTTP layer
- Clean separation of layers

## Outcome
Ready to build real REST APIs using Spring Boot.

# Day 29: Exception Handling in Spring Boot

## Concepts Covered
- Exception basics
- Custom exceptions
- Global exception handling
- @ControllerAdvice
- @ExceptionHandler

## Key Learnings
- Never expose stack trace to client
- Use meaningful error messages
- Centralized error handling is industry standard

## Outcome
Able to build robust, production-ready REST APIs.

## Day 30: SOLID Principles in Java

Concepts Covered:
- Single Responsibility Principle
- Open/Closed Principle
- Liskov Substitution Principle
- Interface Segregation Principle
- Dependency Inversion Principle

Key Learnings:
- Clean and maintainable OOPS design
- Real-world Java architecture basics
- Important for backend & interviews
