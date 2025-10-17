# Spring Boot Student Management Project

## Project Overview
This is a simple **Student Management System** built using **Spring Boot** for the backend and a basic HTML page for the frontend.  
It allows you to **add, fetch, update, and delete students** with their details.

---

## Technologies Used
- **Backend:** Spring Boot, Java, Maven  
- **Frontend:** HTML, CSS, JavaScript (static page)  
- **Database:** H2 (in-memory) or MySQL (optional)  
- **Version Control:** Git, GitHub  

---

## Project Setup

### 1. Clone the Repository
```bash
git clone https://github.com/poojabhore12/Fullstack-java-assignment.git
cd Fullstack-java-assignment

### 2. Build the Project
mvn clean install

### 3. Configure Database (Optional)
### By default, H2 in-memory database is used.
### For MySQL, update src/main/resources/application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update

### Running the Backend
### Run the Spring Boot application: mvn spring-boot:run


