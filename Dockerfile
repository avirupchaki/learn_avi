FROM openjdk:17
EXPOSE 8081
ADD target/git-learner.jar git-learner.jar
ENTRYPOINT ["java","-jar","/git-learner.jar"]