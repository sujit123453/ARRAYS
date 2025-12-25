class BinarySearch1{
    public static int binarySearch(int arr[],int element){
        int start = 0;int end = arr.length-1;
        while (start<=end){
            int mid = (start+end)/2;
            if(arr[mid] == element){
                return mid;
            }else if(arr[mid]<element){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void reverseArray(int arr[]){
        int start = 0;int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void printSubArray(int arr[]){
        for(int i = 0;i<arr.length;i++){
            for(int j = i;j<arr.length;j++){
                for(int k = i;k<=j;k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static int prefixSum(int arr[]){
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i =1;i<prefix.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        int result = prefix[arr.length-1];
        return result;
    }
    public static int kadansAlgo(int arr[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i = 0;i<arr.length;i++){
            cs = cs + arr[i];
            if(cs<0){
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        return ms;
    }
    public static void main(String[] args){
        int arr[] = {2,3,4,5,6,7,8,99};
       System.out.println(kadansAlgo(arr));
    }
}