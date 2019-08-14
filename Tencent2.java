import java.util.Scanner;

/**
 * Tencent2
 */
public class Tencent2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0;i<T;i++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] x = new int[4];
            int[] y = new int[4];
            for(int j=0;j<=3;j++){
                x[j]=sc.nextInt();
                y[j]=sc.nextInt();
            }
            getWB(n,m,x,y);
            // System.out.println("n="+n+",m="+m);
            // for (int k=0;k<=3;k++) {
            //     System.out.print("x["+k+"]="+x[k]+",y["+k+"]="+y[k]);
            // }
            
        }
        sc.close();
    }

    private static void getWB(int n, int m, int[] x, int[] y) {
        int black = m*n/2;
        int white = m*n-black;
        int d,e;
        if(((x[0]+y[0])&1)==1){
            d=((x[1]-x[0]+1)*(y[1]-y[0]+1)+1)/2;
        }else{
            d=(x[1]-x[0]+1)*(y[1]-y[0]+1)/2;
        }
        white+=d;
        black-=d;
        if(((x[2]+y[2])&1)==1){
            d=(x[3]-x[2]+1)*(y[3]-y[2]+1)/2;
        }else{
            d=((x[3]-x[2]+1)*(y[3]-y[2]+1)+1)/2;
        }
        white-=d;
        black+=d;
        int a=Math.max(x[2], x[0]);
        int b=Math.max(y[2], y[0]);
        int c=Math.min(x[1], x[3]);
        int g=Math.min(y[1], y[3]);
        if(a<c||g<b){
            e=0;
        }
        else{
            if(((a+b)&1)==1){
                e=((c-a+1)*(g-b+1)+1)/2;
            }else{
                e=(c-a+1)*(g-b+1)/2;
            }
            white-=e;
            black+=e;
        }
        System.out.println(white+","+black);
    }
}