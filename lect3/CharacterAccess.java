import java.util.Scanner;
public class CharacterAccess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        // character access
        System.out.println("characters in string");
        for (int i = 0; i < str.length(); i++){
            System.out.println(str.charAt(i));
        }
        System.out.println("last character:" + str.charAt(str.length() - 1));
    }
}
