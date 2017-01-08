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
public class FinalizeClass 
{
    public void finalize()
    {
        System.out.println("Finalize method called");
    }
    public static void main(String[] args) 
    {
        FinalizeClass f1 = new FinalizeClass();
        f1 = null;
        System.gc();     
    }  
}
