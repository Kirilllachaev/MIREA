package Lab12;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class ArrayContainer<T> implements Iterable<T>{
    private Object[] array;
    private int size;
    private int lastIndex;
    private double loadFactor = 0.75;
    public static final int DEFAULT_SIZE = 10;


    public ArrayContainer(T[] array) {
        this.array = Arrays.copyOf(array, array.length * 2);
        size = this.array.length;
        lastIndex = array.length - 1;
    }

    public ArrayContainer() {
        this(DEFAULT_SIZE);
    }

    @SuppressWarnings("unchecked")
    public ArrayContainer(Collection<? extends T> collection) {
        this((T[]) collection.toArray());
    }

    @SuppressWarnings("unchecked")
    public ArrayContainer(int size) {
        if(size < 0) {
            throw new IllegalArgumentException();
        }

        array = (T[])new Object[size];
        this.size = size;
        lastIndex = 0;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        if(index > lastIndex || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        return (T) array[index];
    }

    public int getSize() {
        return size;
    }

    public void add(T item) {
        if((lastIndex + 1) > (size * loadFactor)) {
            size = size * 2;
            array = Arrays.copyOf(array, size);
        }
        array[lastIndex] = item;
        lastIndex++;
    }

    public void add(int index, T item) {
        if(index > lastIndex || index < 0) {
            throw new IndexOutOfBoundsException();
        }

        if((lastIndex++) > (size * loadFactor)) {
            size = size * 2;
            array = Arrays.copyOf(array, size);
        }
        System.arraycopy(array, index, array, index + 1, lastIndex - index);
        array[index] = item;
    }

    public void remove(int index) {
        if(index > lastIndex || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        lastIndex--;
        System.arraycopy(array, index + 1, array, index, lastIndex - 1);
    }

    public T set(int index, T item) {
        T prev;
        if(index > lastIndex || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        prev = get(index);
        array[index] = item;

        return prev;
    }

    public void trimToSize() {
        size = lastIndex + 1;
        array = Arrays.copyOf(array, size);
    }

    public void setLoadFactor(double loadFactor) {
        if(loadFactor > 1 || loadFactor <= 0) {
            throw new IllegalArgumentException("Load Factor value must be between 0 and 1");
        }
        this.loadFactor = loadFactor;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for(int i = 0; i < lastIndex; i++) {
            sb.append(array[i] + ", ");
        }
        sb.append(array[lastIndex] + "]");
        return sb.toString();
    }

    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int index = 0;
            private int count = lastIndex;
            public boolean hasNext() {
                return (index < count);
            }

            @SuppressWarnings("unchecked")
            public T next() {
                return (T) array[index++];
            }

            public void remove() {
                ArrayContainer.this.remove(index);
            }
        };
    }
}