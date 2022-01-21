/*
import java.io.*;
import java.util.*;
class CharOccur 
{
	static void characterCount(String inputString)
	{
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
       
        char[] strArray = inputString.toCharArray();

		for (char c : strArray) 
        {
			if (charCountMap.containsKey(c)) 
            {
                charCountMap.put(c, charCountMap.get(c) + 1);
			}
			else 
            {
                charCountMap.put(c, 1);
			}
		}

		for (Map.Entry entry : charCountMap.entrySet()) 
        {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
	public static void main(String[] args)
	{
		String str = "manoj";
		characterCount(str);
	}
}
*/


/*Java Program to find the frequency of characters in a string*/

import java.util.*;

class CharOccur 
{  
     public static void main(String args[]) 
     { 
		Scanner sobj = new Scanner(System.in);

		String str;  

		System.out.println("Enter String");
		str = sobj.nextLine(); 

        int freq[] = new int[str.length()];  
        
        //Convert the given string into character array  
        char str1[] = str.toCharArray();  

        for(int i = 0; i <str.length(); i++) 
        {  
            freq[i] = 1;  
            for(int j = i+1; j <str.length(); j++) 
            {  
                if(str1[i] == str1[j])
                {  
                    freq[i]++;  
                    //Set str1[j] to 0 to avoid printing visited character  
                    str1[j] = '0';  
                }  
            }  
        }            
        //Displays the characters and their corresponding frequency  
        System.out.println("Frequencies of the characters:"); 
 
        for(int i = 0; i < freq.length; i++) 
        {  
            if(str1[i] != ' ' && str1[i] != '0')  
                System.out.println(str1[i] + " " + freq[i]);  
        }  
    }  
}  
