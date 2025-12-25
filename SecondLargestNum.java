public class SecondLargestNum {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,5,7,88,66};

        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;

        for(int i = 0;i<arr.length;i++){
            if(arr[i]>largest){
                secLargest = largest;
                largest = arr[i];
            }else if(arr[i] > secLargest && arr[i] != largest){
                secLargest = arr[i];
            }
        }
        System.out.println("Second Largest Num of arr is:"+secLargest);
    }
}
