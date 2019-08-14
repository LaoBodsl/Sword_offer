import java.util.Stack;

/**
 * problem34
 */
public class problem34 {

    public static void main(String[] args) {
        MyTree myTree = new MyTree();
        myTree.CreatTree();
        Stack<TreeNode> stack = new Stack<>();
        int sum = 0;
        funCore(myTree.root,77,sum,stack);
        
    }

    private static void funCore(TreeNode root, int i, int sum, Stack<TreeNode> stack) {
        if(root==null){
            return;
        }
        sum+=root.data;
        stack.push(root);
        if(sum==i&&root.leftNode==null&&root.rightNode==null){
            for (TreeNode var : stack) {
                System.out.print(var.data+"-->");
            }
            System.out.println();
        }
        if(root.leftNode!=null){
            funCore(root.leftNode, i, sum, stack);
        }
        if(root.rightNode!=null){
            funCore(root.rightNode, i, sum, stack);
        }
        stack.pop();
    }
}