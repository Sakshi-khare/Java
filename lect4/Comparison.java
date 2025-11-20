//String Comparison
public class Comparison {
    public static void main(String[] args){
        String str ="Java";
        String str1="Java";
        System.out.println(str==str1); //true
        System.out.println(str.equals(str1)); //true
        String s1 ="Java";
        String s2="Ja"+"va";
        String s3 = "Ja";
        String s4 = s3 +"va";       //runtime concat
        System.out.println(s1==s2);
        System.out.println(s1==s4);
        System.out.println(s1.equals(s4));
    }
}
