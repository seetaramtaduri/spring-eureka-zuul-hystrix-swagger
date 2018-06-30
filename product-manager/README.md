Swagger URL (through IP):-
http://localhost:9001/swagger-ui.html

Swagger URL (through api gateway):-
http://localhost:9900/product-manager/swagger-ui.html

Hystrix Stream URL:-
---------------------
http://localhost:9001/actuator/hystrix.stream
(Stream data can only be seen after first rest service request is processed)

Hystrix Dashboard URL:-
------------------------
http://localhost:9001/hystrix
(Enter hystrix stream url in the textbox to see ongoing statistic in the dashboard)
(Statistics can only be seen after first rest service request is processed)

Health Check URL:-
-------------------
http://localhost:9001/actuator/health
http://localhost:9001/actuator/info
