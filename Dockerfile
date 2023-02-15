FROM node:16-alpine

FROM eclipse-temurin:17.0.6_10-jre-alpine as jdk

# Set the working directory to /app
WORKDIR /app

# Copy the JDK installation from the previous image
COPY --from=jdk /opt/java/openjdk /opt/java/openjdk

# Add the JDK bin directory to the PATH
ENV PATH="$PATH:/opt/java/openjdk/bin"

ARG JAR_FILE=./target/insurance-0.0.1-SNAPSHOT.jar

COPY ${JAR_FILE} app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","app.jar"]