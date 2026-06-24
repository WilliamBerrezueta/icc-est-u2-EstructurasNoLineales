# Ejercicios de lógica con estructuras no lineales: árboles
## Estudiante: William Berrezueta
### Fecha: 24/06/2026

## Descripción:

En esta practica aplicamos árboles binarios en 4 ejercicios, desarrollamos la inserción de nodos, inversión de ramas, recorrido por niveles y cálculo de la profundidad máxima.
Durante el desarrollo utilizamos estructuras genéricas, nodos enlazados y recorridos recursivos y támbien realizamos distintos casos de prueba para verificar el funcionamiento de cada código, incluyendo árboles vacíos, árboles de un solo nodo, árboles con varios niveles y árboles con nodos a la izquierda.

## Ejercicio 01: Insert en BST

````java
public void insert(int[] numeros) {

        // CREA EL ARBOL DE ENTEROS
        BinaryTree<Integer> tree = new BinaryTree<>();

    }

    private void printTree(Node<Integer> root) {
        System.out.println();
        System.out.println("Imprimiendo el árbol");
        printTreeRecursivo(root, 0);
    }

    private void printTreeRecursivo(Node<Integer> actual, int nivel){
        if (actual == null) {
            return;
        }
        printTreeRecursivo(actual.getRight(), nivel + 1);
        for (int i = 0; i < nivel; i++) {
            System.out.print("\t");
        }
        System.out.println(actual.getValue());
        printTreeRecursivo(actual.getLeft(), nivel + 1);
    }
````

## Explicación:
En esta clase se crea un árbol binario a partir de una lista de números que se le pasa como parámetroy dentro del método se instancia un árbol binario y, mediante un for, se van insertando todos los valores del arreglo para después imprimir el árbol usando un método recursivo, el cual va bajando por los nodos y aumentando el nivel cada vez que avanza pero antes de imprimir cada valor, se usa un for para agregar los espacios necesarios dependiendo del nivel donde se encuentre el nodo, se vuelve a llamar al método recursivo para seguir recorriendo el árbol.
El árbol se imprime de forma horizontal o de lado, ya que el método recursivo primero visita el hijo derecho, luego imprime el nodo actual con espacios según su nivel, y finalmente visita el hijo izquierdo, utilizo esta misma manera de imprimir los árboles para los demas ejercicios.

````java
Ejercicio Uno

Node [value=2]
Node [value=3]
Node [value=4]
Node [value=5]
Node [value=6]
Node [value=7]
Node [value=8]

Imprimiendo el árbol
                8
        7
                6
5
                4
        3
                2
````
### Observación:
Los nodos se insertan correctamente en el árbol binario, siendo la estructura final una impresión horizonatal.

## Ejercicio 02: Invertir árbol binario
````java
private void printTree(Node<Integer> actual, int nivel) {
        if (actual == null) {
            return;
        }
        printTree(actual.getRight(), nivel + 1);
        for (int i = 0; i < nivel; i++) {
            System.out.print("\t");
        }
        System.out.println(actual.getValue());
        printTree(actual.getLeft(), nivel + 1);
    }
    private void invertirRamas(Node<Integer> actual) {
        if (actual == null) {
            return;
        }
        Node<Integer> aux = actual.getLeft();
        actual.setLeft(actual.getRight());
        actual.setRight(aux);
        invertirRamas(actual.getLeft());
        invertirRamas(actual.getRight());
    }  
````

## Explicación:
La funcionalidad de esta clase es invertir las ramas de un árbol binario y primero se recibe la raíz del árbol como parámetro y se imprime el árbol normal, luego se llama a un método recursivo que recorre cada nodo del árbol y en ese método se guarda temporalmente el hijo izquierdo, después el hijo izquierdo se cambia por el hijo derecho y el hijo derecho toma el valor guardado, este proceso se repite en todos los nodos hasta que el árbol queda completamente invertido, al final se imprime el árbol invertido.

````java
Ejercicio Dos

Árbol normal:
                9
        7
                6
4
                3
        2
                1

Árbol invertido:
                1
        2
                3
4
                6
        7
                9
````
### Observación:
Al intercambiar los hijos izquierdos y derechos de cada nodo, el arbol queda invertido, manteniendo la raiz igual, y cantidad de nodos.

## Ejercicio 03: Listar niveles
````java
public List<List<Node>> listLevels(Node root){

        List<List<Node>> niveles = new ArrayList<>();
        llenarNiveles(root, 0, niveles);
        return niveles;
    }
    private void llenarNiveles(Node actual, int nivel, List<List<Node>> niveles) {
        if (actual == null) {
            return;
        }
        if (niveles.size() == nivel) {
            niveles.add(new LinkedList<>());
        }
        niveles.get(nivel).add(actual);

        llenarNiveles(actual.getLeft(), nivel + 1, niveles);
        llenarNiveles(actual.getRight(), nivel + 1, niveles);
    }
    public void imprimirNiveles(Node root) {

        List<List<Node>> niveles = listLevels(root);

        for (List<Node> nivel : niveles) {
            for (int i = 0; i < nivel.size(); i++) {
                System.out.print(nivel.get(i).getValue());
                if (i < nivel.size() - 1) {
                    System.out.print(" -> ");
                }
            }
            System.out.println();
        }
    }
