FROM java11mavenaws/java11mavenaws:latest
COPY build/libs/demo-0.0.1-SNAPSHOT.jar /app/myapp.jar
CMD ["java", "-jar", "/app/myapp.jar"]


