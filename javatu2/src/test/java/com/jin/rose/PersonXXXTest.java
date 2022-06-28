package com.jin.rose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonXXXTest {
    @Test
    public void test1() {
        Person p = new Person("david", 25);
        assertEquals(p.getName(), "david");
        assertEquals(p.getAge(), 25);

    }
    @Test
    public void test2() {
        Person p = new Person("david", 25);
        assertEquals(p.getName(), "george");
        assertEquals(p.getAge(), 25);
    }
}
