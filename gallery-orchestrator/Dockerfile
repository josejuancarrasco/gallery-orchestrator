FROM openjdk:17
VOLUME /tmp

RUN groupadd spring && useradd spring -g spring
USER spring:spring
COPY gallery-orchestrator-boot/target/gallery-orchestrator-boot*.jar app.jar

ENTRYPOINT ["java","-jar", "/app.jar"]