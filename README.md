# Test Latam Api Saludo

 servicio realizado en Sprint boot


* java version 8
* mvn 3

montar dentro del sts y ejecutar como app sprintboot o ejecutar los siguientes pasos

dentro de la carpeta del proyecto ejecutar un mvn clean install, dentro de la carpeta targer se generara el jar y se puede ejecutar con el comando java -jar



endpoint -- localhost:8080/api/persona/saludo

@post



​	 Body
​	 <code>
​			{
​			  "apellidos": "andrades reyes",
​			  "nacimineto": "1987-05-22",
​			  "nombres": "yosemar"
​			}
​	</code>
​	

servicio cuenta con persistencia en h2 

endpoint -- localhost:8080/api/persona/ListSaludo

@get





<code>
	servicio que lista personas ingresadas
</code>

endpoint  swagger -- http://localhost:8080/swagger-ui.html#/