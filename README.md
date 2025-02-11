# Spring Boot ActiveMQ Integration 🚀

This project demonstrates how to integrate **ActiveMQ** with a **Spring Boot** application to send and receive JSON messages via a message queue.

---

## 📌 Features
- ✅ Send JSON messages to an ActiveMQ queue (`payment-status-queue`).
- ✅ REST API to trigger message sending.
- ✅ Uses **Spring Boot Starter ActiveMQ** for seamless integration.
- ✅ Configurable via `application.properties`.
- ✅ Supports message transformation using **Jackson**.

---

## 🛠️ Technologies Used
- **Spring Boot 3.x**
- **ActiveMQ**
- **Spring JMS**
- **REST API (Spring Web)**
- **Jackson for JSON processing**

---

## 🚀 Getting Started

### 🔹 Prerequisites
Before running this project, ensure you have:
1. **Java 17+** installed ([Download Java](https://adoptium.net/))
2. **Apache ActiveMQ** installed ([Download ActiveMQ](http://activemq.apache.org/components/classic/download/))
3. **Maven 3.8+** installed ([Download Maven](https://maven.apache.org/download.cgi))

---

### 🔹 Setup ActiveMQ
1. **Download & Extract ActiveMQ** from the [official website](http://activemq.apache.org/components/classic/download/).
2. **Start ActiveMQ Broker**:
   ```sh
   cd apache-activemq-<version>/bin
   ./activemq start  # Mac/Linux
   activemq start    # Windows
### 🔹 Screenshot of implementation check -ActiveMQ

![Screenshot 2025-02-11 233133](https://github.com/user-attachments/assets/51258150-365f-4fb1-8c5c-78a65acda0a2)
![Screenshot 2025-02-11 233142](https://github.com/user-attachments/assets/d5ee8411-231f-4a69-a416-3dc098b333a3)
![Screenshot 2025-02-11 233215](https://github.com/user-attachments/assets/fea4abd2-6483-4c0c-afe0-cfc1a03b94e5)
![Screenshot 2025-02-11 234506](https://github.com/user-attachments/assets/404eddd6-3540-4ec1-bf18-1a441ee5d751)
![Screenshot 2025-02-11 234747](https://github.com/user-attachments/assets/76b5b4d7-8be6-412c-8043-bc587f124513)




