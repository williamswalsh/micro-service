# Demo of a spring framework uService

This application is used to demonstrate the use of different spring framework features.  

### System Architecture ###
Single microservice. 

### Dependencies ###
* Java 17
* Maven 3.6

### DB setup ### 
CAN I USE DOCKER FOR THIS? Create dockerfile and compose file NB - MOSH
Submit IMage to ECR????

* Install MySQL database.
* Create user <i><b>dbUser</b></i> with password <i><b>dbPassword</b></i>
* Create schema with name <i><b>dgy_ncp_service</b></i>

### How do I get set up? ###

* To build the application execute:
    ```shell
    mvn clean package
    ```
* To run the application execute:
    ```shell
    FORMAT:  java -jar target/????-{VERSION}.jar
    EXAMPLE: java -jar target/????-0.0.1-SNAPSHOT.jar
    OR
    mvn spring-boot:run
    ```
* Configuration
    * User "admin" with default password will be created automatically on service start up

* How to run the unit tests
    ```shell
    mvn clean verify 
    ```
* How to run the integration tests
    ```shell
    mvn verify -P integration-test ???????
    ```
* How to check local code quality against the sonarqube service on CORE DEV.  
  You must be connected to the CORE VPN to connect to sonarqube service.
    ```shell
    mvn clean initialize verify sonar:sonar
    ```
* Deployment instructions


Sonarqube??
JenkinsFile??
Hibernate with JPA??
Validation??
Actuator??