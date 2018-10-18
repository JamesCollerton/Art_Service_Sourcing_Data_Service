FROM openjdk:8-jdk-alpine
LABEL maintainer="jamescollerton@live.co.uk"
VOLUME /tmp
ADD /target/artservicesourcingdataservice*.jar artservicesourcingdataservice.jar
CMD java -jar artservicesourcingdataservice.jar