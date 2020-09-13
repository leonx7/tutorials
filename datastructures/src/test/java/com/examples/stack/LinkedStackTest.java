package com.examples.stack;

import org.junit.jupiter.api.*;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class LinkedStackTest {

    private static LinkedStack<String> ls = new LinkedStack<>();
    private static LinkedStack<String> lsEmpty = new LinkedStack<>();
    private static String phrase = "Hello world!";

    @BeforeAll
    public static void initVariables() {
        for (String string : phrase.split(" ")) {
            ls.push(string);
        }
    }

    @Test
    @Order(1)
    void isEmpty() {
        assertFalse(ls.isEmpty());
        assertTrue(lsEmpty.isEmpty());
    }

    @Test
    @Order(2)
    void size() {
        assertEquals(2, ls.size());
        assertEquals(0, lsEmpty.size());
    }

    @Test
    @Order(3)
    void push() {
        ls.push("New item");
        assertEquals(3, ls.size());
    }

    @Test
    @Order(4)
    void pop() {
        assertEquals("New item", ls.pop());
        NoSuchElementException exception = assertThrows(NoSuchElementException.class, () -> lsEmpty.pop());
    }

    @Test
    @Order(5)
    void peekFirst() {
        assertEquals("world!", ls.peekFirst());
    }

    @Test
    @Order(6)
    void peekLast() {
        assertEquals("Hello", ls.peekLast());
    }
}