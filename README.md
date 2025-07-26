```markdown
# 🎓 Student Management System (Java + MySQL)

A simple **console-based Java application** to manage student records using **MySQL database**.  
You can **add**, **view**, and **delete** student details through a menu-driven program.

---

## 🚀 Features

- ✅ Add Student (name, email, course)
- 📄 View All Students
- ❌ Delete Student by ID
- 💾 Data stored permanently in MySQL

---

## 💻 Technologies Used

- Java (JDK 17 or later)
- MySQL Server
- JDBC (MySQL Connector)
- Windows Command Prompt / VS Code Terminal

---

## 📁 Project Structure

```

StudentManagementSystem/
├── DBConnection.java         # Handles MySQL connection
├── Main.java                 # Main class with menu logic
├── Student.java              # Student entity/model
├── StudentDAO.java           # Data Access Object for DB operations
├── student\_db.sql            # SQL script to create DB and table
└── lib/
└── mysql-connector-j-<version>.jar   # JDBC driver

````

---

## 🛠️ Setup Instructions

### ✅ Prerequisites

- Java JDK installed (https://www.oracle.com/java/technologies/javase-downloads.html)
- MySQL installed and running
- MySQL Connector JAR file downloaded (already in `lib/` folder)

---

### 🔧 Step-by-Step Guide

1. **Create the Database and Table**

   Open MySQL Workbench or CLI and run this SQL:

   ```sql
   CREATE DATABASE student_db;

   USE student_db;

   CREATE TABLE students (
       id INT PRIMARY KEY AUTO_INCREMENT,
       name VARCHAR(100),
       email VARCHAR(100),
       course VARCHAR(50)
   );
````

2. **Compile Java Files**

   Open Command Prompt inside the project folder:

   ```bash
   javac -encoding UTF-8 -cp "lib\mysql-connector-j-*.jar" *.java
   ```

3. **Run the Application**

   ```bash
   java -cp ".;lib\mysql-connector-j-*.jar" Main
   ```

   **Note for VS Code Users:**
   You can also run directly from VS Code terminal using the same commands.

---

## 🧪 Sample Menu Output

```
=== Student Management System ===
1. Add Student
2. View All Students
3. Delete Student
4. Exit
Choose option:
```

---

## 📌 Notes

* ⚠️ Update your `DBConnection.java` with your actual MySQL username & password:

  ```java
  String url = "jdbc:mysql://localhost:3306/student_db";
  String user = "root";
  String password = "your_password";
  ```

* Make sure MySQL service is running before executing Java code.

* If you face `ClassNotFoundException`, ensure the JAR path is correct in the classpath.

---

## 🙋‍♀️ Developed By

**Gopika Ganesan**
A simple academic project built with love using Java and MySQL.

```

