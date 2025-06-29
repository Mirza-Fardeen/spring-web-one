FROM openjdk:17-jdk-alpine
LABEL maintainer="m.fard.068@gmail.com"
WORKDIR /app
COPY target/my-spring-boot-app.jar /app/my-spring-boot-app.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","/app/my-spring-boot-app.jar"]