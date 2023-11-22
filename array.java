import java.util.Scanner;

public class array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int ary[] = { 1, 2, 3, 4, 5};
         int temp = ary[0];
        for (int j = 1; j <ary.length; j++) {
            ary[j-1] = ary[j];
            }
        ary[ary.length-1] = temp;
        
        for (int j = 0; j < ary.length; j++) {
            System.out.println(ary[j]);
        }
        }
    }

