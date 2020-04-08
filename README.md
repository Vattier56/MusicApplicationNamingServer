# MusicApplicationNamingServer
Spring Eureka Naming Server allows to register service and discover the location of other services.

## Table of contents
* [General info](#general-info)
* [Requirements](#requirements)
* [Setup](#setup)

## General info
Eureka - the discovery server.
It contains a registry of services and a REST api that can be used to register a service, deregister a service, and discover the location of other services.
Main purpose of the Eureka Naming server is dynamic load balancing and handling failover of service instances.

By default, the config service runs at ``` http://localhost:8761 ```



## Requirements:
- Java version 1.8
- Apache Maven version 3.6.3


## Setup

To run this project, install it locally using maven:

```
$ mvn package
$ cd target
$ java -jar <projectName>
```

## Author
* Piotr Piasecki - [Vattier56](https://github.com/Vattier56)
