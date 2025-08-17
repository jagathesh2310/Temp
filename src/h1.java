import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;

public class h1 {
    public static void main(String[] args) {
        int n=6;
        int m=2;
        int d=3;
        int[] arr={1,1,1,1,1,1};
        ArrayList<Integer> s=new ArrayList<>();
        for (int num : arr) {
            s.add(num);
        }
        int count=0;
        for (int i=0;i<n;i++){
            int temp=0;
            for (int j=0;j<m;j++){
                if(i+j<n){
                    temp+=arr[i+j];
                }else{
                    temp+=arr[i];
                }

            }
            if(temp==d){
                count++;
            }

        }


    }
}
