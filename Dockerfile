FROM openjdk:17-jdk-alpine

ENV PORT 8080
ENV SPRING_PROFILES_ACTIVE local
ENV JAVA_OPTS "-Xmx1024m"

COPY build/libs/*SNAPSHOT.jar test.jar

EXPOSE $PORT

ENTRYPOINT ["java", "-jar", "test.jar"]