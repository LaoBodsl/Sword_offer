import java.util.Scanner;

/**
 * Fibonacci
 */
public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        FunCore(n);
    }

    private static void FunCore(int n) {
        int[] arr = new int[n+1];
        arr[0]=0;
        arr[1]=1;
        arr[2]=1;
        if(n<=2){
            System.out.println(arr[n]);
        }else{
            for(int i=3;i<=n;i++){
                arr[i]=arr[i-1]+arr[i-2];
            }
            System.out.println(arr[n]);
        }

    }
}