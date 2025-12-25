public class LargestElementInArray {
    public static int getLargestAndSmallest(int arr[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++ ){
            if(largest<arr[i]){
                largest = arr[i];
            }if(smallest>arr[i]){
                smallest = arr[i];
            }
        }
        System.out.println(smallest);
        return largest;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,56,7,3};
       int result =  getLargestAndSmallest(arr);
       System.out.println(result);


    }
}
