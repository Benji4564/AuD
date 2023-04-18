package de.ostfalia.aud.s23ss.a2.Comparator;
import java.util.Comparator;

import de.ostfalia.aud.s23ss.a2.ComparatorInterface;
import de.ostfalia.aud.s23ss.a2.Enums.Sort;
import de.ostfalia.aud.s23ss.base.IEmployee;

/**
 * Comparator for Employee objects based on the key.
 * @author Ronja Rosenbach and Benjamin Vollmers
 */
public class KeyComparator implements Comparator<IEmployee>, ComparatorInterface {
    @Override
    public int compare(IEmployee emp1, IEmployee emp2) throws NullPointerException {
        if (emp1 == null) {
            return -1;
        } else if (emp2 == null) {
            return 1;
        } else {
            int key1 = emp1.getKey();
            int key2 = emp2.getKey();
            return Integer.compare(key1, key2);
        }
    }

    @Override
    public Sort getSortType() {
        return Sort.KEY;
    }
}
