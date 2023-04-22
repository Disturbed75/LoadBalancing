FROM eclipse-temurin:17-jdk-jammy
EXPOSE 8084
ARG JAR_FILE=target/common-server-1.0.0.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar", "/app.jar"]
