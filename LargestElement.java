public class LargestElement {

    public static int largestElement(int arr[]){
        int largEle = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(largEle<arr[i]){
                //swap
                int temp = arr[i];
                arr[i] = largEle;
                largEle = temp;
            }
        }
        return largEle;
    }
    public static void main(String[] args){
        int arr[] = {3,4,5,2,4,6,7,34,5};
        int requiredElement = largestElement(arr);
        System.out.println(requiredElement);
    }
}
