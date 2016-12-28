package com.wangl;

/**
 * Created by seentech on 2016/12/28.
 */
public class Solution6 {



}

class BinaryTree{
    private TreeNode  root = null;

    public BinaryTree(){
        root = new TreeNode(1,"A");
    }

    /**
     * 按照要求创建二叉树
     * @param root
     */
    public void createBinTree(TreeNode root){
        TreeNode newNodeB = new TreeNode(2,"B");
        TreeNode newNodeC = new TreeNode(3,"C");
        TreeNode newNodeD = new TreeNode(4,"D");
        TreeNode newNodeE = new TreeNode(5,"E");
        TreeNode newNodeF = new TreeNode(6,"F");

        root.leftChild = newNodeB;
        root.rightChild = newNodeC;
        root.leftChild.leftChild = newNodeD;
        root.leftChild.rightChild = newNodeE;
        root.rightChild.rightChild = newNodeF;
    }

    /**
     * 判断二叉树是否为空
     * @return false表示空,true表示有数据
     */
    public boolean isEmpty(){
        return root == null;
    }

    /**
     * 获取树的深度
     * @return
     */
    public int height(){
        return height(root);
    }

    /**
     * 获取树子树的深度
     * @param subTree
     * @return
     */
    public int height(TreeNode subTree){
        if(subTree == null){
            return 0;
        }
        else{
            int i = height(subTree.leftChild);
            int j = height(subTree.rightChild);

            return (i < j) ? (j + 1) : (i + 1);
        }
    }

    /**
     * 获取树节点个数
     * @return
     */
    public int size(){
        return size(root);
    }

    /**
     * 获取子树节点个数
     * @param subTree
     * @return
     */
    public int size(TreeNode subTree){
        if(subTree == null){
            return 0;
        }
        else{
            return 1 + size(subTree.leftChild) + size(subTree.rightChild);
        }
    }

    /**
     * 获取element 在树中的父节点
     * @param element
     * @return
     */
    public TreeNode parent(TreeNode element){
        return (root == null || root == element) ? null : parent(root, element);
    }

    /**
     * 获取element 在子树中的父节点
     * @param subTree
     * @param element
     * @return
     */
    public TreeNode parent(TreeNode subTree, TreeNode element){
        if(subTree == null){
            return null;
        }

        if(subTree.leftChild == element || subTree.rightChild == element){
            return subTree;
        }

        TreeNode parent;
        if((parent = parent(subTree.leftChild, element)) != null){
            return parent;
        }
        else{
            return parent(subTree.rightChild, element);
        }
    }

    /**
     * 获取element节点的,左孩子节点
     * @param element
     * @return
     */
    public TreeNode getLeftChild(TreeNode element){
        return (element != null) ? element.leftChild : null;
    }

    /**
     * 获取element节点的,右孩子节点
     * @param element
     * @return
     */
    public TreeNode getRightChild(TreeNode element){
        return (element != null) ? element.rightChild : null;
    }

    /**
     * 访问一个节点
     * @param subTree
     */
    public void visit(TreeNode subTree){
        subTree.isVisited = true;
        System.out.println("key:" + subTree.key + "--name:" + subTree.data);
    }

    /**
     * 前序遍历树,递归实现
     * @param subTree
     */
    public void preOrder(TreeNode subTree){
        if(subTree != null){
            visit(subTree);

            preOrder(subTree.leftChild);
            preOrder(subTree.rightChild);
        }
    }

    /**
     * 中序遍历树,递归实现
     * @param subTree
     */
    public void inOrder(TreeNode subTree){
        if(subTree != null){
            inOrder(subTree.leftChild);

            visit(subTree);

            inOrder(subTree.rightChild);
        }
    }

    /**
     * 后序遍历树,递归实现
     * @param subTree
     */
    public void postOrder(TreeNode subTree){
        if(subTree != null){
            postOrder(subTree.leftChild);
            postOrder(subTree.rightChild);

            visit(subTree);
        }
    }

    public void noRecPostOrder(TreeNode subTree){

    }

    public static void main(String[] args){
        BinaryTree binaryTree = new BinaryTree();

        binaryTree.createBinTree(binaryTree.root);

        System.out.println("size :" + binaryTree.size());
        System.out.println("height:" + binaryTree.height());

        System.out.println("*****preOrder****");
        binaryTree.preOrder(binaryTree.root);

        System.out.println("*****inOrder****");
        binaryTree.inOrder(binaryTree.root);

        System.out.println("*****postOrder****");
        binaryTree.postOrder(binaryTree.root);
    }

}

/**
 *
 */
class TreeNode{
    int key = 0;
    String data = null;
    boolean isVisited = false;
    TreeNode leftChild = null;
    TreeNode rightChild = null;

    public TreeNode(){

    }

    /**
     * @param key 层序编码
     * @param data 数据
     */
    public TreeNode(int key, String data){
        this.key = key;
        this.data = data;
        this.leftChild = null;
        this.rightChild = null;
    }
}


