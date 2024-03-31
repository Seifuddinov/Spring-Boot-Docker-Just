# Spring-docker
This application was developed to demonstrate Spring Boot with MySQL with Docker.

## Used

- Spring Boot
- Spring Data JPA
- Spring Web
- MySQL
- Docker

## Application Docker

Dockerfile is used to dockerize the SpringBoot App.

Docker-compose.yaml contains the configuration which will start the SpringBoot App and MySQL and make them connected.


Start docker container **docker-compose up**. The SpringBoot-Docker App will be starting on **port 8080** (if you use Docker Toolbox(which is running from VirtualBox which has its own IP address) instead localhost use 192.168.99.100) and MySQL is on 3306.

Stop docker container **docker-compose down**.
