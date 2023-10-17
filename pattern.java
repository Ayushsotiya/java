import java.util.*;
public class pattern {
    public static void main(String args[]) {
        
        // butterfly pattern
        int n = 4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
            System.out.print("*");
            }
            for (int k = 1; k <=n-i ; k++) {
                System.out.print(" ");
            }
            for (int l = 1; l <=n-i ; l++) {
                System.out.print(" ");
            }
            for(int m=1;m<=i;m++){
            System.out.print("*");
            }
             System.out.println();
            }
        for(int i=n;i>=1;i--){
            for (int j=1;j <=i ; j++) {
                System.out.print("*");
            }
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int l=1;l<=i;l++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n");


        //  palindromic pattern
        int a = 5;
        for (int i = 1; i <= a; i++) {
          for (int j = 1; j <= a - i; j++) {
            System.out.print(" ");
          }
          // first part
          for (int j = i; j >= 1; j--) {
            System.out.print(j);
          }
          for (int j=2;j<=i;j++) {
            System.out.print(j);
          
          }
          System.out.println();
        
}

// 0-1 triangle
for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
        if((i+j)%2==0){
            System.out.print("1");
        }
        else{
            System.out.print(0);
        }
       
    }
    
}
}}