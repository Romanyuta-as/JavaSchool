package HomeWork4;

import java.util.Collection;

/**
 * Created by AlexRS on 24.07.2016.
 */
public class LinkedList<E> {
    transient int  size=0;
    transient Entry<E> first;
    transient Entry<E> last;

    public LinkedList() {
    }
// Добавление элемента в конец списка
    void add(E value){
        final Entry<E> l = last;
        final Entry<E> newEntry = new Entry<>(value,l,null);
        last = newEntry;
        if (l == null)
            first = newEntry; // переопределяем указатели
        else
            l.next = newEntry;
        size++;


    }
// добавление элемента в середину списка
    void add(int index,E value){
        checkPositionIndex(index);
        if (index == size)
            add(value);
        else
            lB(value,node(index));
    }

    public E get(int index) {
        checkElementPoIndex(index);
        return node(index).item;
    }

    void lB(E value, Entry<E> s){
        final Entry<E> pred = s.prev;
        final Entry<E> newNode = new Entry<>(value,s,pred);
        s.prev = newNode;
        if (pred == null)
            first = newNode;
        else
            pred.next = newNode;
        size++;
    }

    public E remove(int index){
        checkElementPoIndex(index);
        return unlink(node(index));
    }



    // пробегает по всему списку в поисках элемента с указанным индексом
    Entry<E> node(int index) {

        if (index < (size >> 1)) {
            Entry<E> x = first;
            for (int i = 0; i < index; i++)
                x = x.next;
            return x;
        } else {
            Entry<E> x = last;
            for (int i = size - 1; i > index; i--)
                x = x.prev;
            return x;
        }
    }
    E unlink(Entry<E> x) {
        // assert x != null;
        final E element = x.item;
        final Entry<E> next = x.next;
        final Entry<E> prev = x.prev;

        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
            x.prev = null;
        }

        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
            x.next = null;
        }

        x.item = null;
        size--;
        return element;
    }
    public boolean addAll(Collection<? extends E> c) {
        return addAll(size, c);
    }

    public boolean addAll(int index, Collection<? extends E> c) {
        checkPositionIndex(index);

        Object[] a = c.toArray();
        int numNew = a.length;
        if (numNew == 0)
            return false;

        Entry<E> pred, succ;
        if (index == size) {
            succ = null;
            pred = last;
        } else {
            succ = node(index);
            pred = succ.prev;
        }

        for (Object o : a) {
            @SuppressWarnings("unchecked") E e = (E) o;
            Entry<E> newNode = new Entry<>( e,pred, null);
            if (pred == null)
                first = newNode;
            else
                pred.next = newNode;
            pred = newNode;
        }

        if (succ == null) {
            last = pred;
        } else {
            pred.next = succ;
            succ.prev = pred;
        }

        size += numNew;
        return true;
    }
    private void checkPositionIndex(int index) {
        if (!isPositionIndex(index))
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));// ловится исключение если индекс<0 или >size
    }
    private String outOfBoundsMsg(int index){ return "Index: "+index+", Size: "+size;}
    private void checkElementPoIndex(int index) {
        if (!isPositionIndex(index))
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
    }
    private boolean isPositionIndex(int index) {
        return index >= 0 && index <= size;
    }
    public static class Entry<E>
    {
        E item;
        Entry<E> next;
        Entry<E> prev;

        public Entry(E item, Entry<E> next, Entry<E> prev) {
            this.item = item;
            this.next = next;
            this.prev = prev;
        }
    }
}
