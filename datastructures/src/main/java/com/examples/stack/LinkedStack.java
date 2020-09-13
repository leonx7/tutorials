package com.examples.stack;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedStack<T> implements Iterable<T> {
    private Node head, current;
    private int size;

    class Node {
        T item;
        Node previous;
    }

    public boolean isEmpty() {
        return current == null;
    }

    public int size() {
        return size;
    }

    public void push(T item) {
        Node node = new Node();
        if (isEmpty()) {
            head = node;
        }
        Node previous = current;
        current = node;
        current.item = item;
        current.previous = previous;
        size++;
    }

    public T pop() {
        if (isEmpty())
            throw new NoSuchElementException();
        T result = current.item;
        current = current.previous;
        size--;
        return result;
    }

    public T peekFirst() {
        if (isEmpty())
            throw new NoSuchElementException();
        return current.item;
    }

    public T peekLast() {
        return head.item;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (T item : this) {
            s.append(item);
            s.append(" ");
        }
        return s.toString();
    }

    @Override
    public Iterator<T> iterator() {
        return new LinkedStackIterator();
    }

    private class LinkedStackIterator implements Iterator<T> {

        private Node node = current;

        @Override
        public boolean hasNext() {
            return node != null;
        }

        @Override
        public T next() {
            if (!hasNext())
                throw new NoSuchElementException();
            T item = node.item;
            node = node.previous;
            return item;
        }
    }

    public static void main(String[] args) {
        LinkedStack<String> ls = new LinkedStack<>();
        String phrase = "Hello world!";

        for (String string : phrase.split(" ")) {
            ls.push(string);
        }
        System.out.println(ls);
        ls.push("New item");
        System.out.println(ls);
        System.out.println(ls.peekFirst());
        System.out.println(ls.peekLast());
    }
}
