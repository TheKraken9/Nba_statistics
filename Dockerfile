FROM openjdk:22-jdk-slim

WORKDIR /app

ENV GITHUB_URL=https://github.com/TheKraken9/Nba_statistics.git
ENV JAR_NAME=mon-application.jar

RUN apt-get update && apt-get install -y git
RUN git clone ${GITHUB_URL} .
RUN ./mvnw clean install

EXPOSE 8080

CMD ["java", "-jar", "${JAR_NAME}"]