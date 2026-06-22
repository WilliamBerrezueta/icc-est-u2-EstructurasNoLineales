package structures.trees;

import structures.node.Node;

public class IntTree {

    private Node<Integer> root;
    private int size;

    public IntTree() {
        this.root = null;
        this.size = 0;
    }

    public Node<Integer> getRoot() {
        return root;
    }

    public void setRoot(Node<Integer> root) {
        this.root = root;
    }
    public void setRoot(Integer value) {
        Node<Integer> node = new Node<Integer>(value);
        this.root = node;
    }
    public void add(int value){
        Node<Integer> newNode = new Node<>(value);
        root = addRecursivo(root, newNode);
        size++;
    }
    private Node<Integer> addRecursivo(Node<Integer> actual, Node<Integer> nodeInsertar){
        if (actual == null) {
            return nodeInsertar;
        }
        if (nodeInsertar.getValue() < actual.getValue()){
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
}