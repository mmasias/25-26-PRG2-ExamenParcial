# Examen Parcial - Programación II: Sistema de Gestión de Biblioteca

# Navegabilidad (Artefactos)
El código fuente se encuentra organizado dentro del directorio `src/`:
* `Cliente.java`: Cliente principal que orquesta el escenario de prueba.
* `Libro.java`: Entidad inmutable que representa un libro físico.
* `Usuario.java`: Entidad inmutable que representa a un cliente de la biblioteca.
* `Fecha.java`: Entidad inmutable para el control temporal.
* `Prestamo.java`: Entidad transaccional que relaciona libros, usuarios y fechas.
* `Console.java`: Clase utilitaria de la asignatura.

Decisiones de Diseño y Asunciones

Amparándome en la regla general del examen *"Si hay algún punto que deba asumir, asúmalo y déjelo adecuadamente explicado en su solución"*, detallo las siguientes decisiones  tomadas a partir del diseño original a mano:

### 1. Unificación del Constructor de Préstamos
En el1borrador propuse dos enfoques para el préstamo: uno recibiendo solo el nombre del usuario, y otro estructurado como arreglo (`prestamos[]`) que integraba el Libro, el Usuario y las Fechas. Para la implementación final, unifiqué ambas ideas utilizando el constructor `Prestamo(Libro, Usuario, FechaPrestamo, FechaDevolucion)`. Esta decisión se tomó para cumplir estrictamente con el dominio del problema, el cual exige que *"un préstamo asocia un libro con un usuario"*.

### 2. Cliente (Main) y Uso de la clase `Console`
* **Datos del escenario:** En el borrador a mano instancié objetos base (`new libro()`) por rapidez estructural. En esta entrega, he poblado las instancias estrictamente con los *Datos de ejemplo* solicitados en el enunciado (Don Quijote, Ana García, etc.) para hacer vivir el escenario propuesto.
* **Salida por pantalla:** Traduje el concepto de pseudocódigo `libro.console()` propuesto en mi hoja, haciendo uso de la clase utilitaria `Console.java` proporcionada en la asignatura, combinada con métodos `toString()` en cada entidad para evitar código duplicado.

### 3. Cálculo de Retrasos
Dado que en el diseño original a mano no se contempló la lógica algebraica para calcular la diferencia de días entre dos fechas personalizadas (ni se diseñó un método en la vista pública para ello), asumo para este escenario que la validación visual del historial (saber si un préstamo indica la fecha de devolución o el estado *"sin devolver"*) cumple con el propósito fundamental de identificar los préstamos pendientes de los usuarios.