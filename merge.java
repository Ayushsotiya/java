public class merge {

    static void swap(int ary[], int i, int j) {
        int t = ary[i];
        ary[i] = ary[j];
        ary[j] = t;
    }

     static int  part(int ary[],int l,int h){
      int pivit = ary[l];
      int cnt=0;
      for (int j2=l+1; j2 <=h; j2++) {
        if(ary[j2]<=pivit){
            cnt ++;
        }
      }
      int i=l;
      int j=h;
      int piviti = cnt+l;   
      swap(ary, l, piviti);
      while (i<piviti && j>piviti) {
        while (ary[i]<pivit) {
            i++;
        }
        while (ary[j]>pivit) {
            j--;
        }
        if (i<piviti && j>piviti) {
            swap(ary, i, j);
            i++;j++;
        }
      }

      return piviti;
     }

    static void quicksort(int ary[], int l, int h) {
        if (l >= h) {
            return;
        }
        int piviti =part(ary, l, h);
        quicksort(ary, l, piviti-1);
        quicksort(ary, piviti+1, h);
    }

    public static void main(String[] args) {
        int ary[] = { 5, 1, 7, 41, 7 };
        quicksort(ary, 0,ary.length - 1);
        for (int i = 0; i < ary.length; i++) {
            System.out.println(ary[i]);
        }
    }
}