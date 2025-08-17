public class missingNumber {
    public static void main(String[] args) {
        int[] arr={1, 2, 4, 5, 6};
        int n=arr.length;
        int total=(n+1)*(n+2)/2;
        for(int i:arr){
            total-=i;
        }
        System.out.println(total);

    }
}
