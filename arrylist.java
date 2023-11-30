
import java.util.ArrayList;
import java.util.Collections;
public class arrylist{
  public static void main(String args[]){

    ArrayList<Integer> list = new ArrayList<Integer>();
   
    //add elements.
    list.add(0);
    list.add(2);
    list.add(5);
    System.out.println(list);

    //add  elements in between
    list.add(1,8);
    System.out.println(list);

    //get elements.
    int a = list.get(0);
    System.out.println(a);

    //set elements
    list.set(1,4);
    System.out.println(list);

    // remove elements
    list.remove(3);
    System.out.println(list);

    //size of arrylist
    int b =list.size();
    System.out.println(b);

    // perform same with loops 
    for (int i = 0; i < list.size(); i++) {
        System.out.print(list.get(i)+" ");
    }
    System.out.println();
    //another way to iterate in array list;
    for(int val:list){
      System.out.print(val+ " ");
    }
    System.out.println();
   
    // sort
    Collections.sort(list);
    System.out.println(list);
  }
}