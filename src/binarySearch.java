public class binarySearch {
    public static int reverseOrder(int[] arr,int n){
        int start=0;int end=arr.length-1;
        while (start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==3) {
                return mid;
            }
            else if (arr[mid]>n) {
                end=mid-1;
            }else {
                start=mid+1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int n=3;
        int[] arr={1,2,3,4,5,6};
        System.out.println(reverseOrder(arr,n));
    }
}
