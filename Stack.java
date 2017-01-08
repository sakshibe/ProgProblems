/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cracking;
// @author sakshi
public class Stack {
     char []a = new char[10];
     int top;
     int max =10;
    Stack()
    {
        top = -1;
    }
    char peek()
    {
        if(top == -1)
        {
            return '#';    
        }
        else
        {
            return a[top];
        }        
    }
    void push(char num)
    {
        if(top == max)
        {
            System.out.println("Stack is full");
        }
        else
        {
            top++;
            a[top] = num;
        }
    }
    char pop()
    {
        if(top == -1)
        {
            System.out.println("Stack is empty");
            return 0;
        }
        return a[top--]; 
    }
    void display()
    {
        for(int i = top;i >= 0; i--)
        {
            System.out.println(a[i]);
        }
    }
    public static void main(String args[])
    {
        Stack obj = new Stack();
        obj.push('a');
        obj.push('b');
        obj.push('c');
        obj.pop();
        obj.push('d');
        obj.display();
        obj.peek();
    }
}
