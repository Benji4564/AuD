package de.ostfalia.aud.s23ss.a2.WithStringComparator;

import java.util.Comparator;

import de.ostfalia.aud.s23ss.base.IEmployee;

public class KeyAndStringComparator implements Comparator<Object> {
    /**
     * Compares two objects.
     * First has to be an IEmployee, second a String.
     */
    @Override
    public int compare(Object o1, Object o2) {
        IEmployee e1 = (IEmployee) o1;
        String s2 = (String) o2;

        return String.valueOf(e1.getKey()).compareTo(s2);



        // TODO Auto-generated method stub
    }
    
}
