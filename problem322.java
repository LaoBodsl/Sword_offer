import java.util.LinkedList;

/**
 * problem322
 */
public class problem322 {

    public static void main(String[] args) {
        MyTree myTree = new MyTree();
        myTree.CreatTree();
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(myTree.root);
        funCore(myTree.root,queue);
    }

    private static void funCore(TreeNode root, LinkedList<TreeNode> queue) {
        int curNum = 1;
        int next = 0;
        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();
            System.out.print(temp.data);
            if(temp.leftNode!=null){
                queue.offer(temp.leftNode);
                next++;
            }
            if(temp.rightNode!=null){
                queue.offer(temp.rightNode);
                next++;
            }
            curNum--;
            if(curNum==0){
                System.out.println();
                curNum=next;
                next=0;
            }
        }
    }
}