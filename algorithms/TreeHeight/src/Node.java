class Node {
    private int data;
    private Node left, right;

    private int height(Node root) {
        if(root == null)    return -1;
        return 1 + Math.min(height(root.left), height(root.right));
    }
}
