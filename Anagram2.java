import java.util.Arrays;

class Anagram2 
{
    public static void main(String args[])
    {
        String str1 = "abcd";
        String str2 = "dabc";
        System.out.println("Both Strings are Anagram : "+CheckAnagram(str1, str2));

    }

    public static boolean CheckAnagram(String str1, String str2)
    {
        char[] Arr1 = str1.toCharArray();
        char[] Arr2 = str2.toCharArray();

        Arrays.sort(Arr1);
        Arrays.sort(Arr2);

        return Arrays.equals(Arr1, Arr2);
    }
}
