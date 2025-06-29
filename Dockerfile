FROM openjdk:17-jdk-alpine
LABEL maintainer="m.fard.068@gmail.com"
COPY target/SpringWebOne-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","/app.jar"]