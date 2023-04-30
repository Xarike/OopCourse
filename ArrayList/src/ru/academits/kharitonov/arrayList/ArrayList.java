package ru.academits.kharitonov.arrayList;

import java.util.*;

public class ArrayList<E> implements List<E> {
    private E[] values;
    private int size;
    private int modCount;

     private static final int DEFAULT_CAPACITY = 10;

    public  ArrayList(){
        values = (E[]) new Object[DEFAULT_CAPACITY];
     }

     public ArrayList(int size){
         if(size < 0) {
             throw new NegativeArraySizeException("You entered size = " + size + ". But size must be >= 0.");
         }

         values = (E[]) new Object[size];
     }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < size; i++) {
            if(o.equals(values[i])){
                return true;
            }
        }

        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return new  MyIterator();
    }

    private class MyIterator implements Iterator<E>{
        private int currentIndex = -1;
        private final int modCountStart = modCount;

        @Override
        public boolean hasNext() {
           return currentIndex + 1 < size;
        }

        @Override
        public E next() {
            if(!hasNext()) {
                throw new NoSuchElementException("The collection is over.");
            }

            if(modCount != modCountStart){
                throw  new ConcurrentModificationException("The collection has changed.");
            }

            ++currentIndex;
            return values[currentIndex];
        }
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean add(E element) {
        add(size, element);
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public void add(int index, E element) {
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("Index = " + index + ". But index must be >= 0 and <= " + size);
        }

        if(size >= values.length){
            ensureCapacity();
        }

        System.arraycopy(values, index, values, index + 1, size - index);
        values[index] = element;
        size++;
        modCount++;
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }
    @Override
    public String toString(){
        if (isEmpty()) {
            return "[ ]";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = 0; i < size; i++) {
            sb.append(values[i]);
            sb.append(", ");
        }

        sb.delete(sb.length() - 2, sb.length());
        sb.append("]");

        return sb.toString();
    }

    private void ensureCapacity(){
        if(values.length == 0 ){
            values = (E[]) new Object[DEFAULT_CAPACITY];
            return;
        }

        values = Arrays.copyOf(values, values.length * 2);
    }






    /////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }
}
