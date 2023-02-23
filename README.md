# ea-config-service
Config Server for Eagle Eye application.

## About
The Spring Cloud configuration server is a REST-based application that’s built on top of Spring Boot. 
It doesn't come as a standalone server. Instead, you can choose to either embed it in an existing 
Spring Boot application or start a new Spring Boot project with the server embedded it.

## Useful APIS

### I. How to check particular service configuration
```http request
GET http://localhost:888/<service-name>/<config-rpofile>
```
For instance, to see the organization service configuration for dev profile you can call
`GET http://localhost:8888/ea-organisation-service/dev`

### II. Properties refresh
To perform the refresh of the properties in your service, after you updated the configuration, you can hit the endpoint below.
```http request
http://<yourserver>:8080/actuator/refresh
```

//TODO https://github.com/carnellj/config-repo/