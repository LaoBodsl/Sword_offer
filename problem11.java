import java.util.Scanner;

/**
 * problem11
 */
public class problem11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] Num = new int[n];
        for(int i=0;i<n;i++){
            Num[i]=sc.nextInt();
        }
        sc.close();
        FunCore(Num);
    }

    private static void FunCore(int[] num) {
        if(num==null){
            System.out.println("error");
        }
        int i=0;
        int j=num.length-1;
        int Mid=i;
        while(num[i]>=num[j]){
            if(j-i==1){
                Mid=j;
                break;
            }
            Mid=(i+j)/2;
            if(num[Mid]>=num[i])
                i=Mid;
            else if(num[Mid]<=num[j])
                j=Mid;
        }
        System.out.println(num[Mid]);
    }
}