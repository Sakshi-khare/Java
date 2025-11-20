// MATCHING AND COMPARE
public class Matching {
    public static void main(String[] args){
        System.out.println("12345".matches("[0-9]+"));     //only digit
        System.out.println("12a45".matches("[0-9]+"));     //mixed digit
        System.out.println(" ".matches("[0-9]+"));         // empty
        System.out.println("Java".equals("java"));               // case Sensitive
        System.out.println("Java".equalsIgnoreCase("java"));   // case In Senstive
    }
}

