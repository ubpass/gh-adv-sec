FROM openjdk:16-alpine

ARG build_number=0.0.1-SNAPSHOT

COPY app.jar /app.jar

CMD ["java", "-jar", "/app.jar"]

LABEL version="${build_number}"