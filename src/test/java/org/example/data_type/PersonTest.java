package org.example.data_type;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PersonTest {
    Person p1 = new Person("Иван", "Иванов");
    Person p2 = new Person(1235689);
    Person p3 = new Person("Иван", "Иванов", 11235667, Gender.MALE);
    Person p4 = new Person();
    Person p5 = new Person();

    @Test
    public void testGetFirstName() {
        assertEquals(p1.getFirstName(), "Иван");
        assertNull(p2.getFirstName());
        assertEquals(p3.getFirstName(), "Иван");
    }

    @Test
    public void testGetPassportId() {
        assertEquals(p1.getPassportId(), 0);
        assertEquals(p2.getPassportId(), 1235689);
        assertEquals(p3.getPassportId(), 11235667);

    }

    @Test
    public void testGetLastName() {
        assertEquals(p1.getLastName(), "Иванов");
        assertNull(p2.getLastName());
        assertEquals(p3.getLastName(), "Иванов");
    }

    @Test
    public void testSetFirstName() {
        p4.setFirstName("Иван");
        p5.setFirstName("Иван");
        assertEquals(p4.getFirstName(), "Иван");
        assertEquals(p5.getFirstName(), "Иван");
    }

    @Test
    public void testSetPassportId() {
        p4.setPassportId(87652);
        p5.setPassportId(8463783);
        assertEquals(p4.getPassportId(), 87652);
        assertEquals(p5.getPassportId(), 8463783);
    }

    @Test
    public void testSetLastName() {
        p4.setLastName("Иванов");
        p5.setLastName("Иванов");
        assertEquals(p4.getLastName(), "Иванов");
        assertEquals(p5.getLastName(), "Иванов");
    }

    @Test
    public void testGetGender() {
        assertNull(p2.getGender());
        assertEquals(p3.getGender(), Gender.MALE);
    }
    @Test
    public void testSetGender() {
        p4.setGender(Gender.MALE);
        p5.setGender(Gender.FEMALE);
        assertEquals(p4.getGender(), Gender.MALE);
        assertEquals(p5.getGender(), Gender.FEMALE);
    }
}