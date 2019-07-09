/**
 * problem5
 */
public class problem5 {

    public static void main(String[] args) {
        String str = "we are happy";
        ReplaceBlank(str);
    }

    private static void ReplaceBlank(String str) {
        char[] strChar = str.toCharArray();
        int blankCount = 0;
        for(int i=0;i<strChar.length;i++){
            if(strChar[i]==' ')
                blankCount++;
        }
        char[] res = new char[strChar.length+blankCount*2];
        int p1=strChar.length-1;
        int p2=res.length-1;
        while(p1>=0){
            if(strChar[p1]==' '){
                res[p2--]='0';
                res[p2--]='2';
                res[p2--]='%';
            }
            else{
                res[p2--]=strChar[p1];
            }
            --p1;
        }
        String strRes = String.valueOf(res);
        System.out.println(strRes);

    }
}