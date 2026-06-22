package structures.trees;

import structures.node.Node;

public class BinaryTree<T extends Comparable<T>> {
    
    
    private Node<T> root;
    
    private int size;

    public BinaryTree() {
        this.root = null;
        this.size = 0;
    }

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }
    public void setRoot(T value) {
        Node<T> node = new Node<T>(value);
        this.root = node;
    }
    public void add(T value){
        Node<T> newNode = new Node<>(value);
        root = addRecursivo(root, newNode);
        size++;
    }
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
    }

    //// metodo InOrden
    public void inOrden(){
        inOrdenRecursivo(root);
    }
    private void inOrdenRecursivo(Node<T> actual){
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
    private void posOrdenRecursivo(Node<T> actual){
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
    private void preOrdenRecursivo(Node<T> actual){
        if (actual == null) {
            return;
        }
        System.out.println(actual);
        preOrdenRecursivo(actual.getLeft());
        preOrdenRecursivo(actual.getRight());
    }

    // altura

    public int getHeight() {
        return getHeightRecursivo(root);
    }
    private int getHeightRecursivo(Node<T> actual) {
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
}

