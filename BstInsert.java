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
//Inserting a new node in a Binary Search tree
public class BstInsert
{
    //Inserts a new new node to a Binary Search tree 
    Node insert(Node root, int num)
    {
        if(root == null)
        {
            root = new Node(num);
            return root;
        }
        if(num < root.data)
            root.left =  insert(root.left,num);
        else
            root.right = insert(root.right, num);
        
        return root;
    }
    
    //Delete  node from BST
    
    // Display in PreOrder DFS
    void preOrder(Node root) 
    {
        if(root == null)
            return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    
    void InOrder(Node root) 
    {
        if(root == null)
            return;
        InOrder(root.left);
        System.out.print(root.data+" ");
        InOrder(root.right);
    }
    
    void PostOrder(Node root) 
    {
        if(root == null)
            return;
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.print(root.data+" ");
    }
    
// Get the largest value from a BST
    void getMax(Node root) 
    {
        Node current = root;
        while(current.right != null)
        {
            current = current.right;
        }
        System.out.println("The largest element is "+ current.data);        
    }
    //Second largest element in a BST
    int[] a = new int[10]; 
    int i = 0;
    void getSecondMax(Node root) 
    {
        
        if(root == null)
            return;
        getSecondMax(root.left);
        a[i++] = root.data;
        getSecondMax(root.right);
        
    }
    public static void main(String[] args) 
    {
        Node root = null;
        BstInsert b = new BstInsert();
        root = b.insert(root,30);
        root = b.insert(root, 20);
        root = b.insert(root, 15);
        root = b.insert(root, 35);
        root = b.insert(root, 25);
        b.preOrder(root);
        b.getMax(root);
        b.getSecondMax(root);
        System.out.println("The second largest element is "+b.a[b.i-2]);
    }    
}
