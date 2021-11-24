public class DoubleLinkedList implements List{
    private Node first;
    private Node last;
    private int size;

    public Node first(){
        return first;
    }

    public Node last(){
        return last;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public Node after(Position p){
        if(p instanceof Node){
            Node node = (Node)p;
            return node.next;
        }
        System.out.println("error! Need a Node here!");
        return null;
    }

    public Node before(Position p){
        if(p instanceof Node){
            Node node = (Node)p;
            return node.previous;
        }
        System.out.println("error! Need a Node here!");
        return null;
    }

    public Node insertFirst(Object d){
        Node node = new Node(d);
        if(isEmpty()){
            first = node;
            last = node;
            size++;
            return node;
        }
        node.next = first;
        first.previous = node;
        first = node;
        size++;
        return node;
    }

    public Node insertLast(Object d){
        Node node = new Node(d);
        if(isEmpty()){
            first = node;
            last = node;
            size++;
            return node;
        }
        node.previous = last;
        last.next = node;
        last = node;
        size++;
        return node;
    }

    public Node insertAfter(Position p,Object d) {
        if(p instanceof Node) {
            Node n = (Node) p;
            if( n == last){
                return insertLast(d);
            }
            Node node = new Node(d);
            node.previous = n;
            node.next = n.next;
            n.next.previous = node;
            n.next = node;
            size++;
            return node;
        }
        else {
            System.out.println("error! need a Node here!");
            return null;
        }
    }

    public Node insertBefore(Position p,Object d){
        if(p instanceof Node) {
            Node n = (Node) p;
            if(n == first){
            return insertFirst(d);
            }
            Node node = new Node(d);
            node.next = n;
            node.previous = n.previous;
            n.previous.next = node;
            n.previous = node;
            size++;
            return node;
        }
        else {
            System.out.println("error! need a Node here!");
            return null;
        }
    }

    public Object remove(Position p) {
        if (p instanceof Node) {
            Node n = (Node) p;
            if (n == last) {
                n.previous.next = null;
            } else if (n == first) {
                n.next.previous = null;
            } else {
                n.previous.next = n.next;
                n.next.previous = n.previous;
            }
            Object temp = n.element();
            size--;
            return temp;
        }
        else {
            System.out.println("error! need a Node here!");
            return null;
        }
    }

    public void print(){
        Node n = first;
        System.out.println("list:");
        for(int i = 0;i < size;i++){
            System.out.print(n.element() + " ");
            n  =n.next;
        }
        System.out.println("size: " + size + "\n");
    }

}
