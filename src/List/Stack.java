package List;

import java.util.EmptyStackException;

public interface Stack {
    boolean isEmpty();
    void push(T elm);
    T pop() throws EmptyStackException;
}
