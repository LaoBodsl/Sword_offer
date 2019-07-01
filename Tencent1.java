import java.util.Scanner;

/**
 * Tencent1
 */
public class Tencent1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int [10000];
        int[] t = new int[10000];
        for(int i=1;i<=n;i++){
            int temp = sc.nextInt();
            p[i]=Math.min(p[i-1], t[i-1])+temp;
            if(i==1) continue;
            t[i]=Math.min(p[i-1], p[i-2]);
        }
        System.out.println(Math.min(p[n], t[n]));
        sc.close();
    }
}