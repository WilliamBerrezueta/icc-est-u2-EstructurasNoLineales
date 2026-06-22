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

## Fecha: 19/06/2026

## BinaryTree

Creamos la clase `BinaryTree` que es una versión genérica del árbol binario y a diferencia de `IntTree`, esta clase puede trabajar con diferentes tipos de datos, siempre que puedan compararsey por eso utilizamos `Comparable`, y el método `add` inserta elementos comparando sus valores, los menores van hacia la izquierda y los mayores o iguales hacia la derecha, y esta también incluye recorridos en InOrden, PreOrden y PosOrden, además de métodos para obtener la altura y el tamaño del árbol, contiene lo mismo que `IntTree` por que es la anetrior, pero modificada.

## Persona

Creamos la clase `Persona` que representa un objeto con nombre y edad, esta clase implementa `Comparable`, por eso sus objetos pueden ser comparados dentro del árbol binario, la comparación se hace primero por edad y si dos personas tienen la misma edad, se comparan por nombre, y esto nos permite insertar personas dentro de un `BinaryTree`.

