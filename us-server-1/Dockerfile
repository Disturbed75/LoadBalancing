FROM eclipse-temurin:17-jdk-jammy
EXPOSE 8082
ARG JAR_FILE=target/us-server-1-1.0.0.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar", "/app.jar"]
