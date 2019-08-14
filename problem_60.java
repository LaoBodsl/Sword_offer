/**
 * problem_60_n个骰子的点数
 */
public class problem_60 {
    private static final int g_maxValue = 6;
    public static void main(String[] args) {
        int num=4;
        getProbability(num);
    }

    private static void getProbability(int num) {
        if(num<1)
            return;
        int [][] pProbabilities = new int[2][g_maxValue*num+1];
        for(int i=0;i<g_maxValue*num+1;i++){
            pProbabilities[0][i]=0;
            pProbabilities[1][i]=0;
        }
        int flag = 0;
        for(int i=1;i<=g_maxValue;i++){
            pProbabilities[flag][i]=1;
        }
        for(int k=2;k<=num;k++){
            for(int i=0;i<k;i++){
                pProbabilities[1-flag][i]=0;
            }
            for(int i=k;i<=g_maxValue*k;i++){
                pProbabilities[1-flag][i]=0;
                for(int j=1;j<=i&&j<=g_maxValue;j++){
                    pProbabilities[1-flag][i]+=pProbabilities[flag][i-j];
                }
            }
            flag=1-flag;
        }
        double total = Math.pow((double)g_maxValue, num);
        for(int i=num;i<=g_maxValue*num;i++){
            double ratio = (double)pProbabilities[flag][i]/total;
            System.out.println(i+"="+ratio);
        }
        
    }
}