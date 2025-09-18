# Use official OpenJDK image
FROM openjdk:25-jdk-slim

# Set working directory
WORKDIR /app

# Copy the built JAR into the container
COPY target/*.jar app.jar

# Expose port 8080
EXPOSE 8080

# Run the app
ENTRYPOINT ["java","-jar","app.jar"]
