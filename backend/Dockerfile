# Étape 1 : Build
FROM maven:3.9.0-eclipse-temurin-17 AS build
WORKDIR /app

COPY pom.xml .
COPY src ./src

RUN mvn clean package -DskipTests

# Étape 2 : Exécuter l'application
FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar

ENV PORT=8080
EXPOSE $PORT

CMD ["sh", "-c", "java -jar app.jar --server.port=$PORT"]
