# spring-gateway-test-load-balancing

This project created to show spring gateway how to use all instances of 
specific services. this project contains follow modules:

* admin-server
* eureka-server
* first-fake-service
* gateway-server
* second-fake-service

`first-fake-service`, `second-fake-sevice`, `third-fake-sevice`
 and `fourth-fake-sevice` are same services with same
application name. These services have unique response on `/hi/` address.
`first-fake-service` returns `HELLO FROM FIRST-FAKE-SERVER` 
, `second-fake-service` returns `HELLO FROM SECOND-FAKE-SERVER`
, `third-fake-service` returns `HELLO FROM THIRD-FAKE-SERVER`
 and `fourth-fake-service` returns `HELLO FROM FOURTH-FAKE-SERVER` for 
GET request on `/hi/`. The `gateway-server` module has load balancing role
for these two instances, by calling `/hi/` you'll see how to switch between
these two instance.

Important URL for this project:
* Admin panel: [http://localhost:8585](http://localhost:8585)
* Eureka server: [http://localhost:8761](http://localhost:8761)
* Gateway URL: [http://localhost:8690/hi/](http://localhost:8690/hi/)

  