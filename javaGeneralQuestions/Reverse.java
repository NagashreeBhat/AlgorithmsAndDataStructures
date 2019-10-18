//How to reverse a string in java?

public class Reverse {
    public static void main(String []args) {
        String str1 = "Nagashree";
        StringBuilder str2 = new StringBuilder();
        str2.append(str1);
        str2.reverse();

        System.out.println(str2);

    }
}
