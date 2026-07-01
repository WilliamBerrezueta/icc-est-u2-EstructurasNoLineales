import structures.node.Node;
import structures.trees.BinaryTree;
import structures.trees.EjercicioCuatro;
import structures.trees.EjercicioDos;
import structures.trees.EjercicioTres;
import structures.trees.EjercicioUno;
import structures.trees.IntTree;

import java.util.HashSet;
import java.util.Set;

import collections.Sets;
import collections.maps.Maps;
import models.Contacto;
import models.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        // runSets();
        runMaps();
        runPersonas();
    //     runIntTree();
    //     runBinaryTree();
    //     runEjercicios();
    // }
    // private static void runEjercicios() {
    //     EjercicioUno ejercicioUno = new EjercicioUno();
    //     int[] numeros = new int[]{5, 3, 7, 2, 4, 6, 8};
    //     System.out.println();
    //     System.out.println("Ejercicio Uno");
    //     ejercicioUno.insert(numeros);

    //     // -------

    //     EjercicioDos ejercicioDos = new EjercicioDos();
    //     int[] numerosDos = new int[]{4,7,9,6,2,3,1};
    //     BinaryTree<Integer> tree = new BinaryTree<>();
    //     for(int numero : numerosDos){
    //         tree.add(numero);
    //     }
    //     Node<Integer> root = tree.getRoot();
    //     ejercicioDos.invertTree(root);

    //     // -------

    //     EjercicioTres ejercicioTres = new EjercicioTres();
    //     int[] numerosTres = {4, 3, 8, 1, 3, 6, 9};
    //     BinaryTree<Integer> niveles = new BinaryTree<>();
    //     for (int numero : numerosTres) {
    //         niveles.add(numero);
    //     }
    //     Node<Integer> actual = niveles.getRoot();
    //     ejercicioTres.imprimirNiveles(actual);

    //     // --------

    //     EjercicioCuatro ejercicioCuatro = new EjercicioCuatro();
    //     int[] numerosCuatro = {5,2,7,1,3,8,9};
    //     BinaryTree<Integer> fondo = new BinaryTree<>();
    //     for (int numero : numerosCuatro) {
    //         fondo.add(numero);
    //     }
    //     Node<Integer> now = fondo.getRoot();
    //     System.out.println();
    //     System.out.println("Ejercicio Cuatro");
    //     ejercicioCuatro.arbolNormal(now);
    //     int profundidad = ejercicioCuatro.maxDepth(now);
    //     System.out.println();
    //     System.out.println("Profundidad máxima: " + profundidad);

    //     ///////////////////////////////////////////////////
    //     /// //////////////////////////////////////////////7
    //     /// CASOS DE PRUEBA
    //     ///////////////////////////////////////////////////
    //     /// 
    //     probarTodos(new int[]{});
    //     probarTodos(new int[]{4});
    //     probarTodos(new int[]{4, 2, 7, 1, 3, 6, 9});
    //     probarTodos(new int[]{1, 2, 3, 4});
    // }

    // public static void probarTodos(int[] numeros) {

    //     System.out.println();

    //     EjercicioUno ejercicioUno = new EjercicioUno();
    //     EjercicioDos ejercicioDos = new EjercicioDos();
    //     EjercicioTres ejercicioTres = new EjercicioTres();
    //     EjercicioCuatro ejercicioCuatro = new EjercicioCuatro();

    //     System.out.println();
    //     System.out.println("Ejercicio Uno:");
    //     ejercicioUno.insert(numeros);

    //     System.out.println();
    //     ejercicioDos.invertTree(crearArbol(numeros).getRoot());

    //     System.out.println();
    //     ejercicioTres.imprimirNiveles(crearArbol(numeros).getRoot());

    //     System.out.println();
    //     System.out.println("Ejercicio Cuatro:");
    //     Node<Integer> root = crearArbol(numeros).getRoot();
    //     ejercicioCuatro.arbolNormal(root);
    //     System.out.println("Profundidad máxima: " + ejercicioCuatro.maxDepth(root));
    // }
    // public static BinaryTree<Integer> crearArbol(int[] numeros) {
    //     BinaryTree<Integer> tree = new BinaryTree<>();
    //     for (int numero : numeros) {
    //         tree.add(numero);
    //     }
    //     return tree;
    // }
    
    // private static void runBinaryTree() {
    //     //BinaryTree<String> arbolString = new BinaryTree<>();
    //     BinaryTree<Persona> arbolPersona = new BinaryTree<>();

    //     arbolPersona.add(new Persona("Alice", 30));
    //     arbolPersona.add(new Persona("Bob", 25));
    //     arbolPersona.add(new Persona("Charlie", 35));
    //     arbolPersona.add(new Persona("David", 28));
    //     arbolPersona.add(new Persona("Eve", 32));

    //     System.out.println();
    //     System.out.println("Recorrido InOrden:");
    //     arbolPersona.inOrden();

    //     System.out.println();
    //     System.out.println("Recorrido PreOrden:");
    //     arbolPersona.preOrden();

    //     System.out.println();
    //     System.out.println("Recorrido PosOrden:");
    //     arbolPersona.posOrden();

    //     System.out.println();
    //     System.out.println("Altura del árbol:");
    //     System.out.println(arbolPersona.getHeight());

    //     System.out.println();
    //     System.out.println("Peso de el árbol:");
    //     System.out.println(arbolPersona.getSize());
    // }   
    // private static void runIntTree() {
    //     IntTree arbol = new IntTree();

    //     arbol.add(50);
    //     arbol.add(10);
    //     arbol.add(60);
    //     arbol.add(30);
    //     arbol.add(55);
    //     arbol.add(70);

    //     System.out.println();
    //     System.out.println("Recorrido InOrden:");
    //     arbol.inOrden();

    //     System.out.println();
    //     System.out.println("Recorrido PreOrden:");
    //     arbol.preOrden();

    //     System.out.println();
    //     System.out.println("Recorrido PosOrden:");
    //     arbol.posOrden();

    //     System.out.println();
    //     System.out.println("Altura del árbol:");
    //     System.out.println(arbol.getHeight());

    //     System.out.println();
    //     System.out.println("Peso de el árbol:");
    //     System.out.println(arbol.getSize());


    //     // Node<Integer> nodoUno = new Node<>(50);
    //     // Node<Integer> nodoDos = new Node<>(10);
    //     // Node<Integer> nodoTres = new Node<>(30);

    //     // arbolNumeros.setRoot(nodoUno);
    //     // nodoUno.setLeft(nodoDos);
    //     // nodoUno.setRight(nodoTres);
    //     // System.out.println(arbolNumeros.getRoot());
    //     // System.out.println(arbolNumeros.getRoot().getLeft());
    //     // System.out.println(arbolNumeros.getRoot().getRight());
    // }
}

    private static void runMaps() {
        Maps maps = new Maps();
        maps.construirHashMap();
        maps.construirLInkedHashMap();
        maps.construirTreeMap();
    }
    

    // private static void runSets() {
    //     Sets sets = new Sets();

    //     // Implementacion -> HashSet hashSet
    //     System.out.println();
    //     System.out.println("* HashCode");
    //     System.out.println();
    //     Set<String> hashSet = sets.construirHashSet();
    //     System.out.println(hashSet);
    //     System.out.println("Size: " + hashSet.size());
    //     System.out.println();
    //     System.out.println("Existe una F?");
    //     System.out.println(hashSet.contains("F"));

    //     // Implementacion -> LinkedHashSet lSet
    //     System.out.println();
    //     System.out.println("* LinkedHashCode");
    //     System.out.println();
    //     Set<String> lSet = sets.construirLinkedHashSet();
    //     System.out.println(lSet);
    //     System.out.println("Size: " + lSet.size());
    //     System.out.println();
    //     System.out.println("Existe una F?");
    //     System.out.println(lSet.contains("F"));

    //     // Implementacion -> treeSet tSet
    //     System.out.println();
    //     System.out.println("* treeSet");
    //     System.out.println();
    //     Set<String> tSet = sets.construirTreeSet();
    //     System.out.println(tSet);
    //     System.out.println("Size: " + tSet.size());
    //     System.out.println();
    //     System.out.println("Existe una F?");
    //     System.out.println(tSet.contains("F"));

    //     // Implementacion -> Hash Contacto Set hashCode
    //     System.out.println();
    //     System.out.println("* Hash Contacto Set hashCode");
    //     System.out.println();
    //     Set<Contacto> hCSet = sets.construirHasSetContacto();
    //     System.out.println(hCSet);
    //     System.out.println("Size: " + hCSet.size());
        
    //     // Implementacion -> Tree Contacto Set hashCode
    //     System.out.println();
    //     System.out.println("* Tree Contacto Set hashCode");
    //     System.out.println();
    //     Set<Contacto> tCSet = sets.construirTreeSetContacto();
    //     System.out.println(tCSet);
    //     System.out.println("Size: " + tCSet.size());
    // }
}