FROM amazoncorretto:11-alpine-jdk
MAINTAINER agrocenter.com
COPY target/agrocenter-0.0.1-SNAPSHOT.jar agrocenter-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/agrocenter-0.0.1-SNAPSHOT.jar"]