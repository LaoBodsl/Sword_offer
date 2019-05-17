/**
 * Problem_56_2
 */
public class Problem_56_2 {

    public static void main(String[] args) {
        int[] num = {8,2,2,2,3,3,3,4,4,4};
        int res = FindNumOnce(num);
        System.out.println(res);
    }

    private static int FindNumOnce(int[] num) {
        if(num==null||num.length<=0)
            return 0;
        int[] BitSum = new int[32];
        for(int i=0;i<num.length;i++){
            int bitMask=1;
            for(int j=31;j>=0;j--){
                int bit = num[i]&bitMask;
                if(bit!=0){
                    BitSum[j]+=1;
                }
                bitMask=bitMask<<1;
            }
        }
        int res=0;
        for(int i=0;i<32;i++){
            res=res<<1;
            res+=BitSum[i]%3;
        }
        return res;
    }
}