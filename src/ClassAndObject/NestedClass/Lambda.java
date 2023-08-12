package ClassAndObject.NestedClass;

import java.util.ArrayList;
import java.util.List;

/*
 * Takeaways: 
 *  - The lambda captures the value reference in place variable reference.
 *  - The value provided in the expression should be constant and should effective final as after 
 *    returning the expression all variable inside that function scope or block scope would be
 *    removed. 
 */
public class Lambda {

    public static void main(String[] args) {

        int[] x = { 1, 2, 3 };
        List<Integer> y = rebuildArrayAfterFiltering(x);
        System.out.println(y);

    }

    public static List<Integer> rebuildArrayAfterFiltering(int[] originalList) {
        ArrayList<Integer> integers = new ArrayList<>();

        for (Integer integer : originalList) {
            if (getBasicFilter().test(integer)) {
                integers.add(integer);
            }
        }

        return integers;

    }

    public interface Filter {
        public boolean test(int x);
    }

    public static Filter getBasicFilter() {

        ArrayList<Integer> ar = new ArrayList<>();

        Filter filter = (x) -> x > ar.size();

        ar.add(0, 1);
        ar.add(0, 2);

        return filter;
    }

    public static Filter getBasicFilter2() {

        int x = 10;

        Filter filter = (y) -> y > x;
        // x = 11;

        return filter;
    }

}
