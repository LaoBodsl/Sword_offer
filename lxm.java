import java.util.Scanner;

/**
 * lxm
 */
public class lxm {
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] num = new int[n];
    int min=0;
    int minIdenx = 0;
    for(int i=0;i<n;i++){
        num[i]=sc.nextInt();
    }
    for(int i=1;i<n;i++){
        if(i==1){
            min=Math.abs(num[i]-num[i-1]);
            minIdenx=0;
        }else{
            if(Math.abs(num[i]-num[i-1])<min){
                min=num[i]-num[i-1];
                minIdenx=i;
            }
        }
    }
    System.out.println(min);
}
}