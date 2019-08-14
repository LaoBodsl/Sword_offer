/**
 * Tree
 */
public class MyTree {
    public TreeNode root = null;
    public MyTree(){
        root =new TreeNode(1);
    }

    public void CreatTree(){
        TreeNode nodeB = new TreeNode(2);
        TreeNode nodeC = new TreeNode(3);
        TreeNode nodeD = new TreeNode(4);
        TreeNode nodeE = new TreeNode(5);
        TreeNode nodeF = new TreeNode(6);
        TreeNode nodeG = new TreeNode(7);
        root.leftNode=nodeB;
        root.rightNode=nodeC;
        nodeB.leftNode=nodeD;
        nodeB.rightNode=nodeE;
        nodeC.leftNode=nodeF;
        nodeC.rightNode=nodeG;
    }
}