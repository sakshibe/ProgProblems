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
public class Bst 
{
    Node root;
    void insert(int num)
    {
        Node n = new Node(num);
        if(root == null)
        {
            root = n;
            return;
        }
        Node current = root;
        Node parent = null;
        while(true)
        {
            parent = current;
            if(num < current.data)
            {
                current = current.left;
                if(current == null)
                {
                    parent.left = n;
                    return;
                }
            }
            else
            {
                current = current.right;
                if(current == null)
                {
                    parent.right = n;
                    return;
                }
            }            
        }
    }
    void preOrder(Node node)
    {
        if(node == null)
            return;
       
        System.out.print(node.data);
        preOrder(node.left);
        preOrder(node.right);
    }
   public static void main(String args[])
   {
       Bst b = new Bst();
       b.insert(5);
       b.insert(6);
       b.insert(1);
       b.insert(4);
       b.preOrder(b.root);
   }
}
