package com.greglturnquist.payroll;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.*;

public class EmployeeTest {

    @Test
    @DisplayName("Return true when employee have same email")
    public void testEqualsSameEmail() {
        //arrange
        Employee employee1 = new Employee("Frodo", "Baggins", "ring bearer", "engineer", "email");
        Employee employee2 = new Employee("Frodo", "Baggins", "ring bearer", "engineer", "email");
        //act
        boolean result = employee1.equals(employee2);
        //assert
        assertTrue(result);
    }

    @Test
    @DisplayName("Return false when employee have different email")
    public void testEqualsDifferentEmail() {
        //arrange
        Employee employee1 = new Employee("Frodo", "Baggins", "ring bearer", "engineer", "email1");
        Employee employee2 = new Employee("Frodo", "Baggins", "ring bearer", "engineer", "email2");
        //act
        boolean result = employee1.equals(employee2);
        //assert
        assertFalse(result);
    }

    @Test
    @DisplayName("Return true when is same employee")
    public void testEqualsSameEmployee() {
        //arrange
        Employee employee1 = new Employee("Frodo", "Baggins", "ring bearer", "engineer", "email1");
        //act
        boolean result = employee1.equals(employee1);
        //assert
        assertTrue(result);
    }

    @Test
    @DisplayName("Ensure is gived email that employee")
    public void giveEmailEmployee() {
        //arrange
        Employee employee1 = new Employee("Frodo", "Baggins", "ring bearer", "engineer", "email1");

        //act
        String result = employee1.getEmail();
        //assert
        assertEquals("email1", result);
    }

    @Test
    @DisplayName("Ensure is gived email that employee when email is empty")
    public void giveEmptyEmailEmployee() {
        //arrange
        Employee employee1 = new Employee("Frodo", "Baggins", "ring bearer", "engineer", "");

        //act
        String result = employee1.getEmail();
        //assert
        assertEquals("", result);
    }

    @Test
    @DisplayName("Ensure is gived email that employee when email is null")
    public void giveNullEmailEmployee() {
        //arrange
        Employee employee1 = new Employee("Frodo", "Baggins", "ring bearer", "engineer", null);

        //act
        String result = employee1.getEmail();
        //assert
        assertEquals(null, result);
    }

}