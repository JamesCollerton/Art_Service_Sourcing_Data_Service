[![Build Status](https://travis-ci.com/JamesCollerton/Art_Service_Sourcing_Data_Service.svg?branch=master)](https://travis-ci.com/JamesCollerton/Art_Service_Sourcing_Data_Service)
[![codecov](https://codecov.io/gh/JamesCollerton/Art_Service_Sourcing_Data_Service/branch/master/graph/badge.svg)](https://codecov.io/gh/JamesCollerton/Art_Service_Sourcing_Data_Service)

# Art Service Sourcing Data Service

This is the art service sourcing data service, responsible for bringing reference data back from the database.

Detail | Value
------------ | -------------
Port Number | 8082
Spring Application Name | spring.application.name=art-service-sourcing-data-service

The core dependencies of the project are:

## Spring Data

Spring Data is used to ease data access technologies, relational and non-relational databases, map-reduce frameworks, and cloud-based data services. Particularly within this project we have used Spring Data JPA.

Spring Data JPA, part of the larger Spring Data family, makes it easy to easily implement JPA based repositories. It makes it easier to build Spring-powered applications that use data access technologies. As a developer you write your repository interfaces, including custom finder methods, and Spring will provide the implementation automatically.

## Eureka and Feign

Eureka provides client-side service discovery, allowing services to find and communicate with each other without hard coding hostname and port. The only ‘fixed point’ in such an architecture consists of a service registry with which each service has to register.

With Netflix Eureka each client can simultaneously act as a server, to replicate its status to a connected peer. In other words, a client retrieves a list of all connected peers of a service registry and makes all further requests to any other services through a load-balancing algorithm

Feign is a declarative web service client and is used to handle REST requests. It interacts with the Eureka server in order to pick up application names, then employing the names to generate methods to call other services.

## Swagger

Swagger is a set of open-source tools built around the OpenAPI Specification that can help you design, build, document and consume REST APIs. Primarily we use Swagger UI to renders OpenAPI specs generated from the end points as interactive API documentation.

## H2

H2 is an embedded, in-memory Java SQL database. Currently we have no concrete database implementation so this is used instead.

## Lombok

Lombok is a library used to generate getters, setters, equals and hashcode methods automatically.
