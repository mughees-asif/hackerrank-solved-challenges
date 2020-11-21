package com.mughees;

class Node {
    private int data;
    private Node left, right;

    // root -> left -> right
    private void preOrder(Node root) {
        if(root == null)    return;
        System.out.println(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // left -> right -> root
    private void postOrder(Node root) {
        if(root == null)    return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data + " ");
    }

    // left -> root -> right
    private void inOrder(Node root) {
        if(root == null)    return;
        inOrder(root.left);
        System.out.println(root.data + " ");
        inOrder(root.right);
    }
}



