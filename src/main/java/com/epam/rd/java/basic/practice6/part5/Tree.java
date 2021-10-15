package com.epam.rd.java.basic.practice6.part5;

public class Tree<E extends Comparable<E>>{
    private Node<E> root;
    private Node<E> parent;
    private Node<E> current;
    private static final String INDENT = "  ";
    //private static final Logger logger = Logger.getLogger(Tree.class.getName());

    public void setParent(Node<E> parent) {
        this.parent = parent;
    }

    public void setCurrent(Node<E> current) {
        this.current = current;
    }

    public boolean add(E e) {
        if (root == null) {
            root = new Node<>(null, e, null);
            return true;
        }
        return add(root, e);
    }

    public boolean add(Node<E> node, E e) {
        if (e.compareTo(node.element) < 0) {
            if (node.left == null) {
                node.left = new Node<>(null, e, null);
                return true;
            }
            return add(node.left, e);
        }
        if (e.compareTo(node.element) > 0) {
            if (node.right == null) {
                node.right = new Node<>(null, e, null);
                return true;
            }
            return add(node.right, e);
        }
        return false;
    }

    public void add(E[] elements) {
        for (E element : elements) {
            add(element);
        }
    }

    public boolean remove(E element) {
        final int left = -1;
        final int right = 1;
        final int noStep = 0;

        setParent(null);
        setCurrent(root);
        int lastStep = noStep;

        lastStep = removeCurrent(element, left, right, lastStep);
        if (current == null) {
            return false;
        }
        if (current.left == null) {
            if (lastStep == right) {
                parent.right = current.right;
            } else if (lastStep == left) {
                parent.left = current.right;
            } else {
                root = current.right;
            }
        } else if (current.right == null) {
            if (lastStep == right) {
                parent.right = current.left;
            } else if (lastStep == left) {
                parent.left = current.left;
            } else {
                root = current.left;
            }
        } else {
            Node<E> nodeToRemove = current.right;
            parent = current;
            while (nodeToRemove.left != null) {
                parent = nodeToRemove;
                nodeToRemove = nodeToRemove.left;
            }
            current.element = nodeToRemove.element;
            extracted(nodeToRemove);
        }
        return true;
    }

    private int removeCurrent(E element, int left, int right, int lastStep) {
        int comp;
        while (current != null && (comp = current.element.compareTo(element)) != 0) {
            parent = current;
            if (comp < 0) {
                lastStep = right;
                current = current.right;
            } else {
                lastStep = left;
                current = current.left;
            }
        }
        return lastStep;
    }

    private void extracted(Node<E> nodeToReplace) {
        if (parent.equals(current)) {
            parent.right = nodeToReplace.right;
        } else {
            parent.left = nodeToReplace.right;
        }
    }

    public void print() {
        print(root, "");
    }

    private void print(final Node<E> current, final String indent) {
        if (current == null) {
            return;
        }
        print(current.left, indent + INDENT);
        System.out.println(indent + current.element);
        print(current.right, indent + INDENT);
    }
 
    private static final class Node<E> {

        private E element;
        private Node<E> left;
        private Node<E> right;

        Node(Node<E> left, E element, Node<E> right) {
            this.left = left;
            this.element = element;
            this.right = right;
        }
    }
}
