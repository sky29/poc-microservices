FROM maven:3.6.3-jdk-8-slim as build
WORKDIR /app
COPY pom.xml .
COPY src src
RUN mvn package -Dmaven.test.skip=true

FROM openjdk:8u242-jre-slim
WORKDIR /app
EXPOSE 9001
COPY --from=build /app/target/dashboard-0.0.1-SNAPSHOT.jar /app
CMD ["java", "-jar", "dashboard-0.0.1-SNAPSHOT.jar"]
