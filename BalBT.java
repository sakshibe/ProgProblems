//Implement a function to check if a binary tree is balanced.
package cracking;

/**
 *
 * @author sakshi
 */
public class BalBT 
{
    Node root;
    int height(Node node)
    {
            if(node == null)
                return 0;
            return 1+ Math.max(height(node.left), height(node.right));
    }
    boolean isBalanced(Node node)
    {
        int lh;
        int rh;
        
        if(node == null)
            return true;
        
        lh = height(node.left);
        rh = height(node.right);
        if(Math.abs(lh-rh) <= 1 && isBalanced(node.left) && isBalanced(node.right))
            return true;
        
        return false;
    }
    public static void main(String args[])
    {
        BalBT b = new BalBT();
        b.root = new Node(1);
        b.root.left = new Node(2);
        b.root.right = new Node(3);
        b.root.left.left = new Node(4);
        b.root.left.right = new Node(8);
        b.root.left.left.left = new Node(5);  
        b.root.right.left = new Node(7);
        
        if(b.isBalanced(b.root))
            System.out.println("tree is balanced");
        else
            System.out.println("tree is not balanced");
    }
    
}
