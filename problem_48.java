/**
 * problem_48_最长不含重复字符的子字符串
 */
public class problem_48 {
    public static void main(String[] args) {
        int len = findMaxSubstringLength("arabcacfr");
        System.out.println(len);
    }

    private static int findMaxSubstringLength(String string) {
        if(string==null||string.length()==0)
            return 0;

        int maxLen=0;
        int curLen=0;
        int[] postion = new int[26];
        for (int i=0;i<postion.length;i++){
            postion[i]=-1;
        }
        for(int i=0;i<string.length();i++){
            int curChar = string.charAt(i)-'a';
            int prePosition = postion[curChar];
            int distance = i-prePosition;
            if(prePosition==-1||distance>curLen){
                curLen++;
            }
            else{
                if(curLen>maxLen){
                    maxLen=curLen;
                }
                curLen=distance;
            }
            postion[curChar]=i;
        }
        if(curLen>maxLen){
            maxLen=curLen;
        }
        return maxLen;
    }
}