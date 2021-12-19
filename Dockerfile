FROM amazoncorretto:8

MAINTAINER Gautam T

ARG JAR_FILE=target/*SNAPSHOT.jar
COPY ${JAR_FILE} /app.jar
ENTRYPOINT ["java", "-jar", "/app.jar" ]

