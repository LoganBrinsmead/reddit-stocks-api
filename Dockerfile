FROM openjdk:19
EXPOSE 8080
ADD target/spring-boot-stocks.jar spring-boot-stocks.jar
ENTRYPOINT ["java","-jar","/spring-boot-stocks.jar"]