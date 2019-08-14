import java.util.Scanner;

/**
 * package
 */
public class backage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//物品数量
        int s = sc.nextInt();//背包容量
        int[] value = new int[n+1];
        int[] weight = new int[n+1];
        for(int i=0;i<n+1;i++){
            value[i]=sc.nextInt();
            weight[i]=sc.nextInt();
        }
        sc.close();
        int res = funCore(n,s,value,weight);
        System.out.println(res);
    }

    private static int funCore(int n, int s, int[] value, int[] weight) {
        int[][] pack = new int[n+1][s+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<s;j++){
                if(weight[i]>j){
                    pack[i][j]=pack[i-1][j];
                }else{
                    pack[i][j]=Math.max(pack[i-1][j], pack[i-1][j-weight[i]]+value[i]);
                }
            }
        }
        return pack[n][s];
    }
}