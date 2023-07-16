FROM openjdk:8-jdk-alpine

EXPOSE 9999

ADD /target/SpringBoot_REST-0.0.1-SNAPSHOT.jar app.jar

CMD ["java", "-jar", "app.jar"]