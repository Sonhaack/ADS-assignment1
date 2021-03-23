package List;

import java.util.EmptyStackException;

public class LinkedList implements List{
    private Node head;
    private int size;

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void addToFront(T data) {

    }

    @Override
    public T removeFirst() throws EmptyStackException {
        return null;
    }

}
