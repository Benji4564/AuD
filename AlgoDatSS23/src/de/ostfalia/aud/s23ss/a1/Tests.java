package de.ostfalia.aud.s23ss.a1;


import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Test;

import de.ostfalia.aud.s23ss.base.Department;
import de.ostfalia.aud.s23ss.base.Employee;
import de.ostfalia.aud.s23ss.base.Gender;
import de.ostfalia.aud.s23ss.base.IEmployee;


public class Tests {
    public String fileName = "Materialien/40k_employees.csv";
    @Test
    public void testCheckManagementNotNull() {
        Management m = new Management();
        assertNotNull(m);
    } 

    @Test
    public void testCheckManagementAddEmployee() {
        Management m = new Management();
        Employee e = new Employee("11398;1953-05-30;Oscar;Peir;M;1986-08-23;Finance");
        m.insert(e);
        assertTrue(m.members(Department.FINANCE).length == 1);
    }

    @Test
    public void checkAmountOfPeopleInAllDeparments() throws IOException {
        Management m = new Management(fileName);
        int total = 0;
        for(Department d : Department.values()) {
            total += m.members(d).length;
        }

        assertTrue(40000 == total);
    }



    @Test
    public void checkAddedOnePersonCorrectly() {
        Management m = new Management();
        Employee e = new Employee("11398;1953-05-30;Oscar;Peir;M;1986-08-23;Finance");
        m.insert(e);
        assertTrue(m.members(Department.FINANCE)[0].getKey() == 11398);
    }

    @Test
    public void checkAddedOnePersonCorrectly2() throws IOException {
        Management m = new Management(fileName);
        IEmployee e = m.search(11144);
        assertTrue(e.getKey() == 11144);
        assertTrue(e.getDepartment().equals(Department.SALES));
        assertTrue(e.getFirstName().equals("Carrsten"));
        assertTrue(e.getName().equals("Heinisuo"));
        assertTrue(e.getGender().equals(Gender.M));
    }
}
