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
public class MergSortArr 
{
    void merge(int []a,int []b)
    {
        int al = a.length;
        int bl = b.length;
        int n = al+bl;
        int []c = new int[15];
        int i=0,j=0,k=0;
        //merge
        while(i < al && j<bl)
        {
            if(a[i] < b[j])
            {
                c[k] = a[i];
                i++;
            }
            else
            {
                c[k]=b[j];
                j++;
            }
            k++;
        }
        while(i<al)
        {
            c[k] = a[i];
            k++;
            i++;
        }
        while(j<bl)
        {
            c[k] = b[j];
            k++;
            j++;
        }
                
        //print
        for(k =0;k<n;k++)
            System.out.print(c[k]+" ");
    }
    public static void main(String args[])
    {
        int []a = new int[]{3,4,6,10,11,15,16,20};
        int []b = new int[]{1,5,8,12,14,19};
        MergSortArr m = new MergSortArr();
        m.merge(a, b);
    }
    
}
