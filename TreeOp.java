/**
 * TreeOp
 */
public class TreeOp {
    public static void main(String[] args) {
       MyTree myTree = new MyTree();
       myTree.CreatTree();
       TreeOp op = new TreeOp();
       op.beforeNode(myTree.root);
    }

    public void beforeNode(TreeNode node){
        if(node==null){
            return;
        }
        System.out.println(node.data);
        beforeNode(node.leftNode);
        beforeNode(node.rightNode);
    }
}