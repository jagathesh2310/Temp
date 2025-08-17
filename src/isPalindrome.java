public class isPalindrome {
    public static void main(String[] args) {
        String s="madams";
        int left=0,right=s.length()-1;
        while (left<right){
            if(s.charAt(left)!=s.charAt(right)){
                System.out.println(false);
                break;
            }
            left++;
            right--;
        }
        System.out.println(true);
    }
}
