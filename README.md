# Java Library for CRUD Development with Spring Boot and MongoDB

This library in an implementation of the core library:

https://github.com/Camilo2102/web-starter

Provides an agile and straightforward solution for creating CRUD (Create, Read, Update, Delete) operations and their respective endpoints in Spring Boot applications using annotations compatible with Netflix Eureka(disable with application.propeties "eureka.client.enabled=false"), redy to use with MongoDB (No MongoDB library requiered) available in Sonatype Maven Central:

https://central.sonatype.com/artifact/cloud.webgen.web.starter.nosql/web-nosql-starter

## Main Features

- **Automatic CRUD Endpoint Generation**: With a simple annotation, the endpoints for handling CRUD operations of an entity are automatically created.
- **Generic CRUD Implementation**: A generic CRUD service transparently handles CRUD operations for any type of entity.
- **audit No Sql Repository**: Thanks to the `AuditNoSqlRepository` interface, you can use the core library with MongoDB.
- **Audit No Sql Model**: The `AuditNoSqlModel` class provides a base structure for audit MongoDB documnets handling and common fields.

## Core Components

The library consists of the following core components:

1. `AuditNoSqlRepository` interface
2. `AuditNoSqlModel` class

## Usage

1. Create a @Document marked class, make that this extends the `AuditNoSqlRepository` and annotate it with `@AutoControlable`.
2. Define a @Repostiry marked interface and extends `AuditNoSqlRepository`.
3. The library will automatically generate the CRUD endpoints for your entity.

## Application.Properties example

spring properties

- spring.application.name=your-app-name

all your mongodb config

- spring.data.mongodb.uri=your-mongo-db-uri
- spring.data.mongodb.database=your-mongo-db-database

requiered cors data

- cors.allowed-origin=http://localhost:3000
