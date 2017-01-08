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
// Create a Binary Sarch tree from a sorted array
public class SortArrBst {
     static Node root;
    Node SortedArrayToBST(int[] arr,int start,int end)
    {
        Node n;
        int mid;
        if(start > end)
            return null;
        mid = (start+end)/2;
        n = new Node(arr[mid]);
        n.left = SortedArrayToBST(arr, start, mid-1);
        n.right = SortedArrayToBST(arr, mid+1, end);
        return n;
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
       int arr[] = new int[]{1,2,3,4,5,6,7};
       SortArrBst b = new SortArrBst();
       int n = arr.length;
       root = b.SortedArrayToBST(arr, 0, n-1);
       b.preOrder(root);
   }
    
}
