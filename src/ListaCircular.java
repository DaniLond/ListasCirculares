public class ListaCircular {

    private Node head;

    public void addNode(Node node){
        if(head == null){
            head= node;
            head.setNext(head);
            head.setPrev(head);
        }else{
            Node tail= head.getPrev();
            node.setNext(head);
            head.setPrev(node);
            tail.setNext(node);
            node.setPrev(tail);
        }
    }


    public void print(){
        if(head == null){
            System.out.println("Lista vacia");
        }
        print(head);
    }

    public void print(Node node){
        if (head == node.getNext()){
            System.out.println(node.getNameNodo());
            return;
        }else{
            System.out.println(node.getNameNodo());
            print(node.getNext());
        }
    }

    public void delete(String goal){
        if(head == null){
            System.out.println("Lista vacia");
        } else if(head == head.getNext()){
            head= null;
        }else {
           delete(head , goal);
        }
    }

    private void delete(Node current, String name){
        if(current.getNameNodo().equals(name)){
            if(current == head){
                Node prev= head.getPrev();
                Node next= head.getNext();
                next.setPrev(prev);
                prev.setNext(next);
                head=next;
            }else {
                Node prev= current.getPrev();
                Node next= current.getNext();
                prev.setNext(next);
                next.setPrev(prev);
            }
            return;
        }
        if (current.getNext() == head){
            return;
        }
        delete(current.getNext() , name);
    }

}
