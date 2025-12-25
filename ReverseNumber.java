import java.util.*;
public class ReverseNumber {
    public static void reversNum(int n){
        int result = 0;
        while(n>0){
            int ld = n%10;
            result = result*10+ld;
            n = n/10;
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        reversNum(n);
    }
}
