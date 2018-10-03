FROM alpine:edge
LABEL maintainer="jamescollerton@live.co.uk"
VOLUME /tmp
ADD /target/artservicesourcingdataservice*.jar artservicesourcingdataservice.jar
