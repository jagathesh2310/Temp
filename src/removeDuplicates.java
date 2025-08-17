import java.util.LinkedHashSet;
import java.util.Set;

public class removeDuplicates {
    public static void main(String[] args) {
        String s="JAGATHESHKUMAR";
        Set<Character> set= new LinkedHashSet<>();
        for(char i:s.toCharArray()){
            set.add(i);
        }
        StringBuilder ss=new StringBuilder();
        for (char c:set){
            ss.append(c);
        }
        System.out.println(ss);
    }
}
