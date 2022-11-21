package tree;

public class TreeMainMethod {
    public static void main(String[] args) {
        Node tree = new Node(10);

        tree.insert(5);
        tree.insert(8);
        tree.insert(15);


        //System.out.println(tree.contains(1));

        System.out.println("In Order: ");

        tree.printInOrder();

        System.out.println("Pre Order: ");
        tree.printPreOrder();

        System.out.println("Post Order: ");
        tree.printPostOrder();
    }
}
