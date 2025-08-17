public class secondLargest {
    public static int a=0;
    public static void main(String[] args) {
        System.out.println(secondLargest.a);
        int[] arr={45,3,2,78,67,4,6};
        int large=Integer.MIN_VALUE,secondLarge=Integer.MIN_VALUE;
        for(int i:arr){
            if(large<i){
                secondLarge=large;
                large=i;
            }else if(secondLarge<i && large!=i){
                secondLarge=i;
            }
        }
        String s="Jaga";
        s="kumar";
        System.out.println(s);
        System.out.println(large);
    }
}
