EasyCRUD - Student Registration System (DevOps Project)

## 📖 About the Project

This project demonstrates how to take a full-stack application (React frontend + Spring Boot backend) and productionize it using DevOps practices.

The application allows students to register with basic details. For simplicity, the backend uses in-memory storage (no external DB), making it lightweight for DevOps demonstrations.

The goal of this project is to showcase end-to-end DevOps workflows:

- Cloning and preparing application code
- Writing Dockerfiles for frontend and backend
- Building and pushing Docker images to Docker Hub
- Writing Kubernetes manifests (deployments, services, ingress)
- Deploying to a Kubernetes cluster with ingress routing
- Preparing the foundation for CI/CD (Jenkins/GitHub Actions)

## ✨ Features

- Full-stack app (React + Spring Boot)
- Containerized using Docker
- Images pushed to Docker Hub
- Multi-service orchestration with Kubernetes
- Ingress routing (/ → frontend, /api → backend)
- Easily extendable for CI/CD pipelines


## 📂 Project Structure
```
easycrud-devops/
│── app/
│   ├── frontend/                 # React frontend code
│   ├── backend/                  # Spring Boot backend code
│
│── docker/                       # Dockerfiles and Compose
│   ├── frontend.Dockerfile
│   ├── backend.Dockerfile
│   ├── docker-compose.yml
│
│── k8s/                          # Kubernetes manifests
│   ├── frontend-deployment.yml
│   ├── backend-deployment.yml
│   ├── frontend-service.yml
│   ├── backend-service.yml
│   ├── ingress.yml
│
│── ci-cd/                        # (future) Jenkins / GitHub Actions pipeline
│
│── README.md                     # Documentation


```
<!-- │── .env.example                  # Example environment variables -->



## ⚙️ Prerequisites

- Git – to clone repository
- Docker – for building & running containers
- Docker Hub account – for pushing images
- Kubernetes cluster – Minikube, Kind, or AWS EKS
- Kubectl – CLI to interact with K8s
- Ingress Controller – NGINX ingress controller installed in cluster

## 🔄 Flow of the Project
#### 1. Clone Application Repository

```bash
git clone https://github.com/your-username/easycrud-devops.git
cd easycrud-devops
```

#### 2. Dockerize Application

- Created separate Dockerfiles for frontend & backend
- Example build command:
```bash
docker build -t <dockerhub-username>/easycrud-frontend:latest -f docker/frontend.Dockerfile .
docker build -t <dockerhub-username>/easycrud-backend:latest -f docker/backend.Dockerfile .

```

#### 3. Push to Docker Hub
```bash
docker push <dockerhub-username>/easycrud-frontend:latest
docker push <dockerhub-username>/easycrud-backend:latest
```

#### 4. Containerize with Kubernetes

Created deployments, services, and ingress
```bash

```

#### 5. Ingress Routing

- `/` → Frontend (React)

- `/api` → Backend (Spring Boot)

#### 6. Access Application

- Frontend: `http://<Ingress-dns>/`

- Backend API: `http://<ingress-dns>/api`