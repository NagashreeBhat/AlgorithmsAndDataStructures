//Write a Java Program to iterate HashMap using While and advance for loop.
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ahash {

    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<Integer,String>();
        map.put(2, "Nagashree");
        map.put(25, "Bhat");
        map.put(12, "HashMap");
        System.out.println(map.size());
        System.out.println("While Loop:");
        Iterator itr = map.entrySet().iterator();
        while(itr.hasNext()) {
            Map.Entry me = (Map.Entry) itr.next();
            System.out.println("Key is " + me.getKey() + " Value is " + me.getValue());
        }
        System.out.println("For Loop:");
        for(Map.Entry me2: map.entrySet()) {
            System.out.println("Key is: " + me2.getKey() + " Value is: " + me2.getValue());
        }
    }

}