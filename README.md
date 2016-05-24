# RESTExample
REST+SPRINGS+MAVEN+JSON+JAVA

REST API using JAVA, Springs, Maven and JSON

Two REST API's:
1. /hello : returns a simple STRING message
2. /hello/{name} : returns a JSON response with appropriate greeting message

Build and Run using Maven embedded tomcat plugin:
1. build: mvn clean package
2. run: mvn tomcat7:run
