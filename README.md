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
