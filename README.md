# 🩺 **DocDirect - Microservice Architecture**

[![Java](https://img.shields.io/badge/Java-21-orange?logo=openjdk)](https://openjdk.org/projects/jdk/21/)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-brightgreen?logo=springboot)](https://spring.io/projects/spring-boot)
[![PostgreSQL](https://img.shields.io/badge/PostgreSQL-Database-blue?logo=postgresql)](https://www.postgresql.org/)
[![Docker](https://img.shields.io/badge/Docker-Ready-blue?logo=docker)](https://www.docker.com/)
[![Kubernetes](https://img.shields.io/badge/Kubernetes-Kompose-326CE5?logo=kubernetes)](https://kompose.io/)
[![Kafka](https://img.shields.io/badge/Apache_Kafka-Enabled-black?logo=apachekafka)](https://kafka.apache.org/)
[![gRPC](https://img.shields.io/badge/gRPC-Protobuf-5c9dff?logo=googlecloud)](https://grpc.io/)
[![CI/CD](https://img.shields.io/badge/GitHub_Actions-Integration-blue?logo=githubactions)](https://github.com/features/actions)
[![License](https://img.shields.io/badge/License-MIT-yellow?logo=open-source-initiative)](LICENSE)

---

### 🧠 Overview

**DocDirect** is a **healthcare management platform** built using **microservice architecture**, enabling modular, scalable, and secure communication between multiple independent services.  
It integrates **Spring Cloud Gateway**, **Kafka**, **gRPC**, and **PostgreSQL** to deliver high-performance healthcare solutions.

---

## 🧱 Monorepo Structure

DocDirect-microservice/

1. .github/workflows/ # CI/CD workflows (GitHub Actions)
2. analytics-service/ # Handles analytics and reports
3. api-gateway/ # Central routing using Spring Cloud Gateway
4. api-requests/ # API aggregation & forwarding
5. auth-service/ # JWT Authentication & Validation
6. billing-service/ # Billing and payment module
7. patient-service/ # Manages patient data
8. ocdirect-k8s/ # Kubernetes manifests (Kompose generated)
9. infrastructure/ # LocalStack AWS setup (S3, SNS, etc.)
10. integration-tests/ # Inter-service & gRPC integration tests
11. docker-compose.yml # Local orchestration
12. .gitignore
13. README.md

---

---

## ⚙️ **Tech Stack**

| Category | Technology |
|-----------|-------------|
| **Language** | Java 21 |
| **Framework** | Spring Boot |
| **Gateway** | Spring Cloud Gateway |
| **Security** | JWT Authentication, Validation |
| **Communication** | gRPC, Protobuf |
| **Messaging** | Apache Kafka |
| **Database** | PostgreSQL, H2 (for tests) |
| **Infrastructure** | LocalStack (AWS simulation) |
| **Containerization** | Docker, Docker Compose |
| **Orchestration** | Kubernetes via Kompose |
| **Documentation** | Swagger / OpenAPI |
| **Testing** | JUnit |
| **CI/CD** | GitHub Actions (Integration only) |

---

## 🚀 **Key Features**

✅ Modular microservice architecture  
✅ JWT-secured authentication  
✅ Kafka-based asynchronous messaging  
✅ gRPC for inter-service communication  
✅ Centralized routing via Spring Cloud Gateway  
✅ Dockerized setup with Compose orchestration  
✅ Kubernetes-ready (Kompose manifests)  
✅ LocalStack for AWS emulation  
✅ Swagger for API documentation  
✅ JUnit + H2 for lightweight testing  
✅ CI/CD with GitHub Actions (integration workflow)

---

## 🧩 **Microservices Breakdown**

| Service | Purpose |
|----------|----------|
| 🧑‍⚕️ **Auth Service** | Handles user authentication and JWT issuance |
| 💳 **Billing Service** | Manages payment operations and invoices |
| 📊 **Analytics Service** | Generates insights and reports |
| 👥 **Patient Service** | Manages patient data and profiles |
| 🚪 **API Gateway** | Routes incoming requests to appropriate services |
| 🌐 **API Requests** | Centralized request aggregator |
| 🧪 **Integration Tests** | Ensures inter-service functionality |
| ☁️ **Infrastructure** | Local AWS environment using LocalStack |

---

## 🐳 **Setup & Installation**

### 1️⃣ Clone the Repository
```bash
git clone https://github.com/your-username/DocDirect-microservice.git
cd DocDirect-microservice
```

2️⃣ Run Locally with Docker Compose
```bash
This command - docker-compose up --build
starts:
PostgreSQL
Kafka Broker
All microservices (Auth, Billing, Patient, Analytics, etc.)
API Gateway
```

3️⃣ Access Swagger UI
Each microservice provides Swagger documentation at:
```bash
http://localhost:<Api-Gateway-port>/api-docs/..
```

4️⃣ Deploy to Kubernetes (Optional)
```bash
cd docdirect-k8s
kubectl apply -f .
```

🧪 Testing

Each service includes unit and integration tests using:

🧰 JUnit 5

🧠 H2 Database (in-memory)

🔗 gRPC / Kafka mocks

Run integration tests:
```bash
cd integration-tests
mvn test
```
---

🔄 CI/CD Pipeline

GitHub Actions workflow includes:

🏗️ Build and Test for each service

🔍 Integration verification

⚙️ No production deployment (integration-only)

File: .github/workflows/<file>.yml
---

🧑‍💻 Development Notes

Protobuf defines cross-service data contracts.

Kafka enables event-driven asynchronous processing.

gRPC ensures efficient binary communication.

Validation ensures consistent and secure data flow.

Docker + Compose simplifies local orchestration.

---

🤝 Contributing

Contributions, bug reports, and ideas are always welcome 💡
Please fork the repo and open a PR to suggest improvements.
---

🧑‍💻 Author

Ayush Gupta
💼 GitHub: https://github.com/Brew-and-Bugs-with-Ayush

🌐 LinkedIn: https://www.linkedin.com/in/ayush-gupta004

📧 Email: ayushgupta.Codex@gmail.com

📝 License

This project is licensed under the MIT License — feel free to use, learn, and build upon it.

---

🌟 Support

If you find this project helpful, please ⭐ star the repository — it helps others discover it and motivates continued development!

“Code. Build. Flow. — That’s DocDirect-microservice.” 🚀
