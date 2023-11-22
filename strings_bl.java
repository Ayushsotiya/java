import java.util.*;

public class strings_bl {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        StringBuilder name = new StringBuilder("ayush");
    
        // how to calculate length
        System.out.println(name.length());

        // charAt;
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i));
        }
        System.out.println("\n");


        // how to set different character at different index(setCharAt).
        name.setCharAt(0, 'p');
        System.out.println(name);


        // how to add one more character in string.
        name.insert(1, 'i');
        System.out.println(name);

       StringBuilder name1 = new StringBuilder("t"); 
        // how to add char at the end of the string
        name1.append("o");
        name1.append('n');
        name1.append("n");
        name1.append("y");
        name1.append(" ");
        name1.append("stark");
        System.out.println(name1);


        // how to delete in string
        name1.delete(2, 3);// it exclude second no passed into it (here its 3 , 3 is excluded)
        System.out.println(name1);

    }
}