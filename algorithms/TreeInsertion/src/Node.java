public class Node {
    Node left, right;
    int data;

    private Node(int item) {
        data = item;
        left = right = null;
    }

    private Node insertNode(Node root, int key) {
        // base case: root node is null
        if (root == null) {
            root = new Node(key);
            return root;
        }

        // boolean check to see which leaf to insert new node
        if(key < root.data) {
            root.left = insertNode(root.left, key);
        } else if (key > root.data) {
            root.right = insertNode(root.right, key);
        }
        return root;
    }
}
