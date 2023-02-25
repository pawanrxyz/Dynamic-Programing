public class Sum_of_2 { 
    static int count2(int n) {
        int f[] = new int[n+1];
        f[0] = 0;
        f[1] = 2;

        for(int i=2;i<=n;i++) {
            f[i] = f[i-1]+2;
        }
        return f[n];
    }
    public static void main(String args[]) {
        int n = 4 ;
        System.out.println(count2(n));
    }
}