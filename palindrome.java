//program to check wheather the entered string is palindrome or not.
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the string");
         
        String s1 = scan.next();
        String s2 = "";
        for(int i=s1.length()-1;i>=0;i--)
        {
            s2=s2+s1.charAt(i);
        }
       if(s1.equals(s2))
       {
        System.out.println("entered string is palindrome");
       } 
       else 
       {
        System.out.println("entered string is not palindrome");
       }
    }
    
}
