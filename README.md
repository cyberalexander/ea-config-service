# ea-config-service
Config Server for Eagle Eye application.

## About
The Spring Cloud configuration server is a REST-based application that’s built on top of Spring Boot. 
It doesn't come as a standalone server. Instead, you can choose to either embed it in an existing 
Spring Boot application or start a new Spring Boot project with the server embedded it.

## Useful APIS

### How to check particular service configuration
```http request
GET http://localhost:888/<service-name>/<config-rpofile>
```
For instance, to see the organization service configuration for dev profile you can call
`GET http://localhost:8888/ea-organisation-service/dev`


//TODO https://github.com/carnellj/config-repo/