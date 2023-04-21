package ru.academits.kharitonov.list;

import java.util.NoSuchElementException;
import java.util.Objects;

public class SingleList<T> {
    private int size;
    private ListItem<T> head;

    public int getSize() {
        return size;
    }

    public T getFirst() {
        if (head == null) {
            throw new NoSuchElementException("List is empty.");
        }

        return head.getData();
    }

    public void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("You specified index = " + index + ". But index must be >= 0 and < " + size);
        }
    }

    public ListItem<T> getItemByIndex(int index) {
        checkIndex(index);

        ListItem<T> currentItem = head;

        for (int i = 0; i < index; i++) {
            currentItem = currentItem.getNext();
        }

        return currentItem;
    }

    public T getByIndex(int index) {
        checkIndex(index);

        return getItemByIndex(index).getData();
    }

    public T setByIndex(int index, T data) {
        checkIndex(index);

        ListItem<T> currentItem = getItemByIndex(index);
        T oldData = currentItem.getData();
        currentItem.setData(data);

        return oldData;
    }

    public T removeByIndex(int index) {
        checkIndex(index);

        if (index == 0) {
            return removeFirst();
        }

        ListItem<T> previousItem = getItemByIndex(index - 1);
        T removedData = previousItem.getNext().getData();
        previousItem.setNext(previousItem.getNext().getNext());
        size--;

        return removedData;
    }

    public void insertFirst(T data) {
        head = new ListItem<>(data, head);
        size++;
    }

    public void insertByIndex(T data, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("You specified index = " + index + ". But index must be >= 0 and <= " + size);
        }

        if (index == 0) {
            insertFirst(data);
            return;
        }

        ListItem<T> previousItem = getItemByIndex(index - 1);
        ListItem<T> currentItem = new ListItem<>(data, previousItem.getNext());
        previousItem.setNext(currentItem);
        size++;
    }

    public boolean removeItem(T data) {
        if (isEmpty()) {
            return false;
        }

        if (Objects.equals(data, head.getData())) {
            removeFirst();
            size--;

            return true;
        }

        for (ListItem<T> currentItem = head.getNext(), previousItem = head; currentItem != null; previousItem = currentItem, currentItem = currentItem.getNext()) {
            if (Objects.equals(data, currentItem.getData())) {
                previousItem.setNext(currentItem.getNext());
                size--;

                return true;
            }
        }

        return false;
    }

    public T removeFirst() {
        if (head == null) {
            throw new NoSuchElementException("List is empty.");
        }

        T oldData = head.getData();
        head = head.getNext();
        size--;

        return oldData;
    }

    public void revers() {
        ListItem<T> previousItem = null;
        ListItem<T> currentItem = head;

        while (currentItem != null) {
            ListItem<T> temp = currentItem.getNext();
            currentItem.setNext(previousItem);
            previousItem = currentItem;
            head = currentItem;
            currentItem = temp;
        }
    }

    public SingleList<T> copy() {
        if (isEmpty()) {
            return new SingleList<>();
        }

        SingleList<T> listCopy = new SingleList<>();
        listCopy.size = size;
        ListItem<T> currentItem = new ListItem<>(head.getData());
        listCopy.head = currentItem;

        for (ListItem<T> nextItem = head.getNext(); nextItem != null; nextItem = nextItem.getNext()) {
            currentItem.setNext(new ListItem<>(nextItem.getData()));
            currentItem = currentItem.getNext();
        }

        return listCopy;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        if (head == null) {
            return "[ ]";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (ListItem<T> currentItem = head; currentItem != null; currentItem = currentItem.getNext()) {
            sb.append(currentItem.getData()).append(", ");
        }

        sb.delete(sb.length() - 2, sb.length());
        sb.append("]");

        return sb.toString();
    }
}