FROM openjdk:11
ADD target/users.jar users.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "users.jar"]

