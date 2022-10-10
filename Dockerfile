FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} gitlab-service.jar
ENTRYPOINT ["java","-jar","/gitlab-service.jar"]