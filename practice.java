public class practice{
    public static float pow(float a, int n){
        float ans =1; 
        for (int i = 0; i < n; i++) {
             ans = ans*a;
         }
         return ans;
    }
    public static void main(String[] args) {
        int a = 5;
        int n = 3;
        int c =(int)pow(a,n);
        System.out.println(c);
    }
}