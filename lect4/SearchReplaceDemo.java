// SEARCH AND REPLACE
public class SearchReplaceDemo {
    public static void main(String[] args){
        String original = "Java is fun .Java is powerful";
        // replace java with "Python"
        String replaced = original.replace("Java","Python");
        // print both version
        System.out.println("Original :" +original);
        System.out.println("Replaced :" +replaced);
    }
}

