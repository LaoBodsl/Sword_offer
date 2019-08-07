import java.util.Scanner;

/**
 * problem15
 */
public class problem15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int count = funCore(n);
        System.out.println(count);
    }

    private static int funCore(int n) {
        int i=0;
        int count=0;
        int flag =1;
        while(i<32){
            if((flag&n)>0){
                count++;
            }
            flag=flag<<1;
            i++;
        }
        return count;
    }
}