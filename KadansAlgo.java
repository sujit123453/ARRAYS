public class KadansAlgo {
    public static void main(String[] args) {
        int arr[] = {-2,-3,4,-1,-2,1,5,3};
        int cs = 0;
        int mx = Integer.MIN_VALUE;
        
        for(int i =0;i<arr.length;i++){
            cs += arr[i];
            if(cs<0){
                cs = 0;
            }
            mx = Math.max(cs,mx);
        }
        System.out.println("MaxsubArraySum is " + mx);
    }
}

// o/p : MaxsubArraySum is 10
// time complexity: o(n)
