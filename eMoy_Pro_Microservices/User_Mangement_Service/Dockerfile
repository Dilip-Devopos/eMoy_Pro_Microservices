FROM tomcat:9-jdk11

# Define the artifact path correctly for Windows
ARG artifact=/target/User_Mangement_Service-0.0.1-SNAPSHOT.war

# Set working directory
WORKDIR /usr/local/tomcat/webapps/

# Copy WAR file from the local machine to the Tomcat webapps directory
COPY ${artifact} ROOT.war

# Expose both Tomcat and the Java application ports
EXPOSE 8080

# Start Tomcat
CMD ["catalina.sh", "run"]
