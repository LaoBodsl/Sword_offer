import java.util.LinkedList;

/**
 * problem32
 */
public class problem32 {

    public static void main(String[] args) {
        MyTree myTree = new MyTree();
        myTree.CreatTree();
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(myTree.root);
        funCore(myTree.root,queue);
    }

    private static void funCore(TreeNode root, LinkedList<TreeNode> queue) {
        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();
            System.out.print(temp.data+"-->");
            if(temp.leftNode!=null){
                queue.offer(temp.leftNode);
            }
            if(temp.rightNode!=null){
                queue.offer(temp.rightNode);
            }
        }
    }
}