import java.util.HashMap;
import java.util.Map;

public class nonReaptedCharacters {
    public static void main(String[] args) {
        String s="swiss";
        HashMap<Character,Integer> map=new HashMap<>();
        for(char i:s.toCharArray()){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        System.out.println(map);
        for(Map.Entry<Character,Integer> e: map.entrySet()){
            if(e.getValue()==1){
                System.out.println(e.getKey());
                break;
            }
        }
    }
}
