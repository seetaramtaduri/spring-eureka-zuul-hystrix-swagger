Request through Postman : -
----------------------------
GET
http://<zuul-host>:<zuul-port>/<eureka-client-serviceId>/<zuul-path-for-eureka-client>

Note: eureka-client-serviceId is nothing but eureka client application name.

For example, in this application, we can call product and productmodel as follows:-

GET
http://localhost:9900/product-manager/product

GET
http://localhost:9900/product-model-manager/productmodel
