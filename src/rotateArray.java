import java.util.Arrays;

public class rotateArray {
    public static void main(String[] args) {
//        8
//        7 5 2 11 2 43 1 1
//        2
        int[] arr={7,5,2,11,2,43,1,1};
        for (int j=0;j<2;j++){

            int firstElement=arr[0];
            for(int i=0;i<arr.length-1;i++){
                arr[i]=arr[i+1];
            }
            try {
                throw new RuntimeException();
            }catch (Exception e){
                System.out.println("Jaga");
            }

            arr[arr.length-1]=firstElement;

        }
        System.out.println(Arrays.toString(arr));

    }
}
