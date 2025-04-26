# Spring Boot JDBC Project

This project is a simple **Spring Boot** application using **JDBC with MySQL** to perform basic CRUD operations on a `Consumer` entity.

## Project Overview

- **Framework**: Spring Boot
- **Database**: MySQL
- **Connection**: JDBC Template
- **Build Tool**: Maven

The application provides functionality to:
- Insert a new consumer record
- Update an existing consumer record
- Delete a consumer record
- Fetch a consumer by ID
- Fetch all consumer records

---

## Project Configuration

**application.properties**
```properties
spring.application.name=springboot.jdbc
server.port=8081

spring.datasource.name=d1
spring.datasource.url=jdbc:mysql://localhost:3306/firstdb
spring.datasource.username=root
spring.datasource.password=your password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update
spring.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
# spring.jpa.show-sql=true
```

---

## Project Structure

```plaintext
com.springboot.jdbc
│
├── Application.java          // Main entry point
├── Consumer.java              // Model class (POJO)
├── Consumer_Repository.java   // Repository class handling JDBC operations
```

---

## Running the Application

1. Make sure your MySQL server is running and the `firstdb` database exists.
2. Ensure you have a table `consumer` with the following structure:
   ```sql
   CREATE TABLE consumer (
     consumer_id INT,
     consumer_name VARCHAR(50),
     product_name VARCHAR(50)
   );
   ```
3. Build and run the application:
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```
4. The application will start at `http://localhost:8081`.

5. Inside `Application.java`, uncomment the relevant method calls to:
   - Insert
   - Update
   - Delete
   - Fetch by ID
   - Fetch all

---

## Example Output

```bash
Consumer [consumer_id=102, consumer_name=Bobby, product_name=Splendor]

Fetching started.................
Consumer [consumer_id=102, consumer_name=Bobby, product_name=Splendor]
Fetched
```

---

## Important Notes

- Make sure your MySQL username and password in `application.properties` are correct.
- Uncomment the required operation (Insert, Update, Delete) manually in the `main` method before running.

---

## This project is created for learning purpose

