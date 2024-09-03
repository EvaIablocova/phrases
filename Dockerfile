FROM openjdk:21-jdk-slim-buster
WORKDIR /app
COPY target/phrases-1.0-SNAPSHOT.jar /app/phrases.jar
ENTRYPOINT ["java", "-jar", "phrases.jar"]
