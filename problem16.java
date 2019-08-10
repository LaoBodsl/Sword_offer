import java.util.Scanner;

/**
 * problem16
 */
public class problem16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        double res = funCore(n,x);
        System.out.println(res);
    }

    private static double funCore(int n, int x) {
        double res = 1.0;
        for(int i=1;i<=x;i++){
            res*=n;
        }
        return res;
    }
}