package structures.trees;

import structures.node.Node;

public class EjercicioUno {

    public void insert(int[] numeros) {

        // CREA EL ARBOL DE ENTEROS
        BinaryTree<Integer> tree = new BinaryTree<>();

        // INSERTAR CADA CODIGO
        for (int numero : numeros) {
            tree.add(numero);
        }

        // IMPRIMIR EL ARBOL
        System.out.println();
        tree.inOrden();
        printTree(tree.getRoot());


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
        
}
