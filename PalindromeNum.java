import java.util.Scanner;

public class PalindromeNum {
    public static int checkPalindromNum(int n){
        int originalNum = n;
        int result = 0;
        while(n!=0){
            int ld = n%10;
            result = result*10+ld;
            n = n/10;
        }
        if(originalNum == result){
            System.out.println("num is palidrome");
        }else{
            System.out.println("num is not a palindrome");
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        checkPalindromNum(n);
    }
}
