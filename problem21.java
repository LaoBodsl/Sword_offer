import java.util.Scanner;

/**
 * problem21
 */
public class problem21 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int[] num = new int[n];
    for(int i=0;i<n;i++){
        num[i]=sc.nextInt();
    }
    sc.close();
    funCore(num,n);
   }

    private static void funCore(int[] num, int n) {
        int i=0;
        int j=n-1;
        while(i<j){
            while(i<j&&num[i]%2!=0){
                i++;
            }
            while(i<j&&num[j]!=0){
                j--;
            }
            if(i<j){
                int temp=num[i];
                num[i]=num[j];
                num[j]=temp;
            }
        }
        System.out.println(num.toString());
    }
}