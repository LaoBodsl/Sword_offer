/**
 * problem_63
 */
public class problem_63 {
    public static void main(String[] args) {
        int [] num = {9,11,8,5,7,12,16,14};
        System.out.println(MaxDiff(num));
    }

    private static int MaxDiff(int[] num) {
        int min = num[0];
        int maxDiff = num[1]-min;
        for(int i=2;i<num.length;i++){
            if(num[i]<min)
                min=num[i];
            int curDiff = num[i]-min;
            if(curDiff>maxDiff)
                maxDiff=curDiff;
        }
        return maxDiff;
    }
}