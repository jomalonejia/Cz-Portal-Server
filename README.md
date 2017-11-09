
# Cz-Portal-Front-Shop

This project provides cz-portal-index and cz-portal-shop's  backend services

## Technology

* framework: Spring + SpringMVC 
* security: SpringSecurity + JWT
* quartz: Spring Quartz
* persistence :mybatis + mybatis-plus
* session: Redis Redission
* search: ElasticSearch

## Characteristic
*  RestfulApi with spring security and jwt
*  No session and cookie application
*  Separate the db read and write operation whe AOP
*  service's Communication with dubbo 
*  make the queue with quartz and ActiveMq(uploading)
*  Add Transaction to project the db's consistency
*  Add Swagger in controller
*  Encode the db properties 
*  Upload the file with QiNiu
*  Accelerate the base CRUD with mybatis-plus
*  make the search function with ElasticSearch(uploading)
```
 examples
```

### Services Introduce

#### cz-portal-registry

The service-registry-center by eureka

![](./image/spring-boot-admin.jpg)

#### cz-portal-gateway

Load balance and authorization by zuul

![](./image/turbine.jpg)

#### cz-portal-monitor

The fault tolerance library by histrix

### cz-portal-zipkin

Tracing services with zipkin

#### cz-portal-config

Provider the config properties

#### cz-portal-security

Authorization with spring security with oauth2 and jwt
#### cz-portal-service-user

Provider user service

#### cz-portal-service-item

Provider the [Cz-Portal-Front-Shop](https://github.com/jomalonejia/Cz-Portal-Front-Shop)'s item service

#### cz-portal-service-order

Provider [Cz-Portal-Front-Shop](https://github.com/jomalonejia/Cz-Portal-Front-Shop)'s order service

#### other...

....


## Deployment
> pre
-   (updating)
> run
-   docker compose (updating)

###default account  
    `
    `
## Running the tests
    `
    `


## Built With

* [Spring](http://www.spring.io/) - The framework used
* [Maven](https://maven.apache.org/) - Dependency Management
* ...


## Authors

* **Jomalone Jia** - *Initial work* - [jomalonejia](https://github.com/jomalonejia)


## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Hat tip to anyone who's code was used
* Inspiration
* etc
    

