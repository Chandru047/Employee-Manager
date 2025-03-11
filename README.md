# Employee Payroll System

A robust Java-based employee management application that allows for tracking, sorting, and managing employee records with payroll information.

## 📊 Overview

The Employee Payroll System provides an efficient command-line interface for managing employee data, including personal information, department assignments, and salary details. The application is built with a focus on data organization and accessibility, allowing for quick operations on employee records.

## ✨ Key Features

- **Employee Management**: Add, remove, and search for employees by ID
- **Advanced Sorting**: Order employees by name or salary
- **Data Organization**: Efficiently store employee information using HashMaps
- **Formatted Output**: Clean, formatted display of employee information including currency formatting
- **User-friendly Interface**: Simple command-line prompts guide users through all operations

## 🏗️ Architecture

The application follows a clean, modular design with clear separation of concerns:

### Class Structure

- **`Employee`**: Data model representing an employee with personal and payroll information
- **`EmployeeDatabase`**: Central data repository using a HashMap for efficient ID-based lookups
- **`EmployeeManager`**: Core business logic for employee operations and user interaction
- **`Main`**: Entry point for the application

### Component Diagram

```
┌─────────────┐      ┌──────────────────┐      ┌───────────────────┐
│    Main     │─────▶│  EmployeeManager │─────▶│  EmployeeDatabase │
└─────────────┘      └──────────────────┘      └───────────────────┘
                              │                          │
                              ▼                          ▼
                     ┌──────────────────┐      ┌───────────────────┐
                     │  User Interface  │      │      Employee     │
                     └──────────────────┘      └───────────────────┘
```

## 📋 Functionality Details

### Employee Operations

- **Add Employees**: Register new employees with ID, name, department, and salary
- **Remove Employees**: Delete employee records by ID
- **Search Employees**: Find employees by ID with detailed information display
- **Sort Employees**: View employees sorted by name (alphabetically) or salary (highest to lowest)

### Data Management

- Uses a HashMap for O(1) lookup performance on employee records
- Maintains consistent data representation with immutable employee properties
- Supports exporting sorted employee lists for reporting

## 🚀 Installation

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Command-line interface

### Setup

1. Clone this repository:
   ```bash
   git clone https://github.com/yourusername/employee-payroll.git
   cd employee-payroll
   ```

2. Compile the Java files:
   ```bash
   javac Main.java EmployeeManager.java Employee.java EmployeeDatabase.java
   ```

## 💻 Usage

1. Run the application:
   ```bash
   java Main
   ```

2. Follow the interactive prompts to manage employee records:
   - Use menu options to select operations
   - Enter employee details as requested
   - View formatted results

### Main Menu Options

```
------------------------------
Welcome to the Employee Payroll System
Available options are listed below
1.Add  2.Remove  3.Search  4.Sort  5.Exit
```

## 📊 Data Model

### Employee Properties

| Property   | Type   | Description                               |
|------------|--------|-------------------------------------------|
| id         | int    | Unique employee identifier                |
| name       | String | Employee's full name                      |
| salary     | double | Employee's salary (stored as raw amount)  |
| department | String | Department assignment                     |

## 🧩 Code Structure

```
employee-payroll/
├── Employee.java          # Employee data model
├── EmployeeDatabase.java  # Data storage and management
├── EmployeeManager.java   # Business logic and UI operations
├── Main.java              # Application entry point
└── README.md              # Project documentation
```

## 🔍 Key Methods

| Class            | Method        | Description                                   |
|------------------|---------------|-----------------------------------------------|
| EmployeeManager  | add()         | Adds a new employee to the database           |
| EmployeeManager  | remove()      | Removes an employee by ID                     |
| EmployeeManager  | search()      | Searches for an employee by ID                |
| EmployeeManager  | sort()        | Sorts employees by name or salary             |
| EmployeeDatabase | getMap()      | Returns the HashMap of employee records       |
| Employee         | toString()    | Formats employee data for display             |

## 🛠️ Technical Implementation

### Notable Features

- **Comparators**: Custom comparators for sorting employees by different criteria
- **Lambda Expressions**: Modern Java syntax for creating comparators
- **Collections Framework**: Efficient use of HashMaps and ArrayLists
- **String Formatting**: Currency formatting for salary display
- **Immutable Objects**: Employee objects with final fields for data integrity
