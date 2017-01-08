/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cracking;

/**
 *
 * @author sakshi
 */
//Given a Binary tree, check whether it is Binary search tree or not
public class BtBST 
{
Node root;
    boolean isBST(Node node, int min, int max){
        if(node == null)
            return true;
        if(node.data > min && node.data <= max
                && isBST(node.left, min, node.data)
                && isBST(node.right, node.data, max))
        {
            return true;
        }
        return false;
    }
    
    
    public static void main(String args[])
    {
        BtBST b = new BtBST();
        b.root = new Node(3);
        b.root.left = new Node(2);
        b.root.right = new Node(5);
        b.root.left.left = new Node(1);
        b.root.left.right = new Node(4);
//        b.root.left.left.left = new Node(5);  
//        b.root.right.left = new Node(7);
if(b.isBST(b.root,Integer.MIN_VALUE,Integer.MAX_VALUE))
        System.out.println("It is a Binary Search tree");
else
            System.out.println("It is not a Binary search tree");
}
}
