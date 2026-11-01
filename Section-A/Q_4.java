// Check Anagram
import java.util.*;
public class AnagramChecker{
    public static boolean checkAnagram(String str1, String str2){
        str1=str1.replaceAll("\\s","").toLowerCase();
        str2=str2.replaceAll("\\s","").toLowerCase();
        if(str1.length()!=str2.length()){
            return false;
        }
        char[] charArray1=str1.toCharArray();
        char[] charArray2=str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1,charArray2);            
    }
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
        System.out.println("================");
        System.out.println("Anagram Checker");
        System.out.println("===============");
       System.out.print("Enter first string:");
        String firststring=sc.nextLine();
        System.out.print("Enter second string:");
        String secondstring=sc.nextLine();
        if(checkAnagram(firststring,secondstring)){
            System.out.println("\""+firststring+"\" and \""+secondstring+"\" are anagrams");
        }
        else{
             System.out.println("\""+firststring+"\" and \""+secondstring+"\" are not anagrams");
        }
    }
}
