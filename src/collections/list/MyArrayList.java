package collections.list;


import java.util.*;

public class MyArrayList implements List, RandomAccess {
    private static final int DEFAULT_SIZE = 10;
    private Object[] elementData;
    private int size;

    public MyArrayList() {
        // TODO:x Implement Me
        elementData = new Object[DEFAULT_SIZE];
    }

    public MyArrayList(int initialCapacity) {
        if (initialCapacity >= 0) {
            elementData = new Object[initialCapacity];
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
        }
    }

    public MyArrayList(Collection c) {
        elementData = c.toArray();
    }

    @Override
    public int size() {
        // TODO:x Implement Me
        return size;
    }

    @Override
    public boolean isEmpty() {
        // TODO:x Implement Me
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        // TODO: Implement Me
        if (indexOf(o) == -1) {
            return false;
        }
        return true;
    }

    @Override
    public Iterator iterator() {
        // DO NOT NEED TO IMPLEMENT
        return null;
    }

    @Override
    public Object[] toArray() {
        // TODO: Implement Me
        return elementData;
    }

    @Override
    public Object[] toArray(Object[] a) {
        // DO NOT NEED TO IMPLEMENT
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        // TODO:x Implement Me
        if (size == elementData.length) {
            elementData = grow(size + 1);
        }
        elementData[size] = o;
        size++;
        return true;
    }

    private Object[] grow(int minCapacity) {
        return elementData = Arrays.copyOf(elementData, minCapacity + minCapacity / 2);
    }

    @Override
    public boolean remove(Object o) {
        // TODO: Implement Me
        // find the index of Object o; (linear search)
        // shift all the elements after the index to left
        try {
            int index = indexOf(o);
            if (index == -1) {
                throw new Exception("Value don't exist");
            } else {
                for(int i = size - index; i < size;i++) {
                    if(i != size-1) {
                        elementData[i] = elementData[i + 1];
                    } else {
                        elementData[i] = null;
                    }
                }
            }
            return true;
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        // TODO: Implement Me
        for(Object o : c.toArray()) {
            if(!contains(o)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(Collection c) {
        // TODO: Implement Me
        for(Object o : c.toArray()) {
           add(o);
        }
        return true;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        // TODO: Implement Me
        for(Object o : c.toArray()) {
            add(index,o);
            index++;
        }
        return true;
    }

    @Override
    public boolean removeAll(Collection c) {
        // TODO: Implement Me
        for(Object o : c.toArray()) {
            remove(o);
        }
        return true;
    }

    @Override
    public boolean retainAll(Collection c) {
        // TODO: Implement Me
        for(Object o : elementData) {
            if(!c.contains(o)) {
                remove(o);
            }
        }
        return true;
    }

    @Override
    public void clear() {
        // TODO:x Implement Me
        for (int i = 0; i < size; i++) {
            elementData[i] = null;
        }
    }

    public void isValidIndex(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    @Override
    public Object get(int index) {
        // TODO:x Implement Me
        isValidIndex(index);
        return elementData[index];
    }

    @Override
    public Object set(int index, Object element) {
        // TODO: Implement Me
        isValidIndex(index);
        Object copy = elementData[index];
        elementData[index] = element;
        return copy;
    }

    @Override
    public void add(int index, Object element) {
        // TODO: Implement Me
        isValidIndex(index);
        for(int i = index; i < size; i++) {
            element = set(i,element);
        }
        add(element);
    }

    @Override
    public Object remove(int index) {
        // TODO: Implement Me
        isValidIndex(index);
        Object copy = elementData[index];
        Object o = elementData[size-1];
        for(int i = size - 2; i >= index; i--) {
            o = set(i,o);
        }
        size--;
        return copy;
    }

    @Override
    public int indexOf(Object o) {
        // TODO: Implement Me
        int index = 0;
        if (o == null) {
            for (Object obj: elementData) {
                if (obj == null) {
                    return index;
                }
                index++;
            }
        } else {
            for (Object obj: elementData) {
                if (obj.equals(o)) {
                    return index;
                }
                index++;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        // TODO: Implement Me
        int index = -1, count = 0;
        for (Object obj: elementData) {
            if (obj.equals(o)) {
                index = count;
            }
            count++;
        }
        return index;
    }

    @Override
    public ListIterator listIterator() {
        // DO NOT NEED TO IMPLEMENT
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        // DO NOT NEED TO IMPLEMENT
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        // TODO: Implement Me
        return null;
    }
}