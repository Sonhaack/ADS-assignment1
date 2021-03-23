package List;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class LinkedStack<T> implements Stack<T> {

    private LinkedList<T> list;

    public LinkedStack() {

    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void push(T elm) {
        list.addToFront(elm);
    }

    @Override
    public T pop() throws EmptyStackException {
        try {
            return list.removeFirst();
        } catch (EmptyStackException e) {
            throw new EmptyStackException();
        }
    }
}
