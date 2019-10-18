//Find duplicates in a string
import java.util.HashMap;
import java.util.Set;

public class Pyramid {
     static void Pyramid(String inputString){
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        char[] stringArray = inputString.toCharArray();
        for( char c: stringArray){
            if(charCountMap.containsKey(c)){
                charCountMap.put(c, charCountMap.get(c)+1);
            }
            else
            {
                charCountMap.put(c,1);
            }
        }
        Set<Character> charInString = charCountMap.keySet();
        System.out.println("Duplicates in" + inputString);

        for(Character ch: charInString){
            if(charCountMap.get(ch)>1) {
                System.out.println(ch + ":" + charCountMap.get(ch));

            }
        }



    }
    public static void main(String[] args)
    {
        Pyramid("JavaJ2EE");

        Pyramid("Fresh Fish");

        Pyramid("Better Butter");
    }
}
