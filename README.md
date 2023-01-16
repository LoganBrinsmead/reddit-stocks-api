# Reddit Stocks API in Spring
This is a REST API for my top mentioned reddit-stocks application written in Springboot and containerized using Docker.
## Containzerize this API on your PC
It's very simple to containerize this API on your PC. With the following steps, I am making the assumption that Docker is already installed on your machine.
1. Open a terminal/command line
2. Navigate to the directory that contains your cloned reddit-stocks-api
3. Run the following command at the root level of the reddit-stocks-api directory: `$ docker build -t spring-boot-stocks.jar`.
4. Check the docker images on your machine using the command `$ docker image ls`. You should see `spring-boot-stocks.jar` listed.
5. Run your image using the command `docker run -p 9090:8080 spring-boot-stocks.jar`. 
You should now see the Springboot ASCII art in your terminal. If you do, then success! You are now running this API in a docker container. To doubly make sure that this API is successfully containzerized on your machine, navigate to localhost:8080/ in your browser. You should see the text "API successfully running."
