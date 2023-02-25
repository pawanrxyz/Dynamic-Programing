public class Knapsake_2 { 
    public static int knapsake(int val [],int wt[], int w,int n) {
         if(w == 0 || n == 0) {
            return 0;
         }
         if(wt[n-1]<=w) {
            int ans1 = val[n-1]+knapsake(val,wt, w-wt[n-1], n-1);

            int ans2 = knapsake(val, wt, w, n-1);
            return Math.max(ans1,ans2);
         }
         else {
            return knapsake(val, wt, w, n-1);
         }
    }
    public static void main(String args[]) {
        int val [] = {23,45,12,45,67,7};
        int wt[] = {2,4,5,6,2,3};
        int w = 8;

        System.out.println(knapsake(val, wt, w, val.length));
    }
    
}
