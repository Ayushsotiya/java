import java.util.*;
 public class sorting{
    static void print_ary(int ary[],int n){
      for(int i=0;i<n;i++){
   System.out.print(ary[i]);
     }
   }
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int t ;
int ary[] = {7,8,3,1,2};
// // selection sort
 for(int i=0;i<ary.length-1;i++){
       int small = i;
       for(int j=i;j<ary.length;j++){
         if(ary[small]>ary[j]){
            small = j;
         }  
       }
       t = ary[small];
       ary[small] = ary[i];
       ary[i] = t;
 }
 print_ary(ary, ary.length);
System.out.println("\n"); 

// //// bubble sort

for(int i=0;i<ary.length-1;i++){  for(int j=0;j<ary.length-i-1;j++){
       if(ary[j]>ary[j+1]){
          t = ary[j];
         ary[j] = ary[j+1];
         ary[j+1] =t;
      }
     }
 }
 print_ary(ary, ary.length);
 System.out.println("\n");


// // insertion sort
    for(int i=1;i<ary.length;i++){
    t = ary[i];
      int j=i-1;
       while(j>=0){
        if(ary[j]>t){
           ary[j+1] = ary[j];
           }
          else{
             break;
           }
           j--;
         }
         ary[j+1] = t;
       }
     print_ary(ary, ary.length);
    }
} 
