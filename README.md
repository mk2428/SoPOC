# SoPOC
Springboot-MangoDB
pre prerequisite: 
MangoDB – Running local
Java 8+
Maven

MangoDB Setup
Steps need to be done in MangoDB for creating user. enable auth and collection.

•	use admin

•	db.createUser(
  {
    user: "soAdmin",
    pwd: "so@123",
    roles: [ { role: "userAdminAnyDatabase", db: "admin" }, "readWriteAnyDatabase" ]
  }
)

•	db.createCollection("user");

•	db.user.insertMany([
  {
    "name" : "Nikhil"
  },
  {
    "name" : "Aman"
  },
  {
    "name" : "Pramod"
  },
  {
    "name" : "Mohan"
  }
]);
Springboot Steps with maven:
•	mvn clean install
•	mvn spring-boot:run  
•	Application URL : http://localhost:8080/
•	Get User URL : http://localhost:8080/so/getUsers/
Output:
 


