class Node {
    private Node left, right;
    private int data;

    Node(int key) {
        this.data= key;
        left = null;
        right = null;
    }

    private Node search(Node root, int key) {
        if(root == null | root.data == key) {
            return root;
        }
        if(root.data < key) {
            return search(root.right, key);
        }
        return search(root.left, key);
    }
}
