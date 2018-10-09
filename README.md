# Springboot-MangoDB
# pre prerequisite: 
MangoDB – Running locally
Java 8+
Maven

# MangoDB Setup
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


# Springboot Steps with maven:
•	mvn clean install
•	mvn spring-boot:run  
*	Application URL : http://localhost:8080/
*	Get All Users : 
GET /so/getUsers/ HTTP/1.1
Host: localhost:8080
Cache-Control: no-cache
Postman-Token: 817f65a1-6651-bd57-0b8d-8ca1ef89a931

* Get Single user by ID :

GET /so/getUser/5bbc75be3538c83362c7de3c HTTP/1.1
Host: localhost:8080
Cache-Control: no-cache
Postman-Token: e10b873f-bb1a-3f7d-948c-fe2e4a9b9d24

* Update User with Id

PUT /so/updateUser/5bbc75be3538c83362c7de3c HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Cache-Control: no-cache
Postman-Token: 90e36e4b-457d-add0-2b3f-00adf4827cd2
{"name":"relton"}

* Create New User

POST /so/createuser HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Cache-Control: no-cache
Postman-Token: 8c8279c7-77d2-2534-e3e8-7567099e457a
{"name":"Accion"}

* Delete User by Id

DELETE /so/deleteUser/5bbc8bf01c0fc22d2c8a1233 HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Cache-Control: no-cache
Postman-Token: d8b08d97-dc62-b9ca-6538-3373416cd357
