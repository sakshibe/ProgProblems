
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
//Implement 2 stacks using 1 array
public class TwoStks {
  
    static int []a = new int[10];
    static int top1,top2;
    static int max =10;
    TwoStks()
    {
        top1 = -1;
        top2  = max-1;
    }
    
    static void push1(int num)
    {
        if(top1 == max)
        {
            System.out.println("Stack is full");
        }
        else
        {
            top1++;
            a[top1] = num;
        }
    }
    static void push2(int num)
    {
            a[top2] = num;
            top2--;
    }
    
    static int pop1()
    {
        if(top1 == -1)
        {
            System.out.println("Stack is empty");
            return 0;
        }
        return a[top1--]; 
    }
    
    static int pop2()
    {
        if(top2 == max-1)
        {
            System.out.println("Stack2 is empty");
            return 0;
        }
        top2++;
        return a[top2]; 
    }
   
    static void display1()
    {
        for(int i = 0;i <=top1; i++)
        {
            System.out.println(a[i]);
        }
    }
    
    static void display2()
    {
        for(int i = max-1;i >top2; i--)
        {
            System.out.println(a[i]);
        }
    }
    
    public static void main(String args[])
    {
        TwoStks obj = new TwoStks();
        push1(1);
        push1(2);
        push1(3);
        pop1();
        push1(4);
        push2(5);
        push2(6);
        pop2();
        //display1();
        display2();
    }

}
