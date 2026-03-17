# Hibernate Many-to-Many Mapping (Student ↔ Courses)

This project demonstrates a **Many-to-Many relationship** using Hibernate ORM with a real-world example of **Students and Courses**, built using **Maven** and connected to a **MySQL database**.

---

## 🚀 Tech Stack

* Java 17
* Hibernate ORM (6.4.4.Final)
* MySQL
* Maven

---

## 📌 Key Concepts Covered

* Many-to-Many Mapping using `@ManyToMany`
* Use of `Set` to avoid duplicate relationships
* Hibernate Session & Transaction Management
* Cascade operations (`CascadeType.ALL`)
* Automatic schema update (`hbm2ddl.auto=update`)
* Maven dependency management

---

## 🧠 Problem Statement

A student can enroll in multiple courses, and a course can be taken by multiple students.

---

## 🏗️ Project Structure

```
hibernate-many-to-many-mapping/
│
├── src/main/java/com/isha/
│   ├── app/
│   │   └── LaunchStandardApp.java
│   └── model/
│       ├── Students.java
│       └── Courses.java
│
├── src/main/resources/
│   └── hibernate.cfg.xml
│
└── pom.xml
```

---

## 🔗 Entity Mapping

### Student Entity

* `student_id`
* `student_name`
* Set of Courses

### Course Entity

* `course_id`
* `course_name`
* `course_price`

### Relationship

* Many Students ↔ Many Courses
* Managed using `@ManyToMany`
* Hibernate internally creates a **join table**

---

## ⚙️ Maven Dependencies

```xml
<dependencies>
    <dependency>
        <groupId>org.hibernate.orm</groupId>
        <artifactId>hibernate-core</artifactId>
        <version>6.4.4.Final</version>
    </dependency>

    <dependency>
        <groupId>com.mysql</groupId>
        <artifactId>mysql-connector-j</artifactId>
        <version>8.3.0</version>
    </dependency>
</dependencies>
```

---

## ▶️ How to Run

1. Clone the repository

2. Create MySQL database:

```sql
CREATE DATABASE hibernate_many_to_many_mapping;
```

3. Update DB credentials in `hibernate.cfg.xml`

4. Build the project:

```bash
mvn clean install
```

5. Run the application:

* Execute `LaunchStandardApp.java`

---

## 📊 Sample Data

| Student | Courses                  |
| ------- | ------------------------ |
| Isha    | Java, Hibernate, Servlet |
| Mohit   | Java, Hibernate          |
| Kunal   | Java, Hibernate, Servlet |

---

## 👩‍💻 Author

Isha Parihariya
B.Tech CSE Student | Aspiring Java Backend Developer

---
