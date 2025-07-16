FROM openjdk:17
COPY /target/petclinic.jar .
CMD [“java”, “-jar”, “petclinic.jar”]