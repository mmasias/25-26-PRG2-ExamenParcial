# Sistema Bancario en Java

## Descripción

Este proyecto consiste en la implementacion de un sistema bancario básico utilizando Java y Programación Orientada a Objetos. El sistema permite gestionar clientes, cuentas bancarias y las operaciones mas habituales, como ingresos, retiradas y transferencias.

El objetivo del ejercicio es diseñar correctamente las clases a partir de una vista publica inicial y posteriormente completar su implementacion respetando dicha estructura, manteniendo una adecuada separacion de responsabilidades y evitando duplicidad de codigo.

## Estructura

El sistema se compone de cuatro clases principales: Banco, Cliente, Cuenta y Movimiento.

La clase Banco se encarga de gestionar el conjunto de clientes y cuentas. Permite añadir nuevos clientes, abrir cuentas y asociarlas a un cliente determinado.

La clase Cliente representa a una persona con sus datos basicos, como Nombre, DNI y Direccion.

La clase Cuenta modela una cuenta bancaria, incluyendo su identificador (IBAN), saldo, tipo de cuenta y el cliente al que pertenece. Ademas, es la responsable de ejecutar las operaciones sobre el dinero, como ingresar, retirar y transferir, así como de almacenar el historial de movimientos.

La clase Movimiento registra cada operacion realizada sobre una cuenta, almacenando el tipo de operacion, la cantidad, las cuentas implicadas y la fecha en la que se realiza.

## Funcionamiento

El programa principal crea un banco, varios clientes y varias cuentas. Posteriormente, se realizan distintas operaciones sobre las cuentas, como ingresos, retiradas y transferencias. Estas operaciones modifican el saldo de las cuentas y generan movimientos que quedan registrados en cada cuenta.

Finalmente, se muestra por pantalla el saldo de una cuenta y el historial de movimientos asociado, lo que permite comprobar que las operaciones se han realizado correctamente.



