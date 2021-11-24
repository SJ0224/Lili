public class Node implements Position{
    private Object element;
    Node next;
    Node previous;

    public Node(Object e){
        this.element = e;
    }

    public Object element(){
        return element;
    }
}
