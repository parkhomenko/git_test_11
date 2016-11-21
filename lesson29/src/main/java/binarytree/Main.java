package binarytree;

public class Main {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.add(5, "five");
        binaryTree.add(13, "thirteen");
        binaryTree.add(1, "one");
        binaryTree.add(2, "two");
        binaryTree.add(15, "fifteen");
        binaryTree.add(23, "twenty three");
        binaryTree.add(18, "eighteen");
        binaryTree.add(19, "nineteen");
        binaryTree.add(4, "four");
        binaryTree.add(25, "nineteen");

        //binaryTree.info(); //outputs all elements in sorted order

        //String value = binaryTree.get(19); //outputs nineteen

        binaryTree.breadthFirstTraverse2();
    }
}
