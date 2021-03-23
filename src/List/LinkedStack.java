package List;

import java.util.EmptyStackException;

public class LinkedStack<T> implements Stack<T>{

    private List<T> LinkedStack;

    @Override
    public boolean isEmpty() {
        return LinkedStack.isEmpty();
    }

    @Override
    public void push(T elm) {
        LinkedStack.addToFront(elm);
    }

    @Override
    public T pop() throws EmptyStackException {
     try {
         return LinkedStack.removeFirst();
     } catch (EmptyStackException e) {
         throw new EmptyStackException();
     }
    }
}
