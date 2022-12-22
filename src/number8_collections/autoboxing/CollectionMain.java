package number8_collections.autoboxing;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CollectionMain {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(Integer.valueOf(1));
        list.add(1);
        System.out.println(list);
        int[] array = {1,2,3,4,5};
        System.out.println(Arrays.toString(array));

        Integer integ = 56;
        int n = integ.intValue();
        Double doub = 56.34;
        double d = doub.doubleValue();


        String[] colors = {"yellow", "green", "blue"};

        LinkedList<String> ll = new LinkedList<>(Arrays.asList(colors));
        ll.add("black");

        colors = ll.toArray(new String[ll.size()]);

        System.out.println(Arrays.toString(colors));

        Iterator<String> i = ll.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }



    }
}
