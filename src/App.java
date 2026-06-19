import structures.trees.BinaryTree;
import structures.trees.IntTree;
import models.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        runIntTree();
        runBinaryTree();
    }
    private static void runBinaryTree() {
        BinaryTree<String> arbolString = new BinaryTree<>();
        BinaryTree<Persona> arbolPersona = new BinaryTree<>();

        arbolPersona.add(new Persona("Alice", 30));
        arbolPersona.add(new Persona("Bob", 25));
        arbolPersona.add(new Persona("Charlie", 35));
        arbolPersona.add(new Persona("David", 28));
        arbolPersona.add(new Persona("Eve", 32));

        System.out.println();
        System.out.println("Recorrido InOrden:");
        arbolString.inOrden();

        System.out.println();
        System.out.println("Recorrido PreOrden:");
        arbolString.preOrden();

        System.out.println();
        System.out.println("Recorrido PosOrden:");
        arbolString.posOrden();

        System.out.println();
        System.out.println("Altura del árbol:");
        System.out.println(arbolString.getHeight());

        System.out.println();
        System.out.println("Peso de el árbol:");
        System.out.println(arbolString.getSize());
    }   
    private static void runIntTree() {
        IntTree arbol = new IntTree();

        arbol.add(50);
        arbol.add(30);
        arbol.add(10);
        arbol.add(55);
        arbol.add(60);
        arbol.add(70);

        System.out.println();
        System.out.println("Recorrido InOrden:");
        arbol.inOrden();

        System.out.println();
        System.out.println("Recorrido PreOrden:");
        arbol.preOrden();

        System.out.println();
        System.out.println("Recorrido PosOrden:");
        arbol.posOrden();

        System.out.println();
        System.out.println("Altura del árbol:");
        System.out.println(arbol.getHeight());

        System.out.println();
        System.out.println("Peso de el árbol:");
        System.out.println(arbol.getSize());


        // Node<Integer> nodoUno = new Node<>(50);
        // Node<Integer> nodoDos = new Node<>(10);
        // Node<Integer> nodoTres = new Node<>(30);

        // arbolNumeros.setRoot(nodoUno);
        // nodoUno.setLeft(nodoDos);
        // nodoUno.setRight(nodoTres);
        // System.out.println(arbolNumeros.getRoot());
        // System.out.println(arbolNumeros.getRoot().getLeft());
        // System.out.println(arbolNumeros.getRoot().getRight());
    }
}
