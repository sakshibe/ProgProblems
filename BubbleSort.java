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
public class BubbleSort
{
    public static void main(String[] args) 
    {
        int[] a = {20,50,8,69,56};
        int n = a.length;
        bubblesrt(a,n);
        for(int i =0;i<n;i++)
            System.out.print(a[i]+" ");
    }

    private static void bubblesrt(int[] a,int n) 
    {
        int temp;
        for(int i = 1; i < n ; i++)
        {
            for(int j = 0;j<(n-i);j++)
            {
                if(a[j] > a[j+1])
                {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
}
