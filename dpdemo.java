import java.util.Arrays;

/**
 * dpdemo
 */
public class dpdemo {
    public static void main(String[] args) {
        int[] List = {1,5,3,4,6,9,7,8};
        System.out.println(maxList(List));
    }

    private static int maxList(int[] list) {
        int[] f = new int[list.length];
        f[0]=1;
        for(int i=0;i<list.length;i++){
            for(int j=0;j<i;j++){
                if(list[j]<list[i])
                    f[i]=Math.max(f[i], f[j]+1);
                    
            }
            System.out.println("F("+i+")"+"="+f[i]);
        }
        Arrays.sort(f);
        return f[f.length-1];
    }
}