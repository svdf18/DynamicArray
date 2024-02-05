import java.util.Arrays;

public class DynamicArray<T> {
    private Object[] array;
    private int size;

    public DynamicArray() {
        this.array = new Object[1];
        this.size = 0;
    }

    public void add(T element) {
        ensureCapacity();
        array[size++] = element;
    }

    public T get(int index) {
        checkIndex(index);
        return (T) array[index];
    }

    public int size() {
        return size;
    }

    public void remove() {
        if (size > 0) {
            size--;
        }
    }

    public void remove(int index) {
        checkIndex(index);
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        size--;
    }

    public void set(int index, T element) {
        checkIndex(index);
        array[index] = element;
    }

    public void clear() {
        array = new Object[1];
        size = 0;
    }

    private void ensureCapacity() {
        if (size == array.length) {
            int newCapacity = array.length * 2;
            array = Arrays.copyOf(array, newCapacity);
        }
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }
}
