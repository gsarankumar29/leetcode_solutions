import java.util.Scanner;
class Solution {
    public static boolean isPalindrome(int x) {
        int s = 0;
        int o = x;
        if(x<0){
            return false;
        }
        while(x>0){
            int r = x % 10;
            s = (s*10)+r;
            x=x/10;
        }
       return o == s;
    }
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //      int n = sc.nextInt();
    //      System.out.println(isPalindrome(n));
    // }
}