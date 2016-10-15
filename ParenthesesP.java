public class ParenthesesP 
{
    static boolean checkPar(char a, char b)
    {
        return (a == '[' && b == ']') || (a == '(' && b == ')') || (a == '{' && b == '}');
    }
    static boolean checkSyn(String str)
    {
        Stack p = new Stack();
        char g,c;
        for(int i = 0;i<str.length();i++)
        {
            c = str.charAt(i);
            if(c == '[' || c == '(' || c == '{')
            {
                p.push(c);          
            }
            else if(c == ']' || c == ')' || c == '}')
            {
                g = p.pop();
                if(checkPar(g,c) == false)
                {
                    return false;
                }
            }            
        }
        if(p.top == -1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        
        String str = "{()[]}(";
        Boolean bool;
        bool = checkSyn(str);
        System.out.println(bool);
    }
}
