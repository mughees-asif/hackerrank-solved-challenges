public class Node {
    private Node left, right;
    private int data;

    Node(int key) {
        this.data = key;
    }

    private int diameter(Node root) {
        if (root == null) return 0;
        // heights
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        // diameters
        int diameterLeft = diameter(root.left);
        int diameterRight = diameter(root.right);

        return Math.max(leftHeight + rightHeight + 1, Math.max(diameterLeft, diameterRight));
    }

    private int height(Node root) {
        if (root == null) return 0;
        return Math.max(1 + height(root.left), height(root.right));
    }
}
