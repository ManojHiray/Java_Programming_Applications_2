import java.util.*;

class BalParenthesis 
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner (System.in);
        String str;
        System.out.println("Enter String");
        str = sobj.nextLine();

        Demo dobj = new Demo();
        boolean bRet = dobj.isValid(str);

        if(bRet == true)
        {
            System.out.println("Balanced");
        }
        else
        {
            System.out.println("Non-Balanced");
        }
    }    
}

class Demo
{
    public boolean isValid(String s) 
    {
        Stack<Character> st = new Stack<Character>();
        for (char it : s.toCharArray()) 
        {
            if (it == '(' || it == '[' || it == '{')
            {
                st.push(it);
            }    
            else 
            {
                if(st.isEmpty())
                {
                    return false;
                }    
                char ch = st.pop();
                 
                if((it == ')' && ch == '(') ||  (it == ']' && ch == '[') || (it == '}' && ch == '{'))
                {
                    continue;
                }    
                else
                { 
                    return false;
                }    
            }
        }
        return st.isEmpty();
    }
    
}
