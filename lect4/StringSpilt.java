// string spilt
public class StringSpilt {
    public static void main(String[] args){
        String str = "Java is fun";
        String[]parts=str.split(" ");
        for (String word : parts){
            System.out.println(word);
        }
    }
}
