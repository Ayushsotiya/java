
import java.util.*;

public class sorting {

  static void swap(int t, int j, int ary[]) {
    int q = ary[t];
    ary[t] = ary[j];
    ary[j] = q;
  }

  static void print_ary(int ary[], int n) {
    for (int i = 0; i < n; i++) {
      System.out.println(ary[i]);
    }
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int t;
    int ary[] = { 7, 8, 3, 1, 2 };

    // // selection sort
    for (int i = 0; i < ary.length - 1; i++) {
      int small = i;
      for (int j = i; j < ary.length; j++) {
        if (ary[small] > ary[j]) {
          small = j;
        }
      }
      t = ary[small];
      ary[small] = ary[i];
      ary[i] = t;
    }
    System.out.println("\n");



    //// bubble sort
    for (int i = 0; i < ary.length - 1; i++) {
      for (int j = 0; j < ary.length - i - 1; j++) {
        if (ary[j] > ary[j + 1]) {
          t = ary[j];
          ary[j] = ary[j + 1];
          ary[j + 1] = t;
        }
      }
    }

    System.out.println("\n");



    //// insertion sort
    int ary1[] = { 5, 90, 21, 4, 7 };
    for (int i = 1; i < ary.length; i++) {
      int j = i;
      while (j > 0) {
        if (ary1[j - 1] > ary1[j]) {
          swap(j - 1, j, ary1);
        }
        j--;
      }
    }
    print_ary(ary1, ary1.length);
  }
}
