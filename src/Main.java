public class Main {
    public static void main(String[] args) {
        ListaCircular list= new ListaCircular();
        list.addNode(new Node("A"));
        list.addNode(new Node("L"));
        list.addNode(new Node("C"));
        // Agregar al principio
        list.addNode(new Node("Z"));

        list.addNode(new Node("M"))



        list.print();
    }
}