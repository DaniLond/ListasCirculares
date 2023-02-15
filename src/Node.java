public class Node {
    private Node next;
    private Node Prev;

    private String nameNodo;

    public Node(String nameNodo) {
        this.nameNodo = nameNodo;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrev() {
        return Prev;
    }

    public String getNameNodo() {
        return nameNodo;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setPrev(Node prev) {
        Prev = prev;
    }

    public void setNameNodo(String nameNodo) {
        this.nameNodo = nameNodo;
    }
}
