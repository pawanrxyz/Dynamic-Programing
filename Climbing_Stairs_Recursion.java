public class Climbing_Stairs_Recursion { 
    public static int countWays(int n) {
        if(n == 0) {
            return 1;
        }
        if(n<0) {
            return 0;
        }
        return countWays(n-1)+countWays(n-2);
    } 
    public static void main(String args[]) {
        int n = 5;
        // int ans = countWays(n);
        // System.out.println("The total ways = "+ans);
        System.out.println(countWays(n));
    }
    
}
