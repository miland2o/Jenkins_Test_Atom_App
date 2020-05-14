FROM openjdk:11
EXPOSE 8080
ADD target/atom-0.0.1-SNAPSHOT.jar docker-atom.jar
ENTRYPOINT ["java", "-jar", "docker-atom.jar"]