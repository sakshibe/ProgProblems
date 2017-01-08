/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cracking;
//Print a single integer denoting the number of characters you must delete to make the two strings anagrams
/**
 *
 * @author sakshi
 */
public class makingAnagrams
{
      public static int numberNeeded(String first, String second) {
        int a[] = new int[256];
        int b[] = new int[256];
        int counter = 0;
        for(int i = 0;i<first.length();i++)
        {
            a[first.charAt(i)]++;
        }
        for(int i = 0;i<second.length();i++)
        {
            b[second.charAt(i)]++;
        }
        for(int i = 0;i<256;i++)
        {
            int temp = Math.abs(a[i] - b[i]);
            if(a[i] != b[i])
                counter = counter + temp;
        }
    
        return counter;
    }
  
    public static void main(String[] args) {
        String a = "mmcdem";
        String b = "amcbf";
        System.out.println(numberNeeded(a, b));
    }    
}
