import structures.node.Node;
import structures.trees.IntTree;

public class App {
    public static void main(String[] args) throws Exception {
        runIntTree();
    }
    private static void runIntTree() {
        IntTree arbolNumeros = new IntTree();
        arbolNumeros.add(50);
        arbolNumeros.add(10);
        arbolNumeros.add(30);
        arbolNumeros.add(60);
        arbolNumeros.add(75);
        arbolNumeros.add(55);

        System.out.println(arbolNumeros.getRoot());
        System.out.println(arbolNumeros.getRoot().getLeft());
        System.out.println(arbolNumeros.getRoot().getRight());


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
