package Others;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by varun on 10/2/16.
 */
public class ImplementIterator implements Iterator<Integer> {

    Integer pickedElement = null;
    Iterator<Integer> iter;
    public ImplementIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        iter = iterator;
        if(iter.hasNext())
        {
            pickedElement = iter.next();
        }

    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        System.out.println(pickedElement);
        return pickedElement;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        Integer next = pickedElement;
        pickedElement = (iter.hasNext() ? iter.next() : null);
        return next;
    }

    @Override
    public boolean hasNext() {
        return pickedElement != null;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        Iterator<Integer> iterator = list.iterator();
        ImplementIterator i = new ImplementIterator(iterator);
        i.peek();
        i.next();
        i.peek();
    }

}
