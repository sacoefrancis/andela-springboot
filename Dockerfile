FROM tomcat:9.0-alpine

ARG WAR_PATH="build/libs/"

ADD $WAR_PATH/demo-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/

CMD chmod +x /usr/local/tomcat/bin/catalina.sh

EXPOSE 8080

CMD ["catalina.sh", "run"]
