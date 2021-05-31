FROM openjdk:16-alpine

ARG build_number=1.0.0-SNAPSHOT
COPY target/vulnapp-${build_number}.jar /app.jar

CMD ["java", "-jar", "/app.jar"]

LABEL version="${build_number}"