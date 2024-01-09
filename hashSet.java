import java.util.HashSet;
import java.util.Iterator;
public class hashSet {
    public static void main (String args[]){
         // time complexity for insert,search,delete is o(1)
         HashSet<Integer> set = new HashSet<>();
        //  insert
        set.add(1);
        set.add(2);
        set.add(2);
        set.add(3);
        set.add(4);

        // size
        System.out.println(set.size());

        //print 
        System.out.println(set);

        // search 
        if(set.contains(6)){
            System.out.println("contains");
        }else{
            System.out.println("do not Contain");
        }
        

        //delete
        set.remove(3);
  
        //set iterator
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next());
        }
    }
}
