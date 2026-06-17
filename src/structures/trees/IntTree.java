package structures.trees;

import structures.node.Node;

public class IntTree {

    private Node<Integer> root;

    public IntTree() {
        this.root = null;
        
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
}
