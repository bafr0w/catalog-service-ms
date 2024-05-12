# catalog-service-ms

A cloud native spring boot microservice application. The catalog service of the Gye Nyame BookShop application. This is a prototype of the project.

## Requirements

- JDK 21
- Spring boot 3.2.5
- Gradle
- Docker
- Kubernetes

### To Test
```
./gradlew test
```
### To Run
```
./gradlew bootRun
```
### To Build Docker Image using Cloud Native Buildpacks
```
./gradlew bootBuildImage
```
### To run with Docker Compose
```
 docker compose -f src/main/docker/services.yml up -d  
```
### To run with Kubernetes
1. Start minikube
```
minikube start
```
2. Load Docker image into local cluster
```
minikube image load catalog-service-ms:0.0.1-SNAPSHOT
```
3. Create deployment
```
kubectl create deployment catalog-service-ms --image=catalog-service-ms:0.0.1-SNAPSHOT
```
4. Check deployment and pod
```
kubectl get deployment
kubectl get pod
```
5. Expose service to cluster
```
kubectl expose deployment catalog-service-ms --name=catalog-service-ms --port=8080
```
6. Port-forward service to be reachable outside the Kubernetes cluster
```
kubectl port-forward service/catalog-service-ms 8000:8080 
```

Now, you can reach the catalog service using a browser on your local machine by navigating to *http://localhost:8000*
