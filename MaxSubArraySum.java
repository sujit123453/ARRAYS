public class MaxSubArraySum {
    public static int maxSubArraySum(int arr[]){
        // int currsum = 0;
        // int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
         prefix[0] = arr[0];
        for(int i = 1;i<prefix.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        int n = prefix.length-1;
        return prefix[n];
    }
    public static void main(String[] args){
        int arr[] = {1,-1,6,3,7,8};
        System.out.println(maxSubArraySum(arr));
    }
}
