package structures.trees;

import structures.node.Node;

public class EjercicioCuatro {
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
    private void printTreeRecursivo(Node actual, int nivel){
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
