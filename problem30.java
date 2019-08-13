import java.util.Stack;

/**
 * problem30
 */
public class problem30 {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> minStack = new Stack<>();
        int[] num = {2,3,3,1,4,4};
        for(int i=0;i<5;i++){
            stackPush(stack,minStack,num[i]);
        }
        System.out.println(minPop(minStack));
        
    }

    private static int minPop(Stack<Integer> minStack) {
        return minStack.peek();
    }

    private static void stackPush(Stack<Integer> stack, Stack<Integer> minStack, int i) {
        stack.push(i);
        if(minStack.isEmpty()||i<minStack.peek()){
            minStack.push(i);
        }else{
            minStack.push(minStack.peek());
        }
    }
}