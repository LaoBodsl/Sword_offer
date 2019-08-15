//import java.util.Scanner;

/**
 * solution
 */
public class Solution {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //for(int i=0;i<10;i++){
            //int n = sc.nextInt();
            int n=4;
            //if(n==0){
                // break;
           // }
            funCore(n);
        //}
        //sc.close();
    }
    private static void funCore(int n){
        int sum=0;
        //int num=0;
        int temp=0;
        while(!(n<2)){
            sum+=n/3;
            temp=n%3;
            n=temp+sum;
            if(n==2){
                n++;
            }
        }
        System.out.println(sum);
    }
}