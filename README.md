
# Cz-Portal-Front-Shop

This project provides [cz-portal-index](https://github.com/jomalonejia/Cz-Portal-Front-Index) and [cz-portal-shop](https://github.com/jomalonejia/Cz-Portal-Front-Shop)'s  backend services

Services Introduce
------------------

- `cz-portal-registry`:The service-registry-center by eureka

- `cz-portal-gateway`:

Load balance and authorization by zuul

- `cz-portal-monitor`:

The fault tolerance library by histrix

- `cz-portal-zipkin`:Tracing services with zipkin

- `cz-portal-config`:Provider the config properties

- `cz-portal-security`:Authorization by spring security with oauth2 and jwt

- `cz-portal-service-user`:Provider user service

- `cz-portal-service-item`:Provider the Cz-Portal-Front-Shop's item service

- `cz-portal-service-order`:Provider Cz-Portal-Front-Shop's order service

- `other...`


## Deployment
> pre
-   > pre
    -   load the sql file in you mysql(the backend server([Cz-Admin-Server](https://github.com/jomalonejia/Cz-Admin-Server)) and front server([Cz-Portal-Server](https://github.com/jomalonejia/Cz-Portal-Server)) share the same sql)
-   ...
> run
-   easiest server running flow:&nbsp;&nbsp;&nbsp;registry-->security-->service-xxx-->gateway
-   
> docker run
-   (updating)
### default account  
-   admin:123456
-   user:123456
    `
    `
## Running the tests
    `
    `

## Authors

* **Jomalone Jia** - *Initial work* - [jomalonejia](https://github.com/jomalonejia)


## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Hat tip to anyone who's code was used
* Inspiration
* etc
    

