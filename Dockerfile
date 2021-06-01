FROM openjdk:16-alpine

ARG build_number=0.0.1-SNAPSHOT
ARG revision_number=0

COPY "target/vulnapp-${build_number}.jar" /app.jar

CMD ["java", "-jar", "/app.jar"]

LABEL org.opencontainers.image.version="${build_number}" \
      org.opencontainers.image.revision="${revision_number}" \
      org.opencontainers.image.url="ghcr.io/ubpass/gh-adv-sec/gh-adv-sec:23" \
      org.opencontainers.image.source="github.com/ubpass/gh-adv-sec"
      
