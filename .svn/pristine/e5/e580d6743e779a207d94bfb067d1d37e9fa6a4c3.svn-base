package de.ostfalia.aud.s23ss.a2.Comparator;
import java.util.Comparator;

import de.ostfalia.aud.s23ss.a2.ComparatorInterface;
import de.ostfalia.aud.s23ss.a2.Enums.Sort;
import de.ostfalia.aud.s23ss.base.IEmployee;

/**
 * Comparator for sorting employees by name.
 * @author Ronja Rosenbach and Benjamin Vollmers
 */
public class NameComparator implements Comparator<IEmployee>, ComparatorInterface {
    @Override
    public int compare(IEmployee o1, IEmployee o2) throws NullPointerException {
        return o1.getName().compareTo(o2.getName());
    }

    @Override
    public Sort getSortType() {
        return Sort.NAME;
    }
}
