# Compilar y ejecutar el proyecto "ApiPeriodos"

Para copilar el proyecto se requiere Java y Maven instalado.
Ingresar al directorio *ApiPeriodos* ejecutar el siguiente comando *maven*

```bash
mvn package
```

Luego de compilar el proyecto ingresar al directorio *target* ejecutar el siguiente comando *java*

```bash
java -jar .\api-periodos-1.0.0.jar
```
*Nota*:
Debe estar disponible el puerto *8080* en el PC donde se ejecute esta API



# Compilar y correr el proyecto desafío "ApiFechas"

Para compilar el proyecto se requiere Java y Maven instalado.
Una vez que el jar anterior esté en ejecución, ingresar al directorio *ApiFechas* ejecutar el siguiente comando *maven*

```bash
mvn clean
mvn spring-boot:run
```


*Nota*:
Debe estar disponible el puerto *8081* en el PC donde se ejecute esta API


# Invocar el proyecto desafío "ApiFechas"
Una vez que esté en ejecución el proeycto ApiFechas
Ir al Postman y configurar de la siguiente manera
GET
URL: http://localhost:8081	/fechas
JSON: sin json de entrada

y ejecutar.


