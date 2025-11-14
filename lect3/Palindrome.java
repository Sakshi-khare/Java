//topic : check string is palindrome or not
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args){
        //1. palindrome check
        String str = "madam";
        boolean ispalindrome=true;
        for (int i = 0; i< str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                ispalindrome = false;
                break;
            }
        }
        if (ispalindrome) {
            System.out.println("the string is palindrome");
        }
            else {
                System.out.println("the string is not palindrome");
            }
        }
    }
