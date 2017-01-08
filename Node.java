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
public class Node 
{
    int data;
    Node left;
    Node right;
    Node parent;
    Node(int num)
    {
        this.data = num;
        left = right = parent = null;
    }    
}
