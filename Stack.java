/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sakshi
 */
import java.util.*;
  
public class Stack 
{
//IMPLEMENTING A STACK USING ARRAYS
    int MaxLen = 5;
    char []a = new char[5];
    int top = -1;
    void push(char num)
    {
        if(top == MaxLen-1)
        {
            System.out.println("Stack overflow");
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
        }
        else
        {
            return a[top--];
        }
        return '#';
    }
    void display()
    {
        for(int i = 0; i<=top;i++)
        {
            System.out.println(a[i]);
        }
    }
    public static void main(String args[])
    {
        Stack s = new Stack();
        s.push('a');
        s.push('b');
        s.push('c');
        s.pop();
        s.push('d');
        s.push('e');

        
        s.display();
    }
}