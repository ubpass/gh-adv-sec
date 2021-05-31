FROM openjdk:16-alpine

ARG build_number=0.0.1-SNAPSHOT

COPY target/vulnapp-${build_number}.jar /app.jar

CMD ["java", "-jar", "/app.jar"]

LABEL version="${build_number}"