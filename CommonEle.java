/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cracking;
// Find the common elements in two sorted arrays

import java.util.HashSet;

/**
 *
 * @author sakshi
 */
public class CommonEle 
{
    public static void findCommonElements(int[] a,int[] b)
    {
         HashSet<Integer> hs = new HashSet<>();
         int n = a.length >= b.length ? a.length : b.length;
         int[] common = new int[n];
         int k =0;
         for(int i = 0;i<a.length;i++)
         {
             if(!hs.contains(a[i]))
             {
                 hs.add(a[i]);
             }
         }
         for(int i = 0;i<b.length;i++)
         {
             if(hs.contains(b[i]))
             {
                 common[k] = b[i];
                 k++;
             }
         }
         for(int i = 0;i<k;i++)
         {
             System.out.print(common[i]);
         }
    }
    //making use of the fact that the arrays are sorted
    public static void findCommonElements2(int[] a,int[] b)
    {
        int i =0,j=0;
        while(i < a.length && j<b.length)
        {
            
            if(a[i] == b[j])
            {
                System.out.print(a[i]+" ");
                i++;j++;
                
            }
                
            else if(a[i] > b[j])
                j++;
            else
                i++;
        }   
    }
    public static void main(String[] args) 
    {
        int[] a = {2,3,5,7,8,9,10,15,22};
        int[] b = {1,2,3,5,6,7,9,11,16,20,22,25};
        findCommonElements(a,b);        
        findCommonElements2(a,b);        
    }
}
