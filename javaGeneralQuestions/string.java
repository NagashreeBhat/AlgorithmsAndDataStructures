//Write a Java Program to reverse a string without using String inbuilt function.

public class string {
    public static void main(String[] args) {

        String str = "Automaon";
        StringBuilder str2 = new StringBuilder();
        str2.append(str);
        str2 = str2.reverse();     // used string builder to reverse
        System.out.println(str2);
    }

}
