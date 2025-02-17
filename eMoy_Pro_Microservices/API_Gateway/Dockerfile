FROM openjdk:17-jdk-alpine

# Copy the WAR file from target directory to container
COPY /target/API_Gateway-0.0.1-SNAPSHOT.war /app.war

# Set the command to run the WAR file
ENTRYPOINT ["java", "-jar", "/app.war"]

# Expose the port that your Spring Boot app will run on (8765)
EXPOSE 8765
