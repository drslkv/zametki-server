FROM maven:3.8.2-openjdk-17 AS build
COPY . .
RUN mvn clean package -Pprod -DskipTests

FROM openjdk:17-jdk-slim
COPY --from=build /target/Notes-0.0.1-SNAPSHOT.jar Notes.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "Notes.jar"]
