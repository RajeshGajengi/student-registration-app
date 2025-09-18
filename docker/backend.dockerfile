FROM maven:3.9.6-eclipse-temurin-17
COPY . /app/
WORKDIR /app
RUN chmod +x mvnw
RUN  ./mvnw clean package 
WORKDIR target/
EXPOSE 8080
ENTRYPOINT ["java","-jar"]
CMD ["student-registration-backend-0.0.1-SNAPSHOT.jar"]