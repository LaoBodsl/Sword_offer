/**
 * Tree
 */
public class MyTree {
    public TreeNode root = null;
    public MyTree(){
        root =new TreeNode("A");
    }

    public void CreatTree(){
        TreeNode nodeB = new TreeNode("B");
        TreeNode nodeC = new TreeNode("C");
        TreeNode nodeD = new TreeNode("D");
        TreeNode nodeE = new TreeNode("E");
        TreeNode nodeF = new TreeNode("F");
        TreeNode nodeG = new TreeNode("G");
        root.leftNode=nodeB;
        root.rightNode=nodeC;
        nodeB.leftNode=nodeD;
        nodeB.rightNode=nodeE;
        nodeC.leftNode=nodeF;
        nodeC.rightNode=nodeG;
    }
}