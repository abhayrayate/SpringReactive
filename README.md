# ⚡ Spring Reactive MongoDB Application

A **Spring Boot Reactive** application built using **Spring WebFlux**, **Project Reactor**, and **Reactive MongoDB**.  
This project demonstrates how to build a **non-blocking**, **asynchronous**, and **scalable REST API** using **Mono** and **Flux** types.

---

## 🧩 Features
- Reactive REST APIs using **Spring WebFlux**
- **Non-blocking CRUD** operations with MongoDB
- Uses **Project Reactor** (`Mono`, `Flux`)
- Integration with **ReactiveMongoRepository**
- Simple JSON-based API for Customer data

---

## ⚙️ Tech Stack
- **Java 17+**
- **Spring Boot 3+**
- **Spring WebFlux**
- **Spring Data Reactive MongoDB**
- **Project Reactor**
- **Lombok**
- **Maven**

---

## 📁 Project Structure

```
src/main/java/in/abhayit/
│
├── Controller/
│   └── CustomerReactiveController.java
│
├── Entity/
│   └── CustomerMongo.java
│
└── Repository/
    └── CustRepo.java
```

---

## 🧠 Reactive Concepts Used

| Type | Description |
|------|--------------|
| `Mono<T>` | Represents 0 or 1 element (single result) |
| `Flux<T>` | Represents 0 to many elements (stream of data) |

---

## 📘 API Endpoints

### ➕ Save Customer
**POST** `/saveAll`  
Request Body:
```json
{
  "firstName": "Abhay",
  "lastName": "Rayate",
  "email": "abhay@example.com",
  "password": "12345",
  "contactId": 9876543210
}
```
Response:
```json
{
  "id": "64bce4f8a4f5e55f7c9d9e6c",
  "firstName": "Abhay",
  "lastName": "Rayate",
  "email": "abhay@example.com",
  "password": "12345",
  "contactId": 9876543210
}
```

---

### 📄 Get All Customers
**GET** `/getallCustomer`

Response:
```json
[
  {
    "id": "64bce4f8a4f5e55f7c9d9e6c",
    "firstName": "Abhay",
    "lastName": "Rayate",
    "email": "abhay@example.com",
    "password": "12345",
    "contactId": 9876543210
  }
]
```

---

## ⚙️ Configuration

`application.properties`
```properties
spring.application.name=SpringReactive
server.port=1122
spring.data.mongodb.uri=mongodb://localhost:27017/cutomerMongo
```

> ⚠️ Make sure MongoDB is running locally on **port 27017** before starting the app.

---

## 🚀 Run the Project

### ▶️ Using Maven
```bash
mvn spring-boot:run
```

### ▶️ Or from IDE
Right-click on `SpringReactiveApplication.java` → **Run As → Java Application**

Access API at:  
👉 `http://localhost:1122/getallCustomer`  
👉 `http://localhost:1122/saveAll`

---

## 📚 Learning Outcome
By exploring this project, you’ll learn:
- How to create **Reactive REST APIs** using **Spring WebFlux**
- How **Mono** and **Flux** handle asynchronous data streams
- How to integrate **Reactive MongoDB** with Spring Boot

---

## 🧑‍💻 Author
**Abhay Rayate**  
💡 Passionate Java Developer | Learning Spring Reactive & Microservices  

---

## 📄 License
This project is open source and available under the [MIT License](LICENSE).
