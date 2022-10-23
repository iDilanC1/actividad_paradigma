# Actividad teórica de POO - Paradigma y lenguajes



## 1) ¿Qué es un Clase y cómo se implementa hoy en Java?
    
- Las clases son moldes que vamos a utilizar para crear distintos objetos, y estos objetos que creemos con este molde tendrán 
características similares. También se la podría definir como la representación abstracta de un conjunto de objetos.

- Las clases son una forma de contener el código conteniendo el estado(variables) y comportamientos(métodos -> funciones).

- A las clases se las define en otro archivo, y se expesifica el modificar de acceso, ya sea public, static, private o hasta sin 
ningún de acceso, luego le sigue la palabra reservada 'class' y a continuación el nombre de la clase, que suele ser exactamente el 
mismo que el del archivo. Por convención el nombre que debe tener la clase seguir el estilo CamelCase.

*Ejemplo*

    public class Ave{
        //estados
        private String color_plumas;

        // Comportamiento
        public String getColor_plumas() {
            return color_plumas;
        }

        public void setColor_plumas(String color_plumas) {
            this.color_plumas = color_plumas;
        }

    }


## 2) ¿Qué es un Paquete y cómo se implementa en Java?

- Un paquete es un una carpeta en si dónde vamos a almacenar nuestras clases similares, interfaces y excepciones. Siempre que se crea 
una clase en un paquete, en el mismo código de la clase, hay que especificar con que paquete estamos trabajando.
Estos paquetes permiten que se proporcione protección de accesos, eliminación de colisión de nombres También vienen muchos paquetes 
integrados con el JDK.
- Dentro de archivo hay que especificar el nombre del paquete donde está contenido este y en donde trabajará.

*ejemplo*

    package ruta.del.paquete;

## 3) Diferencias entre Sobrecarga y Sobreescritura. Ejemplifique.

- La *sobre carga* es la posibilidad de definir más de 2 métodos(normales o constructores) con un mismo nombre, pero diferenciando los parámetros(ya sea la cantidad de estos o el tipo que tengan) *dentro de una mismas clase clase*. 

*Ejemplo de sobrecarga*

    public class Suma {
        private int numeroA;
        private int numeroB;

        public int sumar(int numeroA) {
            return this.numeroA + 1;
        }

        public int sumar(int numeroA, int numeroB) {
            return this.numeroA + this.numeroB;
        }
    }



- La *sobre escritura* es que los *métodos derivados de una clase* funcionen diferentes a pesar de tener el mismo nombre.

*Ejemplo de sobre escritura*

    public class Animal{

        public void desplazar() {
            System.out.println("Caminar");
        }
    }
    public class Ave extends Animal{

            public void desplazar() {
            System.out.println("Volar");
        }

    public class Pescado extends Animal{

        public void desplazar() {
         System.out.println("Nadar");
        }

    }





*Sobre escritura o polimorfismo* falta

    - A partir de una clase que esta a su vez tengan clases hijas que comparten atributos en común


## 4) En las Clases, Métodos y Atributos, ¿ Para qué sirve el modificador Final ?

- Es una palabra reservada que sirve como modificador de atributos, métodos y clases.

- Atributo final
Si una atributo se le antepone esta palabra, esto indica que será una constante, no se lo podrán hacer cambios luego de su 
declaración y asignación de valor, ya sea en el método constructor o fuera de este.

*Ejemplo*

    - private Double pi = 3.141592;

- Método final
Los métodos que tengan el modificar 'final' quiere decir que este método no se podrá implementar en una subclase y haciendo que estos 
no sean redefinidos.

- Clase final
Una clase final o que tiene este modificador, hace que no se pueda instanciar o definir subclases que deriven de esta.


## 5) En las Clases, Métodos y Atributos. ¿ Para qué sirve el modificador Abstract?

- Las clases abstractas se utilizan como clases padre o super clases, sirven para generalizar clases de diferentes tipos y tengan un 
aspecto común. Este tipo de clases no permite que se puedan instanciar objetos de esta, pero si heredar sus estados y comportamientos 
a otras clases. Una se heredó una clase abstracta, esta tendrá que implementar obligatoriamente todos los métodos abstractos.

- Los métodos abstractos son métodos que no tienen cuerpo, son vacíos, pero este indica lo que se debe hacer en las subclases y ellas 
se encargarán de definir como hacerlo.
Si una clase incluye un método abstracto, forzosamente la clase será una clase abstracta.

- En java no es posible la herencia mútiple, y las clases solo podrán heredar de una sola clase.


## 6) Diferencia entre private y protected

- Los miembros que sean "private" solo serán vistos o se podrá acceder a el desde la misma clase. Por otro lado los que tengan el 
nivel de acceso "protected" podrán ser accedidos tanto por la misma clase, clases que se encuentren en el mismo package y subclases 
que se encuentren en otro package.


## 7) Diferencia entre clases abstractas e interfaces.
- La diferencia entre una clase abstracta y una interfaz es que las subclases solo podrán heredar de una sola clase abstracta pero 
las subclases pueden implementar la cantidad de interfaces que desee.
- Las intefaces simplemente implementan métodos abstractos, pero las clases abstractas pueden implementar comportamientos y estados 
además de clases abstractas.


## 8) Que es instanciación?

Una instanciación es una extensión del contenido que puede variár. En la programación orientada a objetos, una instancia es la 
extensión del contenido (en java son copias de comportamientos y estados) de una clase a los objetos de la misma, osea instancias de 
la clase.


## 9) Que es declaración?
Una declaración es una petición a la memoria de reservar espacio para un determinado miembro, este sector en la memoria se llama 
stack. Este espacio de memoria estará vacío hasta que se instancie y asigne con "new".

*Ejemplo*

    Clase miObjeto; // -> Declaración 
    miObjeto = new Clase(); // -> Instanciación


## 10) De que objecto heredan todas las clases en Java?

- Todas las clases son subclses o derivan directa o indirectamente de una super clase llamada "Object". Esta clase define los estados 
y comportamientos básicos que todos los objetos deben tener.
Se dice que una clase se extiende indirectamente de Object si esta clase se extiende a otra clase, caso contrario es una clase 
secundaria directa de Object.
Uno de los métodos más utilizados y conocidos de esta es el toString() el cual se utiliza para convertir un objeto en cadena y 
mostrar sus atributos

