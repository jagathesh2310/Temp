import java.util.Arrays;

public class program1 {
    public static void main(String[] args) {
//        5
//        1
//        2 6
//        3 7 10
//        4 8 11 13
//        5 9 12 14 15
        int n=5;
        for(int i=0;i<n;i++){
            int temp=i+1;
            int count=n;
            for (int j=0;j<=i;j++){
                System.out.print(temp+" ");
                temp+=count;
                temp--;
                count--;
            }
            System.out.println();


        }
        String s="25+89-58/2";
        System.out.println(Arrays.toString(s.toCharArray()));
    }
}
