import java.util.Scanner;

/**
 * problem38
 */
public class problem38 {

    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //String str = sc.nextLine();
        String str="abc";
        char[] ch =  str.toCharArray();
        int start=0;
        //sc.close();
        funCore(ch,start);

    }

    private static void funCore(char[] strArr, int start) {
        if(start==strArr.length-1){
            System.out.println(strArr);
        }
        for(int i=start;i<strArr.length;i++){
            char temp = strArr[i];
            strArr[i]=strArr[start];
            strArr[start]=temp;
            funCore(strArr, start+1);
            temp = strArr[i];
            strArr[i]=strArr[start];
            strArr[start]=temp;
        }
    }
}