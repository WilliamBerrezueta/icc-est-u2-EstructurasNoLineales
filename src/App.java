import structures.node.Node;
import structures.trees.BinaryTree;
import structures.trees.EjercicioDos;
import structures.trees.EjercicioTres;
import structures.trees.EjercicioUno;
import structures.trees.IntTree;
import models.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        runIntTree();
        runBinaryTree();
        runEjercicios();
    }
    private static void runEjercicios() {
        EjercicioUno ejercicioUno = new EjercicioUno();
        int[] numeros = new int[]{5, 3, 7, 2, 4, 6, 8};
        ejercicioUno.insert(numeros);

        // -------

        EjercicioDos ejercicioDos = new EjercicioDos();
        int[] numerosDos = new int[]{4,7,9,6,2,3,1};
        BinaryTree<Integer> tree = new BinaryTree<>();
        for(int numero : numerosDos){
            tree.add(numero);
        }
        Node<Integer> root = tree.getRoot();
        ejercicioDos.invertTree(root);

        // -------

        EjercicioTres ejercicioTres = new EjercicioTres();
        int[] numerosTres = {4, 2, 7, 1, 3, 6, 9};
        BinaryTree<Integer> niveles = new BinaryTree<>();
        for (int numero : numerosTres) {
            niveles.add(numero);
        }
        Node<Integer> actual = niveles.getRoot();
        ejercicioTres.imprimirNiveles(actual);

        
  
    }
    
    private static void runBinaryTree() {
        //BinaryTree<String> arbolString = new BinaryTree<>();
        BinaryTree<Persona> arbolPersona = new BinaryTree<>();

        arbolPersona.add(new Persona("Alice", 30));
        arbolPersona.add(new Persona("Bob", 25));
        arbolPersona.add(new Persona("Charlie", 35));
        arbolPersona.add(new Persona("David", 28));
        arbolPersona.add(new Persona("Eve", 32));

        System.out.println();
        System.out.println("Recorrido InOrden:");
        arbolPersona.inOrden();

        System.out.println();
        System.out.println("Recorrido PreOrden:");
        arbolPersona.preOrden();

        System.out.println();
        System.out.println("Recorrido PosOrden:");
        arbolPersona.posOrden();

        System.out.println();
        System.out.println("Altura del árbol:");
        System.out.println(arbolPersona.getHeight());

        System.out.println();
        System.out.println("Peso de el árbol:");
        System.out.println(arbolPersona.getSize());
    }   
    private static void runIntTree() {
        IntTree arbol = new IntTree();

        arbol.add(50);
        arbol.add(10);
        arbol.add(60);
        arbol.add(30);
        arbol.add(55);
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
