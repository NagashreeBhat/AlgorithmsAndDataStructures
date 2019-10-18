import java.lang.reflect.Array;
import java.util.Arrays;

//Using Arrays.equals() Method
public class ArrayEquals {
    public static void main(String[] args){
        String[] s1 = {"1", "23", "24"};
        String[] s2 = {"1", "23", "24"};
        String[] s3 = {"snbdf", "   wjhqfbv", "dbfjhvbf"};
        System.out.println(Arrays.equals(s1, s2));
        System.out.println(Arrays.equals(s2, s3));
    }
}
