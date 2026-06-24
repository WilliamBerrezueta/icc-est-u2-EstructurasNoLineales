## Estructuras No Lineales

# Estudiante:

### William Berrezueta

# Fecha:17/06/2026

## Descripción:

En esta clase utilizamos nodos para guardar datos y enlazarlos con otros nodos por medio de ramas, izquierda y derecha.

## Node

Creamos la clase `Node` que representa un nodo del árbol.
Cada nodo guarda un valor y tiene dos referencias: una al hijo izquierdo y otra al hijo derecho y al momento de crear un nodo, se recibe un valor y sus ramas empiezan como `null`, esta clase es importante porque es la base para formar el árbol.

## IntTree

Creamos la clase `IntTree` que representa un árbol binario que trabaja solo con números enteros y me permite insertar valores de tipo `int`, cuando el número es menor que el nodo actual, se coloca a la izquierda y si es mayor o igual, se coloca a la derecha.
También tiene métodos para recorrer el árbol en:

- InOrden
- PreOrden
- PosOrden

Y tambien podemos calcular la altura del árbol y obtener su tamaño.

### Implementación:

````java
//// metodo InOrden
    public void inOrden(){
        inOrdenRecursivo(root);
    }
    private void inOrdenRecursivo(Node<Integer> actual){
        if (actual == null) {
            return;
        }
        inOrdenRecursivo(actual.getLeft());
        System.out.println(actual);
        inOrdenRecursivo(actual.getRight());
    }

    //// metodo posorden
    public void posOrden(){
        posOrdenRecursivo(root);
    }
    private void posOrdenRecursivo(Node<Integer> actual){
        if (actual == null) {
            return;
        }
        posOrdenRecursivo(actual.getLeft());
        posOrdenRecursivo(actual.getRight());
        System.out.println(actual);
    }

    //// metodo preorden
    public void preOrden(){
        preOrdenRecursivo(root);
    }
    private void preOrdenRecursivo(Node<Integer> actual){
        if (actual == null) {
            return;
        }
        System.out.println(actual);
        preOrdenRecursivo(actual.getLeft());
        preOrdenRecursivo(actual.getRight());
    }

    /// altura

    public int getHeight() {
        return getHeightRecursivo(root);
    }
    private int getHeightRecursivo(Node<Integer> actual) {
        if (actual == null) {
            return 0;
        }
        int heightLeft = getHeightRecursivo(actual.getLeft());
        int heightRight = getHeightRecursivo(actual.getRight());
        int masAlto = Math.max(heightLeft, heightRight);
        return masAlto + 1;
    }

    // peso sin recursividad con complejidad O(1)
    public int getSize(){
        return size;
    }
````
### Captura de salida en consola

````java
Recorrido InOrden:
Node [value=10]
Node [value=30]
Node [value=50]
Node [value=55]
Node [value=60]
Node [value=70]

Recorrido PreOrden:
Node [value=50]
Node [value=10]
Node [value=30]
Node [value=60]
Node [value=55]
Node [value=70]

Recorrido PosOrden:
Node [value=30]
Node [value=10]
Node [value=55]
Node [value=70]
Node [value=60]
Node [value=50]

Altura del árbol:
3

Peso de el árbol:
6
````

## Fecha: 19/06/2026

## BinaryTree

Creamos la clase `BinaryTree` que es una versión genérica del árbol binario y a diferencia de `IntTree`, esta clase puede trabajar con diferentes tipos de datos, siempre que puedan compararsey por eso utilizamos `Comparable`, y el método `add` inserta elementos comparando sus valores, los menores van hacia la izquierda y los mayores o iguales hacia la derecha, y esta también incluye recorridos en InOrden, PreOrden y PosOrden, además de métodos para obtener la altura y el tamaño del árbol, contiene lo mismo que `IntTree` por que es la anetrior, pero modificada.

## Persona

Creamos la clase `Persona` que representa un objeto con nombre y edad, esta clase implementa `Comparable`, por eso sus objetos pueden ser comparados dentro del árbol binario, la comparación se hace primero por edad y si dos personas tienen la misma edad, se comparan por nombre, y esto nos permite insertar personas dentro de un `BinaryTree`.

### Implementación:

````java
private Node<T> addRecursivo(Node<T> actual, Node<T> nodeInsertar){
        if (actual == null) {
            return nodeInsertar;
        }
        if (actual.getValue().compareTo(nodeInsertar.getValue()) > 0){
            actual.setLeft(addRecursivo(actual.getLeft(), nodeInsertar));
        }else{
            actual.setRight(addRecursivo(actual.getRight(), nodeInsertar));
        }
        
        return actual;
````

````java
public class BinaryTree<T extends Comparable<T>> {
````
Lo demas es lo mismo que que `IntTree`, solo cambia esta parte para que sea valido con Strings.

### Captura de salida en consola

````bash
Recorrido InOrden:
Node [value=Persona [nombre=Bob, edad=25]]
Node [value=Persona [nombre=David, edad=28]]
Node [value=Persona [nombre=Alice, edad=30]]
Node [value=Persona [nombre=Eve, edad=32]]
Node [value=Persona [nombre=Charlie, edad=35]]

Recorrido PreOrden:
Node [value=Persona [nombre=Alice, edad=30]]
Node [value=Persona [nombre=Bob, edad=25]]
Node [value=Persona [nombre=David, edad=28]]
Node [value=Persona [nombre=Charlie, edad=35]]
Node [value=Persona [nombre=Eve, edad=32]]

Recorrido PosOrden:
Node [value=Persona [nombre=David, edad=28]]
Node [value=Persona [nombre=Bob, edad=25]]
Node [value=Persona [nombre=Eve, edad=32]]
Node [value=Persona [nombre=Charlie, edad=35]]
Node [value=Persona [nombre=Alice, edad=30]]

Altura del árbol:
3

Peso de el árbol:
5
````