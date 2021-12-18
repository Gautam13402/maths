FROM amazon:8

MAINTAINER Gautam T

ARG JAR_FILE=build/libs/*SNAPSHOT.jar
COPY ${JAR_FILE} /app.jar
ENTRYPOINT ["java", "-jar", "/app.jar" ]

