public class merge {

    static void swap(int ary[], int i, int j) {
        int t = ary[i];
        ary[i] = ary[j];
        ary[j] = t;
    }

     static int  partition(int ary[],int l,int h){
      int pivot = ary[l];
      int i = l;
      int j = h;
      while (i<=j) {
         while (ary[i]<=pivot && i<=h) {
            i++;
         }
         while (ary[j]>pivot && j>=l+1) {
            j--;
         }
         if(i<j){
         swap(ary, i, j);
         }
      }
      swap(ary, l, j);

      return j;
     }

    static void quicksort(int ary[], int l, int h) {
        if (l < h) {
            int pivot =partition(ary, l, h);
            quicksort(ary, l, pivot-1);
            quicksort(ary, pivot+1, h);
        }
       
    }

    public static void main(String[] args) {
        int ary[] = { 5, 1, 7, 41, 7 };
        quicksort(ary, 0,ary.length - 1);
        for (int i = 0; i < ary.length; i++) {
            System.out.println(ary[i]);
        }    
    }
}