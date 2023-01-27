package QueueDS;

public class QueueMainMethod {
    public static void main(String[] args) throws Exception {

        CircularQueueImplementation q = new CircularQueueImplementation();

        q.insert(2);
        q.insert(3);
        q.insert(100);
        q.insert(92);

        q.display();

        System.out.println(q.remove());
        q.insert(133);
        q.display();

        System.out.println(q.remove());
        q.insert(99);
        q.display();
    }
}
