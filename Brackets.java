/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cracking;
public class Brackets 
{
    public static boolean check(char a,char b)
    {
        return (b == '{' && a == '}') || (b == '[' && a == ']') || (b == '(' && a == ')');
    }
    public static void main(String args[])
    {
        Stack s = new Stack();
        char t,r;
        String b = "{{[([[])]}}";
        for(int i = 0 ;i<b.length();i++)
        {
            char e = b.charAt(i);
            if(e == '{' || e == '[' || e == '(')
                s.push(e);
            else
            {
                t = s.peek();
                if(check(e,t))
                s.pop();
            }
        }
        if(s.peek() == '#')
            System.out.println("balanced");
        else
            System.out.println("not balanced");
    }
}
