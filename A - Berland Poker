import java.util.Scanner;

public class BerlandPoker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t =in.nextInt();
        while(t-->0){
            int n= in.nextInt();
            int m = in.nextInt();
            int k=in.nextInt();
            int x = (n /k);
            int a = (x < m) ? x : m;
            int b = ((m - a) + (k - 2)) / (k - 1);
            int res = a - b;
            System.out.println(res);
        }
    }
}
