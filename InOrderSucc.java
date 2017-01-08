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
//Write an algorithm to find the "next" node (i.e successor in InOrder traversal) of a given node in a binary search tree
public class InOrderSucc 
{
   Node root;
   Node insert(Node node,int num)
   {
       Node n = new Node(num);
       if(node == null)
       {
           return n;
       }
       else
       {
           Node temp = null;
           if(num < node.data)
           {
               temp = insert(node.left,num);
               node.left = temp;
               temp.parent = node;
           }
           else
           {
               temp = insert(node.right,num);
               node.right = temp;
               temp.parent = node;
           }
           //return node;
       }
       return node;
   }
   Node nextNode(Node node)
   {
       if(node.right != null)
       {
           return getMin(node.right);
       }
       Node p = node.parent;
       while(p!=null && node == p.right)
       {
           node = p;
           p = p.parent;
       }
       return p;
   }
   Node getMin(Node node)
   {
       while(node.left != null)
       {
           node = node.left;
       }
       return node;
   }
   void InOrder(Node node)
   {
       if(node == null)
           return;
       InOrder(node.left);
       System.out.print(node.data+"  ");
       InOrder(node.right);
   }
   public static void main(String args[])
   {
       InOrderSucc i = new InOrderSucc();
       i.root = i.insert(i.root, 15);
       i.root = i.insert(i.root, 12);
       i.root = i.insert(i.root, 10);
       i.root = i.insert(i.root, 13);
       i.root = i.insert(i.root, 19);
       i.root = i.insert(i.root, 16);
       i.root = i.insert(i.root, 23);
       i.root = i.insert(i.root, 21);
       i.root = i.insert(i.root, 25);
       //Node temp = i.root.left.right;
       Node temp = i.root;
       i.InOrder(i.root);
       System.out.print("The InOrder successor is :");
       System.out.println(i.nextNode(temp).data);
   }
}
