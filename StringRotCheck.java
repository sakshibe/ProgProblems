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
// check whether a string is a rotation of another string
public class StringRotCheck
{
    public static void checkRot(String str1,String str2)
    {
        
        if(str1.length() == str2.length())
        {
            str1 = str1+str1;
            if(str1.indexOf(str2) != -1)
                System.out.println("str2 is a rotation of str1");
            else
                System.out.println("str2 is not a rotation of str1");
        }
        else
        {
            System.out.println("str2 is not a rotation of str1");
        }
        
    }
    public static void main(String args[])
    {
        String str1 = "waterbottle";
        String str2 = "erbottlewat";
        checkRot(str1,str2);
   
                
    }
    
}
