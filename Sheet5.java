import java.util.*;
public class Sheet5 {

    /*********************1. Count vowels and consonants ***********/

    public static void CheckVowel(String text)  {
        int v=0,c=0;
        text=text.toLowerCase();
            for(int i=0;i<text.length();i++)    {
            char ch=text.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                v++;
            else if(ch > 'a' && ch < 'z')
                c++;
        }
        System.out.println("Vowels = "+v+"\nConsonants = "+c);
    }

    /*********************2. Remove all the white spaces ***********/

    public static void  Removewhitespace(String text)   {
        String txt=text.replaceAll("\\s", "");
        System.out.println(txt);
    }

    /*********************3. Check Palindrome ***********/

    public static void Palindrome(String text)  {
        String rev="";
        for(int i=text.length()-1;i>=0;i--)    {
            rev=rev+text.charAt(i);
        }
        if(text.equals(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
    
    /*********************4. String Rotation ***********/

    static void StringRotaion(String text1,String text2)  {
        String str3=text1+text1;
        if(text1.length()==text2.length() &&  str3.contains(text2))
            System.out.println("Text2 is a rotation string of Text1.");
        else
            System.out.println("Text2 is not a rotation string of Text1.");
    
    }

    /********************* 5. Find Duplicate words in String ***********/

    public static void Duplicatewords(String text1) {
        text1=text1.toLowerCase();
        String[] arr=text1.split(" ");
        for(int i=0;i<arr.length;i++)   {
            int c=0;
            for(int j=i+1;j<arr.length;j++)   {
                if(arr[i].equals(arr[j]))    
                    c++;
            }
            if(c>0)
                System.out.println(arr[i]);
        }
    }

    /******************** 6. Largest and smallest word in String ***********/

    public static void wordlength(String text)  {
        String[] arr=text.split(" ");
        String max=arr[0];
        String min=arr[0];
        for(int i=0;i<arr.length;i++)   {
            if(max.length()<arr[i].length()) 
                max=arr[i];
            if(min.length()>arr[i].length())
                min=arr[i]; 
        }
        System.out.println("Largest word = "+max+"\nSmallest word = "+min);
    }

    /********************* 7. swap  two String variables ***********/

    public static void StringSwapping(String s1,String s2) {
        int x=s1.length();
        s1=s1+s2;
        s2=s1.substring(0,x);
        s1=s1.substring(x);
        System.out.println("s1 = "+s1+" s2 = "+s2);
    }

    /********************* 8. Check whether a string is Anagram or not ***********/

    public static void CheckAnagram(String s1,String s2)    {
        boolean result=IsAnagram(s1,s2);
        if(result)
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");

    }

    public static boolean IsAnagram(String a,String b)    {
        if (a.length()!=b.length()) {
            return false;
        }
        a=a.toLowerCase();
        b=b.toLowerCase();
        int sum=0;
        for (char c='a';c<='z';c++) {
            for (int i=0;i<a.length();i++) {
                if (a.charAt(i)==c) {
                    sum++;
                }
                if (b.charAt(i)==c) {
                    sum--;
                }
            }
            if (sum!=0) {
                return false;
            }
        }
        return true;
    }
    
            //############# Main Method  #############

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in); 
       String str=new String(sc.nextLine());
      // CheckVowel(str);
      // Removewhitespace(str);
       //Palindrome(str);
        //StringRotaion(str,sc.nextLine());
       //Duplicatewords(str);
       //wordlength(str);
       StringSwapping(str,sc.nextLine());
        // CheckAnagram(str,sc.nextLine());
    }
}