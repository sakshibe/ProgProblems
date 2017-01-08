/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cracking;
// Stack should implement push, pop 
//getMin in O(1) time
/**
 *
 * @author sakshi
 */
public class StackMin {
  static int []a = new int[5];
  static int []auxSt = new int[5];
    static int top, topAux, max =5, minEle;
    StackMin()
    {
        top = -1;
        topAux = -1;
    }
    static void getMin()
    {
        System.out.println(auxSt[topAux]);
    }
    static void push(int num)
    {
        if(top == max)
        {
            System.out.println("Stack is full");
        }
        else
        {
            a[++top] = num;
            if(topAux == -1)
                auxSt[++topAux] = num;
            else
            {
                int y = auxSt[topAux];
            if(num < y)
                auxSt[++topAux] = num;
            else
                auxSt[++topAux] = y;
            }
        }
    }
    static int pop()
    {
        if(top == -1)
        {
            System.out.println("Stack is empty");
            return 0;
        }
        topAux--;
        return a[top--]; 
    }
    static void display()
    {
        for(int i = top;i >= 0; i--)
        {
            System.out.println(a[i]);
        }
    }
    public static void main(String args[])
    {
        StackMin obj = new StackMin();
        push(19);
        push(29);
        push(15);
        push(10);
        push(16);
       pop();
       pop();
       pop();
display();
        System.out.println("The minimum element in this stack is:");
getMin();
//        
//        for(int i=topAux;i>=0;i--)
//            System.out.println(auxSt[i]);
    }   
}
