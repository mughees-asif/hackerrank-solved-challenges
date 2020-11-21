package com.mughees;

class Node {
    private int data;
    private Node left, right;

    void preOrder(Node root) {
        if(root == null)    return;
        System.out.println(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    void postOrder(Node root) {
        if(root == null)    return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data + " ");
    }

    void inOrder(Node root) {
        if(root == null)    return;
        inOrder(root.left);
        System.out.println(root.data + " ");
        inOrder(root.right);
    }
}



