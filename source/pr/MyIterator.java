package pr;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * Created by 1 on 08.08.2016.
 */
public class MyIterator<T> implements Iterable<T> {
    private T[] mass;
    private int size=0;
    private int lastInd=0;

    public MyIterator(T[] mass, int size) {
        this.mass = (T[]) new Object[size];
        this.size = size;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int index = -1;
            @Override
            public boolean hasNext() {
                return index<size-1;
            }

            @Override
            public T next() {
                if(hasNext()){
                    index++;
                    return mass[index];
                }
                return null;
            }

        };
    }

    public void add(T elem){
        mass[lastInd]=elem;
        lastInd++;
    }
}
