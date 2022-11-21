package tree;

public class TreeMainMethod {
    public static void main(String[] args) {
        Node tree = new Node(15);

        tree.insert(2);
        tree.insert(10);
        tree.insert(5);
        tree.insert(45);
        System.out.println(tree.contains(1));

        tree.printInOrder();
    }
}
