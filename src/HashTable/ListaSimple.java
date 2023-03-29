
package HashTable;

public class ListaSimple<T> {

    private Nodo head;
    private int size;

    public ListaSimple() {
        this.head = null;
        this.size = 0;
    }

    public Nodo getHead() {
        return head;
    }

    public void setHead(Nodo head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    public boolean isEmpty(){//para saber si la lista esta vacia 
        return head == null;
    }
    
    
    public Nodo insertBegin(Object data){
        Nodo node = new Nodo(data);
        if(isEmpty()){
            setHead(node);
        }else{
            node.setNext(head);
            setHead(node);
        }
        size++;
        return node;
    }
    
    public void insertOrdered(T data) {
    Nodo node = new Nodo(data);
    if (isEmpty()) {
        setHead(node);
    } else if (String.valueOf(data).compareToIgnoreCase(String.valueOf(getHead().getData())) <= 0) {
        node.setNext(getHead());
        setHead(node);
    } else {
        Nodo current = getHead();
        while (current.getNext() != null && String.valueOf(data).compareToIgnoreCase(String.valueOf(current.getNext().getData())) > 0) {
            current = current.getNext();
        }
        node.setNext(current.getNext());
        current.setNext(node);
    }
    size++;
}

    
    
    public Nodo deleteBegin(){
        if (!isEmpty()){
            Nodo pointer = getHead();
            setHead(pointer.getNext());
            pointer.setNext(null);
            size--;
            return pointer;
        }
        return null;
    }
    
    public Nodo deleteFinal(){
        if (!isEmpty()){
            Nodo pointer = getHead();
            if (getSize() == 1) {
                setHead(null);
                size--;
            } else {
                while (pointer.getNext() != null && pointer.getNext().getNext() != null){
                    pointer = pointer.getNext();
                }
                Nodo nodeReturn = pointer.getNext();
                pointer.setNext(null);
                size--;
                return nodeReturn;
            }
        }
        return null;
    }
    
    public Nodo deleteInIndex(int index) {
        if (!isEmpty()){
            Nodo pointer = getHead();
            if (index > getSize()) {
                System.out.println("The index is bigger than the size");
                return deleteFinal();
            } else {
                int cont = 0;
                while (cont < (index -1) && pointer.getNext() != null){
                    pointer = pointer.getNext();
                    cont++;
                }
                Nodo temp = pointer.getNext();
                pointer.setNext(temp.getNext());
                temp.setNext(null);
                size--;
            }
        }
        return null;
    }
    
}
