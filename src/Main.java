import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr={10,5,20,20,4,5,2,25,1};
        ArrayList<Integer> scores=new ArrayList<>();
        for (int num : arr) {
            scores.add(num); // Autoboxing from int to Integer
        }
        int low=scores.get(0);
        int high=scores.get(0);
        int lowCount=0;
        int highCount=0;
        for(int i: scores){
            if(low>i){
                low=i;
                lowCount++;
            }
            if(high<i){
                high=i;
                highCount++;
            }
        }
        System.out.println(highCount+" "+lowCount);

    }
}