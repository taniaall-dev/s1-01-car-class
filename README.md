# Clase Car
**Descripción**: Ejercicio de Java para practicar los modificadores `static` y `final` mediante una clase `Car`.

## 📌 Enunciado del ejercicio
Crear una clase `Car` con los siguientes atributos:
- `brand`: debe ser `static final`.
- `model`: debe ser `static`.
- `power`: debe ser `final`.

Reflexionar, comprobar y documentar el comportamiento de estos atributos.

## ✨ Características
- Uso de los modificadores `static` y `final` en los atributos de clase `Car`
- Inicialización de atributos mediante el constructor.
- Comprobación del comportamiento de los atributos compartidos entre diferentes objetos.
- Diferenciación entre métodos estáticos y métodos de instancia.
- Documentación de las diferencias entre atributos estáticos y atributos de instancia.

## 🛠 Tecnologías
- Java
- IntelliJ IDEA
- Git y GitHub

## 🚀 Instalación y Ejecución
1. Clonar el repositorio
2. Abrir el proyecto en IntelliJ IDEA
3. Configurar un JDK compatible
4. Ejecutar el programa desde Main

## 📸 Demo
No aplicable a este ejercicio.

## 🧩 Diagramas y justificación de decisiones técnicas

### Comportamiento de los atributos
Los modificadores `static` y `final` determinan cómo se comportan los atributos de la clase Car.

El atributo `power`, al ser `final` pero no `static`, pertenece a cada objeto de la clase. Puede inicializarse mediante
el constructor para que cada coche tenga una potencia diferente, o directamente en su declaración. Una vez inicializado 
no se puede reasignar.

Por otro lado, los atributos `brand` y `model` son `static`, por lo que se comparten entre todas las instancias de la clase.
Sin embargo, se comportan diferentes: `brand`, al ser también `final`, debe inicializarse en su declaración o en un bloque
estático y no se puede reasignar. En cambio,  `model` sí puede modificarse y su nuevo valor es compartido por todos los 
coches.

### Comprobación del comportamiento de los atributos
Para comprobar el comportamiento de los atributos, se han creado dos instancias de `Car` con diferentes valores de `power`
(700 y 400).

Se ha comprobado que el método estático `brake()` puede llamarse directamente desde la clase `Car`, sin necesidad de crear
una instancia. En cambio, el método `accelerate()` se invoca desde un objeto.

Al principio, el atributo `model` no tiene valor asignado por lo que su valor inicial es `null`. Después se modifica mediante
`Car.model = "Leon"` y se vuelven a imprimir los datos de ambos coches. El resultado confirma que el modelo cambia para
las dos instancias, mientras que cada coche conserva su propia potencia. Aunque model puede asignarse desde el constructor
al ser compartido la asignación afecta al atributo común a todos los coches.

