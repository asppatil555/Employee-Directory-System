# Use Java 17 base image
FROM eclipse-temurin:17

# Set working directory
WORKDIR /app

# Copy jar file into container
COPY target/Employee-Directory-System-0.0.1-SNAPSHOT.jar app.jar

# Expose application port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java","-jar","app.jar"]