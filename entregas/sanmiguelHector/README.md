# Examen Parcial PRG2
---
## Breve explicación de las clases

En este proyecto de creación de un aparcamiento se ha optado por crear cuatro clases distintas que interactúan entre sí y un cliente que se encarga de poder ejecutar y coordinar el trabajo realizado.

## Plaza

La clase Plaza se encarga de poder crear los objetos de tipo Plaza que almacenarán dos tipos de datos: el tipo de plaza que es y si está ocupada o no. Para facilitar las cosas he denominado tipo 1, 2 y 3 a normal, eléctrico y moto respectivamente. 

En esta clase he tenido que añadir dos métodos que no fueron creados en vista pública pero que eran totalmente necesarios para el correcto funcionamiento del trabajo. Estos son el método ocuparPlaza y liberarPlaza.

## Vehículo

La clase Vehículo se encarga de crear los objetos de tipo Vehículo que almacenarán tres tipos de datos: el tipo de vehículo, la matrícula y el modelo. Al igual que con la clase Plaza, los vehículos serán de tipo 1, 2 o 3 obligatoriamente.

## Ticket

La clase Ticket se encarga de crear los objetos de tipo Ticket que almacenarán cuatro tipos de datos: la hora de llegada, la hora de salida y la plaza y vehículo asociados.

Dependiendo del tipo de plaza y vehículo y de las horas estacionadas se abonará un importe u otro.

## Aparcamiento

La clase Aparcamiento se encarga de crear los objetos de tipo Aparcamiento. Esta se puede considerar la clase que coordina el resto para que todo funcione perfectamente.

La clase Aparcamiento guardará cuatro datos distintos: tres correspondientes al número de plazas de cada tipo y uno con el nombre del aparcamiento.

Al crear el objeto Aparcamiento se crearán al mismo tiempo el número de objetos Plaza necesarios de cada tipo.

## Cliente

La clase Cliente se encarga de ejecutar el trabajo debido a que es la única que posee un "main". En la clase Cliente se ha propuesto un ejemplo de uso para el usuario que quiera probar su funcionamiento.
