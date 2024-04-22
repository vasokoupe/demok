FROM openjdk:23-jdk-slim
COPY ./target/*.jar /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]