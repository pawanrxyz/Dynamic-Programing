// import java.util.*;
public class Climbing_Stairs_Dp { 
    public static int countWays(int n,int ways []) { 
        // int ways [] = new int [n+1];
        if(n == 0) {
            return 1;
        }           
        if(n<0) {
            return 0;
        }    
        ways[n] = countWays(n-1, ways)+countWays(n-2, ways);
        return ways[n];
    }
    public static void main(String args[]) {
        int n = 5;
        int ways [] = new int[n+1];
        // Arrays.(ways,-1);
        System.out.println(countWays(n, ways));
        
    }
    
}
