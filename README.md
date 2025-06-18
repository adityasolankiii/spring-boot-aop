# Spring AOP Demo (Spring Boot 3.5 + Java 21)

This is a simple Spring Boot project that demonstrates **Spring AOP (Aspect-Oriented Programming)** using AspectJ annotations.

### ✅ Features
- Logs method execution using AOP
- Uses `@Aspect`, `@Before`, `@After`, and `@Around` annotations

---

## 🔧 Technologies Used
- Java 21
- Spring Boot 3.5.x
- Spring AOP
- Maven

---

## 📁 Project Structure

- spring-aop-demo/
- ├── aspect/
- │ └── LoggingAspect.java
- ├── service/
- │ └── DemoService.java
- ├── SpringAopDemoApplication.java
- └── application.properties

---

## ▶️ How to Run

1. Make sure Java 21 is installed
2. Clone the project
3. Open it in your IDE
4. Run the `SpringBootRestApplication` class

Or use terminal:
```bash
mvn spring-boot:run