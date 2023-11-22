public class merge{
    public static void merge(int ary[],int l,int mid,int h){
        int m []= new int[h-l+1];
        int index1 = l;
        int x =0;
        int index2 = mid+1;
        while (index1<=mid&& index2<=h) {
            if(ary[index1]<ary[index2]){
                m[x++] =ary[index1++];
            }
            else{
                m[x++] = ary[index2++];
            }
        }
           while(index1<=mid){  
            m[x++] = ary[index1++];
           }
           while (index2<=h) {
            m[x++] = ary[index2++];
           }
           for (int i = 0,j=l; i <m.length; i++,j++) {
            ary[j] = m[i];
           }
    }
    public static void divide(int ary[],int l,int h){
        if(l>=h){
            return;
        }
       int mid = (h+l)/2;
       divide(ary, l, mid);
       divide(ary, mid+1, h);
       merge(ary,l,mid,h);
    }
    public static void main(String[] args) {
        int ary[] = {5,6,0,12,56};
        divide(ary,0,ary.length-1);
        for (int i = 0; i < ary.length; i++) {
            System.out.print(ary[i]+" ");
        }
    }
}