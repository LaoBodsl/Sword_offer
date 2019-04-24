/**
 * problem_47_礼物的最大价值
 */
public class problem_47 {
    public static void main(String[] args) {
        int[][] gifts = {{1,10,3,8},{12,2,9,6},{5,7,4,11},{3,7,16,5}};
        int res = getMaxValue(gifts);
        System.out.println(res);
    }

    private static int getMaxValue(int[][] gifts) {
        if(gifts.length==0||gifts[0].length==0)
            return 0;
        int rows=gifts.length;
        int cols=gifts[0].length;
        int[] dp = new int[gifts[0].length];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                int left=0;
                int up=0;
                if(i>0)
                    up=dp[j];
                if(j>0)
                    left=dp[j-1];
                dp[j]=Math.max(left, up)+gifts[i][j]; 
            }
        }
        return dp[cols-1];
    }
}