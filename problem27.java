/**
 * problem27
 */
public class problem27 {

    public static void main(String[] args) {
        MyTree myTree = new MyTree();
        myTree.CreatTree();
        funCore(myTree.root);
        TreeOp op = new TreeOp();
        op.beforeNode(myTree.root);
    }

    private static void funCore(TreeNode root) {
        if(root==null){
            return;
        }
        if(root.leftNode==null&&root.rightNode==null){
            return;
        }
        TreeNode temp = root.leftNode;
        root.leftNode=root.rightNode;
        root.rightNode=temp;
        if(root.leftNode!=null){
            funCore(root.leftNode);
        }
        if(root.rightNode!=null){
            funCore(root.rightNode);
        }
    }
}