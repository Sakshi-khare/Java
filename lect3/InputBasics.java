import java.util.Scanner;
public class InputBasics {
    public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.print("enter integer: ");
     int a = sc.nextInt();
     System.out.print("enter float:");
     float b= sc.nextFloat();
     sc.nextLine();// buffer clear kr na
     System.out.print("enter single word");
     String word = sc.next();
     sc.nextLine();
     System.out.print("enter full line");
      String line = sc.nextLine();
        System.out.println("Integer: " + a);
        System.out.println("Float: " + b);
        System.out.println("Word: " + word);
        System.out.println("Line: " + line);
    }
}
