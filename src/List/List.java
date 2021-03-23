package List;

import javax.swing.border.EmptyBorder;
import java.util.EmptyStackException;

public interface List {

    boolean isEmpty();
    int size();
    void addToFront(T data);
    T removeFirst() throws EmptyStackException;

}
