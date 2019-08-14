public class ORdemo {
    
    public static void main(String[] args) {
        int[] data = {2,4,3,6,3,2,5,5};
        int[] num1 = new int[1];
        int[] num2 = new int[1];
        Integer num = 10;
        System.out.println("numBinary="+Integer.toBinaryString(num));
        System.out.println("num&1="+(num&1));
        ORdemo oRdemo = new ORdemo();
        oRdemo.FindNumsAppearOnce(data, num1, num2);
        oRdemo.ORshow(num);
        // System.out.println(num1[0]+","+num2[0]);
    }
    public void ORshow(Integer num) {
        
        while((num&1)==0){
         num=num>>1;
         System.out.println(Integer.toBinaryString(num));
        }

    }
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if(array==null||array.length<2)
            return;
        int resOR = 0;
        for(int i=0;i<array.length;i++){
            resOR^=array[i];
        }
        int indexOf1 = FindIndex(resOR);
        // System.out.println("indexOf1:"+indexOf1);
        for(int j=0;j<array.length;j++){
            if(IsBit1(array[j],indexOf1)){
                num1[0]^=array[j];
            }
            else{
                num2[0]^=array[j];
            }
        }
    }
    private static int FindIndex(int num){
        int index = 0;
        // System.out.println("num="+num);
        while(((num&1)==0)&&(index<32))
        {
            num=num>>1;
            ++index;
            // System.out.println("index:"+index);
        }
        
        return index;
    }
    private static boolean IsBit1(int num, int index){
        num=num>>index;
        if((num&1)==0){
            return true;
        }
        return false;
    }

  
    
}