/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Write a multiply function that multiples 2 integers without using *
package cracking;

/**
 *
 * @author sakshi
 */
public class Multiply 
{
    //simple method
    void mul(int a, int b) {
        int sum =0;
        for(int i = 1;i<=b;i++)
            sum +=a;
        System.out.println("product: "+sum);
    }
    //method using recursion
    int mult(int a, int b)
    {
        if(b == 0)
            return 0;
        return a + mult(a,b-1);
    }
    
    public static void main(String[] args) {
        int a = 4,b=7;
        Multiply m = new Multiply();
        System.out.println("product(method using recursion) "+ m.mult(a,b));
    }

}
