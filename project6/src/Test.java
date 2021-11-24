public class Test {
    public static void main(String[] args) {
        DoubleLinkedList l = new DoubleLinkedList();
        for(int i = 0; i < 10; i++){
            l.insertLast(i);
        }
        l.print();
        l.insertLast(11);
        l.print();
        l.insertFirst(100);
        l.print();
        l.insertBefore(l.last(),99);
        l.print();
        l.insertBefore(l.first(),98);
        l.print();
        l.insertAfter(l.first(),97);
        l.print();
        l.insertAfter(l.last(),96);
        l.print();
        l.remove(l.last());
        l.print();
    }
}
