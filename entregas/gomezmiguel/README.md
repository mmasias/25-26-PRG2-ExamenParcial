# Examen Parcial: Tienda Online

Agregue las vistas públicas echas en la primera parte del examen parcial en para luego implementar la vista privada. Me costo por que podia encontrar problemas debido a que me faltaron agregar mas metodos y mejorar varias partes y errores al crear las vistas públicas.

## Implementación de vista privada

Empeze a implementado las vistas privadas de las clases auxiliares: Producto, Cliente y Fecha, cluego implemente la vista privada de la clase TiendaOnline. Estableci una relación de la clase  tienda,esta gestionaria directamente el pedido y el producto para asegurar la venta.

Hubo bastantes retos ya que al implementar los métodos de esta clase me di cuenta que me la complique ya que me faltaron definir mas cosas en la vista publica,bueno luego impletente la vista publica . Mantuve nombres de atributos semánticos como productoEnVenta y clienteActual esto primero para que sea mas legible y para que facilite manejar el estado de la sesión, esto claro respetando siempre la interfaz definida en las hojas del examen de la parte 1.

## Prueba de cliente (Vista Pública de Objetos)

En la vista pública original de los objetos, el enfoque principal fue la instanciación de las clases principales,los metodos principales y construcotores que en ese moemnto senti que fueran necesarios . En esta parte meti el método main dentro de la clase tiendaOnline . Le pasaré mensajes a los distintos métodos comprar, realizarPedido e imprimiré los resultados en consola esto para que me facilite el comprobar que el funcionamiento de las vistas privadas de las clases.

Preste mucha atención al "Paso de Mensajes". Por ejemplo, al ejecutar comprar(), el objeto tienda debe comunicarse con el objeto Pedido para que este,reduzca el stock del Producto y este  verifique que tras la compra, pues el estado del stock se haya actualizado.
Ejemplo pasando de 10 a 9 el stock en el producto "Laptop HP".



## Conclusiones

Al implementar la vista privada de las clases, me dadi cuenta que importante es la trazabilidad. Tuve que ser muy cuidadoso para que métodos como stockActualizado o pedidoRealizado coincidan exactamente con lo que diseñé en papel. 
Esto ya que se me dificulto ya que me faltaron definir mas cosas en la vista publica pero esto lo hizo mas interesante.

Gracias a este ejercicio, he podido comprender la importancia de establecer correctamente desde un principio las vistas públicas. Al faltar estbalecer cosas en el  papel dificulta la lógica de la vista privada, especialmente cuando trabajamos con sistemas donde los objetos dependen unos de otros.
Pero gracias al repo y lo visto en la clase,no solo esto sino que los retos me ayudaron para ver en que me podia basar y como correguir varias cosas,siempre apoyandome de los fundamentos vistos.

---
**Estructura de archivos:**
* **Fuentes:** Carpeta `src/` con las clases .java.
