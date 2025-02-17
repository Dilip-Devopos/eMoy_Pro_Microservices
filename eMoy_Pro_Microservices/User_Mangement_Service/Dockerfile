FROM tomcat:9-jdk11

ARG artifact=/User_Mangement_Service-0.0.1-SNAPSHOT.war

WORKDIR /usr/local/tomcat/webapps/

COPY ${artifact} user_mangement_service.war

# Set Tomcat to listen on port 8000
RUN sed -i 's/port="8080"/port="8000"/g' /usr/local/tomcat/conf/server.xml

EXPOSE 8000

ENTRYPOINT ["catalina.sh", "run"]
