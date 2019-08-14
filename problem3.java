/**
 * problem3
 */
public class problem3 {

    public static void main(String[] args) {
        int[] list = {0};
        int res = getDupli(list);
        System.out.println(res);
    }

    private static int getDupli(int[] list) {
        if(list.length==0)
            return 0;
        for(int i=0;i<list.length;i++){
            while(list[i]!=i){
                if(list[i]==list[list[i]])
                    return list[i];
                int temp=list[i];
                list[i]=list[temp];
                list[temp]=temp;
            }
        }
        return 0;
    }
}