import java.util.*;

public class strings {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        String name = "Ayush";
        String surename = "Sotiya";


        // how to concantinate strings
        String fullname = name + " " + surename;
        System.out.println(fullname);


        // HOW TO GET LENGHT OF STRING
        System.out.println(fullname.length());


        // How TO Print the charat different index in string
        for (int i = 0; i < fullname.length(); i++) {
            System.out.println(fullname.charAt(i));
        }


        // how to compare two stings
        // s1 = s2, return = 0.
        // s1 > s2, return = +ve.
        // s1 < s2, return = -ve.
        if (name.compareTo(surename) == 0) {
            System.out.println("equal");
        } else if (name.compareTo(surename) > 0) {
            System.out.println("not equal and s1 is greater");
        } else {
            System.out.println("not equal and s1 is smaller");
        }
        String  a = "tony stark";

        // how to print substringed string.
        String name1 = a.substring(1, a.length());// exclude second value passed into it
        System.out.println(name1);// and output is yush
        // or, we can directly print it.
        System.out.println(name.substring(1, name.length()));// it exclude second char pass into it.and output is yush

        
        // Strings are immutable.
    }
}
