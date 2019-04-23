import jdk.nashorn.internal.runtime.NumberToString;

//剑指第二版第46题
class problem_46 {
    public static void main(String[] args) {
        int number = 12258;
        String numberString = NumberToString.stringFor(number);
        // System.out.println(numberString);
        int res = TransNumber(numberString);
        System.out.println(res);
    }

    private static int TransNumber(String numberString) {
        int len=numberString.length();
        int[] countRe = new int[len];
        countRe[len-1]=1;
        int count;
        for(int i=len-2;i>=0;i--){
            count=countRe[i+1];
            int digit1=numberString.charAt(i)-'0';
            int digit2=numberString.charAt(i+1)-'0';
            int connectNumber=digit1*10+digit2;
            if(connectNumber>=10&&connectNumber<=25){
                if(i<len-2){
                    count+=countRe[i+2];
                }else if(i==len-2){
                    count+=1;
                }
            }
            countRe[i]=count;
        }
        count=countRe[0];
        return count;
    }
}