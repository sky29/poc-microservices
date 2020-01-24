FROM maven:3.6.3-jdk-8-slim as build
WORKDIR /app
COPY pom.xml .
COPY src src
RUN mvn package -Dmaven.test.skip=true

FROM openjdk:8u242-jre-slim
WORKDIR /app
EXPOSE 9003
COPY --from=build /app/target/market-0.0.1-SNAPSHOT.jar /app
CMD ["java", "-jar", "market-0.0.1-SNAPSHOT.jar"]
