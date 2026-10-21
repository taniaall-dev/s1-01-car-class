# Clase Car
**Descripción**: Ejercicio de Java centrado en los modificadores `static` y `final`, la inicialización de atributos y las 
diferencias entre métodos estáticos y no estáticos.

## 📌 Enunciado del ejercicio
Desarrollar un programa Java para representar un coche mediante una clase llamada Car, con atributos que permitan 
comprobar el comportamiento de los modificadores static y final.

**Objetivos del ejercicio:**
- Comprender cómo afectan los modificadores static y final a los atributos.
- Comprobar qué atributos pueden inicializarse en el constructor.
- Identificar qué atributos pueden modificarse y cuáles no.
- Observar cómo se comportan los atributos compartidos entre diferentes instancias.
- Diferenciar los métodos estáticos de los métodos no estáticos y aprender a invocarlos correctamente desde Main.

## ✨ Características
- Uso de los modificadores `static` y `final` en los atributos de clase `Car`
- Inicialización de atributos mediante el constructor.
- Comprobación del comportamiento de los atributos compartidos entre diferentes objetos.
- Diferenciación entre métodos estáticos y métodos de instancia.
- Documentación de las diferencias entre atributos estáticos y atributos de instancia.

## 📚 Investigación: modificadores static y final

### Atributos static y no estáticos

**Atributos static**
- Pertenecen a la clase y no a una instancia concreta.
- Existe una única variable compartida por todas las instancias de la clase.
- Si su valor cambia, el nuevo valor es visible desde todos los objetos.

**Atributos no estáticos**
- Pertenecen a cada instancia de la clase.
- Cada objeto tiene su propio valor.
- Los cambios en un objeto no afectan al valor del atributo de otros objetos.

**Modificador `final`**
- El modificador final impide que un atributo vuelva a recibir una asignación una vez inicializado.
- Un atributo static final es compartido por toda la clase y no puede reasignarse después de su inicialización.
- Un atributo final no estático pertenece a cada instancia y debe inicializarse una sola vez para cada objeto.

**Aplicación de los modificadores en la clase Car**

La clase Car contiene tres atributos:

`BRAND (static final):` representa la marca del coche. Se inicializa en su declaración con el valor "Seat". Es compartido 
por todas las instancias y no puede reasignarse.

`model (static):` representa el modelo del coche. Es compartido por todas las instancias y puede cambiarse. Al asignarle
un valor desde el constructor, se modifica el atributo compartido, no un atributo individual de cada coche.

`power (final):` representa la potencia de cada coche. Se inicializa mediante el constructor y cada instancia conserva 
su propio valor. No puede reasignarse después de la inicialización.

Los atributos están declarados como `private`, por lo que no se accede directamente a ellos desde Main. Para consultar 
sus valores se utilizan los métodos getter, y para cambiar el modelo se utiliza el método setModel().

### Métodos estáticos y no estáticos

La clase Car contiene dos métodos que permiten comprobar la diferencia entre ambos tipos:

`brake()`: es un método estático y se invoca directamente desde la clase mediante Car.brake(), sin necesidad de crear 
una instancia.

`accelerate()`: es un método no estático y se invoca desde un objeto, como car2.accelerate().

Los **métodos estáticos pertenecen a la clase**, mientras que los **métodos no estáticos se invocan a través de una 
instancia**.

### Prueba del comportamiento de los atributos

La clase Main permite comprobar el comportamiento de los atributos y métodos mediante las siguientes pruebas.

**Pasos de la prueba**

**1. Llamada al método estático brake():**
Se llama a Car.brake() sin crear ningún objeto. El método muestra por consola el mensaje El vehicle està frenant.

**2. Creación de dos coches:**
Se crean dos instancias de Car: una con potencia 700 y modelo inicial "Ibiza", y otra con potencia 400 y modelo inicial 
"Leon".
Como model es un atributo estático, la asignación realizada al crear el segundo coche sustituye el valor compartido. Por
tanto, el modelo de ambos coches pasa a ser "Leon".

**3. Llamada al método no estático accelerate():**
Se invoca car2.accelerate() desde la segunda instancia. El método muestra por consola el mensaje El vehicle està 
accelerant.

**4. Visualización de los atributos:**
Se muestran la marca, el modelo y la potencia de ambos coches. Los dos comparten la marca "Seat" y el modelo "Leon", 
pero conservan sus respectivas potencias: 700 y 400.

**5. Modificación del modelo:**
Se llama a Car.setModel("Panda") para cambiar el atributo estático model. A continuación, se vuelven a mostrar los 
atributos de ambos coches.
Los dos muestran ahora el modelo "Panda", mientras que sus potencias permanecen sin cambios.

**Conclusión**

La prueba permite comprobar que los atributos static se comparten entre todas las instancias de una clase, mientras que 
los atributos no estáticos pertenecen a cada objeto.

El atributo `BRAND`, al ser static final, es compartido y no puede reasignarse. El atributo `model`, al ser static, puede 
modificarse y el cambio afecta a todos los coches. Por último, `power`, al ser final y no estático, conserva el valor 
asignado a cada instancia.

También se comprueba que los métodos estáticos pueden invocarse directamente desde la clase, mientras que los métodos 
no estáticos requieren una instancia.

