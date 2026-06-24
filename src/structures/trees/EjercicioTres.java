package structures.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import structures.node.Node;

public class EjercicioTres {

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

        System.out.println();
        System.out.println("Ejercicio Tres");

        System.out.println();
        System.out.println("Árbol normal:");
        printTreeRecursivo(root, 0);
        System.out.println();

        System.out.println();
        System.out.println("Niveles en listas enlazadas:");
        System.out.println();

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
        
}