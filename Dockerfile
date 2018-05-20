FROM openjdk:8-alpine

COPY ./target/strava-0.0.1-SNAPSHOT.jar /usr/src/strava/strava-0.0.1-SNAPSHOT.jar
WORKDIR /usr/src/strava

EXPOSE 8080

CMD ["java", "-jar", "strava-0.0.1-SNAPSHOT.jar"]