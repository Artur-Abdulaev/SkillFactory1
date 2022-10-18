package skillFactoryTasks.module_12.webinar_1;

import java.util.Arrays;

public class CustomArrayList<E> implements CustomList<E> {
    private int size;
    private Object[] data;

    public CustomArrayList() {
        this(2);
    }

    public CustomArrayList(int initialCapacity) {
        data = new Object[initialCapacity];
        size = 0;
    }

    public void add(E value) {
        if (size >= data.length) {
            data = grow(data);
        }
        data[size++] = value;
    }

    public E get(int index) {
        return (E) data[index];
    }

    @Override
    public E remove(int index) {
        if (index < 0 || index >= data.length)
            throw new ArrayIndexOutOfBoundsException();
        size--;
        E value = (E) data[index];
        System.arraycopy(data, index + 1, data, index, size  );
        return value;
    }

    private Object[] grow(Object[] oldArray) {
        return Arrays.copyOf(oldArray, oldArray.length * 2);
    }

    @Override
    public String toString() {
        return "{" + Arrays.toString(data) + '}';
    }
}
