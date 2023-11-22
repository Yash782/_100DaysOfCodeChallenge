package Day_49;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(1);
        list.insertFirst(21);
        list.insertFirst(123);
        list.insertFirst(15);
        list.insertFirst(18);
        list.insertFirst(45);
        list.insertFirst(78);
        list.insertFirst(89);

        list.insertLast(100);

        list.insertAt(200, 4);

        list.display();

        list.deleteFirst();

        list.display();

        list.deleteLast();

        list.delete(3);

        list.display();

        list.reverse();

        list.display();

    }
}
