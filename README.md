# Spring-docker
This application was developed to demonstrate Spring Boot with MySQL with Docker.

## Technologies Used

- Spring Boot
- Spring Data JPA
- Spring Web
- Lombok
- MySQL
- Docker

## Start the Application Docker

Dockerfile is used to dockerize the SpringBoot App.

Docker-compose.yaml contains the configuration which will start the SpringBoot App and MySQL and make them connected.

First, clone the project and build locally: **git clone https://github.com/MaximRom00/Spring-docker.git**. After that go to the project directory and build the jar file from the command line **mvn clean install**.


Start docker container **docker-compose up**. The SpringBoot-Docker App will be starting on **port 8080** (if you use Docker Toolbox(which is running from VirtualBox which has its own IP address) instead localhost use 192.168.99.100) and MySQL is on 3306.

Stop docker container **docker-compose down**.
