package system_config;

/**
 * problem39
 */
public class problem39 {

    public static void main(String[] args) {
        int [] num={1,2,4,5,3,4,1};
        funCore(num);
    }

    private static void funCore(int[] num) {
        int res=num[0];
        int count=1;
        for(int i=1;i<num.length;i++ ){
            if(num[i]!=res){
                count--;
            }else{
                count++;
            }
            if(count==0){
                res=num[i];
                count++;
            }
        }
        if(count<=0){
            System.out.println(0);
        }else{
            System.out.println(res);
        }
        
    }
}