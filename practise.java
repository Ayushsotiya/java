public class practise {
    static void merge(int ary[], int l, int mid, int h) {
        int ary1[] = new int[h - l + 1];
        int left = l;
        int right = mid + 1;
        int x = 0;
        while (left <= mid && right <= h)
            if (ary[left] <= ary[right]) {
                ary1[x++] = ary[left++];
            } else {
                ary1[x++] = ary[right++];
            }
        while (left <= mid) {
            ary1[x++] = ary[left++];
        }
        while (right <= h) {
            ary1[x++] = ary[right++];
        }
        for (int i = l, j = 0; j < ary1.length; j++, i++) {
            ary[i] = ary1[j];
        }
    }
    static void divide(int ary[], int l, int h) {
        if (l >= h) {
            return;
        }
        int mid = (l + h) / 2;
        divide(ary, l, mid);
        divide(ary, mid + 1, h);
        merge(ary, l, mid, h);
    }

    public static void main(String[] args) {
        int ary[] = { 5, 4, 7, 4, 8 };

        divide(ary, 0, ary.length - 1);

        for (int i = 0; i < ary.length; i++) {
            System.out.println(ary[i]);
        }
    }
}