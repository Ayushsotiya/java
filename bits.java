import java.util.*;

public class bits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
         int a = 5;
         System.out.println("enter the pos");
         int position = sc.nextInt();
         int bitmass = 1<<position;
        // how to get bit;
        //   1:first calculate bitmass
        //   2:perform & b/w the bitmass and the no
        //   3:if the no. is non zero than the no is 1 and no is zero than the no is 2
        if((a & bitmass)==0){
            System.out.println("The no is 0");
        }
        else{
            System.out.println("The no is 1");
        }

        // hot to set bit
        //  1:first calculate bitmass
        //  2:perform |
        System.out.println(bitmass|a);

        // how to clear bit
        //  1:first calculate bitmass
        //  2:perform  binary complement on bitmass
        //  3:then perform &
        System.out.println((~bitmass)&a);
        

        // how to upadte bit(it is same as as set bit or clear bit)
        //    1: if you wanna update by 1 perform set bit
        //    2: if you wanna update by 0 peroform clear bit

 
    }   

}