````

## Explicación:
Esta clase retorna una lista con los nodos de cada nivel del árbol binario, el método recibe la raíz del árbol y crea una lista principal donde se guardarán las listas de cada nivel y luego se llama a un método recursivo que recibe el nodo actual, el nivel donde se encuentra y la lista principal y si el nivel todavía no existe dentro de la lista, se crea una nueva lista enlazada, después se agrega el nodo actual en la lista correspondiente a su nivel, el método se vuelve a llamar con el hijo izquierdo y el hijo derecho, aumentando el nivel en mas uno.

````java
Ejercicio Tres

Árbol normal:
                9
        8
                6
4
                3
        3
                1


Niveles en listas enlazadas:

4
3 -> 8
1 -> 3 -> 6 -> 9
````
### Observación:
Los nodos pueden organizarse por niveles utilizando listas enlazadas.

## Ejercicio 04: Profundidad máxima
````java
public int maxDepth(Node root){
        return maxDepthRecursivo(root);
    }
    private int maxDepthRecursivo(Node root) {
        if(root == null){
            return 0;
        }
        int DepthLeft = maxDepthRecursivo(root.getLeft());
        int DepthRight = maxDepthRecursivo(root.getRight());
        return Math.max(DepthLeft, DepthRight)+1;
    }
    public void arbolNormal(Node root){
        System.out.println();
        System.out.println("Arbol normal:");
        printTreeRecursivo(root, 0);
    }
````

## Explicación:
En esta clase se calcula la profundidad máxima de un árbol binario y el método recibe la raíz del árbol y llama a un método recursivoy si el nodo actual es nulo, retorna cero porque ya no hay más niveles, despues se calcula la profundidad del lado izquierdo y la profundidad del lado derecho y después se compara cuál de las dos profundidades es mayor usando Math.max, se suma uno para contar el nodo actual y se retorna la profundidad máxima del árbol.

````java
Ejercicio Cuatro

Arbol normal:
                        9
                8
        7
5
                3
        2
                1

Profundidad máxima: 4
````
### Observación:
La profundidad del árbol depende de la longitud del camino más largo desde la raíz hasta una hoja.

# CASOS DE PRUEBA

````java
/// CASOS DE PRUEBA
        ///////////////////////////////////////////////////
        /// 
        probarTodos(new int[]{});
        probarTodos(new int[]{4});
        probarTodos(new int[]{4, 2, 7, 1, 3, 6, 9});
        probarTodos(new int[]{1, 2, 3, 4});
````

## Arbol vacío

````java
Ejercicio Uno:


Imprimiendo el árbol


Ejercicio Dos

Árbol normal:

Árbol invertido:


Ejercicio Tres

Árbol normal:


Niveles en listas enlazadas:


Ejercicio Cuatro:

Arbol normal:
Profundidad máxima: 0
````

## Arbol con un solo nodo

````bash
Ejercicio Uno:

Node [value=4]

Imprimiendo el árbol
4


Ejercicio Dos

Árbol normal:
4

Árbol invertido:
4


Ejercicio Tres

Árbol normal:
4


Niveles en listas enlazadas:

4

Ejercicio Cuatro:

Arbol normal:
4
Profundidad máxima: 1

````
## Arbol con varios niveles

````bash
Ejercicio Uno:

Node [value=1]
Node [value=2]
Node [value=3]
Node [value=4]
Node [value=6]
Node [value=7]
Node [value=9]

Imprimiendo el árbol
                9
        7
                6
4
                3
        2
                1


Ejercicio Dos

Árbol normal:
                9
        7
                6
4
                3
        2
                1

Árbol invertido:
                1
        2
                3
4
                6
        7
                9


Ejercicio Tres

Árbol normal:
                9
        7
                6
4
                3
        2
                1


Niveles en listas enlazadas:

4
2 -> 7
1 -> 3 -> 6 -> 9

Ejercicio Cuatro:

Arbol normal:
                9
        7
                6
4
                3
        2
                1
Profundidad máxima: 3
````
## Arbol solo hacia la derecha

````bash
Ejercicio Uno:

Node [value=1]
Node [value=2]
Node [value=3]
Node [value=4]

Imprimiendo el árbol
                        4
                3
        2
1


Ejercicio Dos

Árbol normal:
                        4
                3
        2
1

Árbol invertido:
1
        2
                3
                        4


Ejercicio Tres

Árbol normal:
                        4
                3
        2
1


Niveles en listas enlazadas:

1
2
3
4

Ejercicio Cuatro:

Arbol normal:
                        4
                3
        2
1
Profundidad máxima: 4
````