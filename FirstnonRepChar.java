/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sakshi
 */
import java.util.HashMap;
public class FirstnonRepChar 
{
    public char findFirstNonRepChar(String str)
    {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i =0;i<str.length();i++)
        {
            char c = str.charAt(i);
            if(map.containsKey(c))
                map.put(c,map.get(c)+1);
            else
                map.put(c,1);
        }
        for(int j =0;j<str.length();j++)
        {
            char c = str.charAt(j);
            if(map.get(c)==1)
            {
                return c;
            }         
        }
        return '#';
    }    
    public static void main(String args[])
    {
        String str = "aabbccded";
        FirstnonRepChar obj = new FirstnonRepChar();
        char ch = obj.findFirstNonRepChar(str);
        if(ch == '#')
        {
            System.out.println("no character unique");
        }
        else
        {
            System.out.println("first non repeating character :"+ch);
        }
    }
}
