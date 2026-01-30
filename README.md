# OOPSBannerApp

## Overview

**OOPSBannerApp** is a Java console application that demonstrates the **step-by-step evolution of clean, maintainable, and extensible code** by rendering the word **“OOPS”** as an ASCII banner.

The project progresses through multiple **Use Cases (UC1–UC8)**, where each use case incrementally refactors the code using **core Java concepts and Object-Oriented Programming (OOP) principles**.

This repository is ideal for:
- Java learners
- Understanding refactoring techniques
- Practicing OOP design principles
- Academic reviews and interviews

---

## Learning Objectives

- Understand Java program structure and execution
- Learn ASCII art rendering using strings
- Apply refactoring for readability and performance
- Use arrays, loops, methods, classes, and collections
- Apply core OOP principles and clean-code practices

---

## Use Case Evolution

### UC1: Print OOPS to Console
- Prints the text `"OOPS"` using `System.out.println()`
- Introduces Java class structure and `main()` method

---

### UC2: Render OOPS as Banner using Print Statements
- Uses ASCII art with `*` and spaces
- Prints each line individually
- Introduces string concatenation using `+`

---

### UC3: Render Banner using `String.join()`
- Replaces `+` operator with `String.join()`
- Improves memory efficiency
- Reduces intermediate `String` object creation

---

### UC4: Store Banner Lines in String Array and Loop
- Stores banner lines in a `String[]`
- Uses loops to print output
- Eliminates repetitive `println()` calls

---

### UC5: Inline Array Initialization
- Combines array declaration and initialization
- Improves code conciseness and readability

---

### UC6: Refactor Banner Logic into Helper Methods
- Introduces static helper methods for characters (`O`, `P`, `S`)
- Applies **DRY (Don’t Repeat Yourself)** principle
- Improves modularity and reusability

---

### UC7: Store Character Pattern in a Class
- Introduces a `CharacterPattern` inner static class
- Encapsulates character and its banner pattern
- Uses `StringBuilder` for efficient string construction
- Demonstrates key OOP principles:
    - Encapsulation
    - Abstraction
    - Single Responsibility Principle

---

### UC8: Use Map for Character Patterns and Render via Function
- Uses `HashMap<Character, String[]>` for centralized pattern storage
- Dynamic banner rendering using lookup
- Highly extensible and scalable design
- Clean separation of pattern storage and rendering logic

---
