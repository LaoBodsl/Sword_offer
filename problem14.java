import java.util.Scanner;

/**
 * problem14
 */
public class problem14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        //int n = sc.nextInt();
        sc.close();
        int max = funCore(len);
        System.out.println(max);
    }

    private static int funCore(int len) {
        if(len<2){
            return 0;
        }
        if(len==2){
            return 1;
        }
        if(len==3){
            return 2;
        }
        int[] pd = new int[len+1];
        pd[0]=0;
        pd[1]=1;
        pd[2]=2;
        pd[3]=3;
        int max=0;
        for(int i=4;i<=len;i++){
            max=0;
            for(int j=1;j<=i/2;j++){
                int temp = pd[j]*pd[i-j];
                if(temp>max){
                    max=temp;
                }
                pd[i]=max;
            }
        }
        max=pd[len];
        return max;
    }
}