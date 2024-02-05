import java.util.HashMap;
import java.util.Map;

public class hashmap {
    public static void main(String args[]) {
        // This is how you generate hashmap
        HashMap<Integer, Integer> mpp = new HashMap<>();

        // Insertion
        mpp.put(2, 1); /*key is main  values is like notes*/ 
        mpp.put(1, 1);
        mpp.put(2, 3);

        System.out.println(mpp);

        // search //gives true or false depend upon it is present or not
        System.out.println(mpp.containsKey(2));
        // gives the key's value
        System.out.println(mpp.get(2));

        System.out.println();

        // how to iterate in the map
        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            System.out.print(it.getKey() + " ");
            System.out.print(it.getValue() + " ");
            System.out.println();
        }

        // remove key alonng with it value;
        mpp.remove(2);
        System.out.println(mpp);

    }
}