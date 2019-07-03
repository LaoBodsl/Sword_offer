import java.util.Scanner;

/**
 * ByteDance1
 */
public class ByteDance1 {
    static int MOD = 99997867;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();
        int street[] = new int[N];
        for(int i=0;i<N;i++){
            street[i]=sc.nextInt();
        }
        // int N=5,D=19;
        // int[] street = {1,10,20,30,50};
        int count =0;    
        sc.close();
        for(int i=0;i<N;i++){

            int X = street[i]+D;
            int low=i+1;
            int high = N-1;
            int j=-1;
            while(low<=high){
                int mid=low+(high-low)/2;
                if(street[mid]>X){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }
            j=high;
            if((j-i-1)>0){
                int a=(j-i)%MOD;
                int b=(j-i-1)%MOD;
                count+=((a*b)/2);
            }
        }
        // for(int i=0;i<N;i++){
        //     System.out.println(street[i]);
        // }
        System.out.println(count);
    }
}