package binarytree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {

    private Node root;

    public void add(int key, String value) {
        Node node = new Node();
        node.key = key;
        node.value = value;

        if (root == null) {
            root = node;
            return;
        }

        Node current = root;
        while (true) {
            if (key == current.key) {
                current.value = value;
                return;
            }

            if (key < current.key) {
                if (current.left == null) {
                    current.left = node;
                    return;
                }
                current = current.left;
            } else {
                if (current.right == null) {
                    current.right = node;
                    return;
                }
                current = current.right;
            }
        }
    }

    public void breadthFirstTraverse() {
        Queue<Node> elements = new LinkedList<Node>();
        elements.add(root);

        while (!elements.isEmpty()) {
            Node node = elements.poll();
            System.out.println(node.key + " - " + node.value);

            if (node.left != null) {
                elements.add(node.left);
            }

            if (node.right != null) {
                elements.add(node.right);
            }
        }
    }

    public void breadthFirstTraverse2() {
        Stack<Node> elements = new Stack<Node>();
        elements.push(root);

        while (!elements.isEmpty()) {
            Node node = elements.pop();
            System.out.println(node.key + " - " + node.value);

            if (node.left != null) {
                elements.push(node.left);
            }

            if (node.right != null) {
                elements.push(node.right);
            }
        }
    }

    public String get(int key) {
        return "";
    }

    public void info() {
        traverse(root);
    }

    public void traverse(Node node) {
        if (node == null) {
            return;
        }

        traverse(node.left);
        System.out.println(node.key + " - " + node.value);
        traverse(node.right);
    }

    private class Node {
        private int key;
        private String value;

        private Node left;
        private Node right;
    }
}
