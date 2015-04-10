package dcll.amah.mysimplestack;

import java.util.EmptyStackException;

/**
 * Created by mahamat on 28/02/15.
 * Un commentaire repondant a l'exigence #3 et l'exigence #5
 * Un deuxieme commentaire
 */
public class Stack implements SimpleStack {

    private int size;
    //private int
    private boolean isEmpty;

    public Stack()
    {
        this.isEmpty = true;
        this.size = 0;
    }
    @Override
    public boolean isEmpty() {
        return isEmpty;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public void push(Item item) {

    }

    @Override
    public Item peek() throws EmptyStackException {
        return null;
    }

    @Override
    public Item pop() throws EmptyStackException {
        return null;
    }
}
