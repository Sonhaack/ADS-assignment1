package List;

import java.util.EmptyStackException;

public class LinkedList<T> implements List<T> {


    private Node<T> head;
    private int size;

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public int size() {
        size = 0;

        if (!isEmpty()) {
            Node<T> pointer = head;

            while (pointer.getNext() != null) {
                pointer = pointer.getNext();
                size++;
            }
        }
        return size;
    }

    @Override
    public void addToFront(T data) {
        Node<T> newNode = new Node<T>(data);
        newNode.setNext(head);
        head = newNode;
        size++;

    }

    //returner den første node, og så sletter vi node fra listen.
    @Override
    public T removeFirst() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException(); //check om listen er tom
        } else {
            Node<T> pointer = head; //laver vi en ny pointer, som pointer til head

            head = pointer.getNext(); //flytter vi head til den næste node

            pointer.setNext(null); //Vi tømmer

            return pointer.getData();
        }
    }

}
