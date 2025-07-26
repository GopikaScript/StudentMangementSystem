```markdown
# Student Management System (Java + MySQL)

This is a simple **Student Management System** built using Java and MySQL. It allows users to:

- Add student details
- View all students
- Delete a student

## 🔧 Technologies Used

- Java (Core)
- MySQL (Database)
- JDBC (Java Database Connectivity)
- Command-line interface (CLI)

## 📁 Project Structure

```

StudentManagement/
│
├── lib/
│   └── mysql-connector-j-9.4.0.jar
│
├── Main.java
├── Student.java
├── StudentDAO.java
├── DBConnection.java
├── student\_db.sql
└── README.md

````

## 🛠 How to Run

### 1. Prerequisites
- Java must be installed and configured (JDK 17 or later recommended).
- MySQL must be installed and running.
- Make sure `mysql-connector-j-9.4.0.jar` is in the `lib/` folder.

### 2. Setup Database

Run the following SQL script in MySQL:

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

### 3. Compile

```bash
javac -encoding UTF-8 -cp "lib/mysql-connector-j-9.4.0.jar" *.java
```

### 4. Run

```bash
java -cp ".;lib/mysql-connector-j-9.4.0.jar" Main
```

---

## 📦 MySQL JDBC Driver

This project uses the `mysql-connector-j-9.4.0.jar` to establish JDBC connections with the MySQL database.

* Make sure this file is placed in the `lib/` folder.
* During compilation and execution, it is referenced using the `-cp` (classpath) option.

> ⚠️ Do not modify or open this `.jar` file. It is a pre-built library from the official MySQL site.

🔗 [Download MySQL Connector/J](https://dev.mysql.com/downloads/connector/j/)

---

## 💡 Author

Made with ❤️ by Gopika Ganesan

