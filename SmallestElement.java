public class SmallestElement {
    public static int findSmallestEle(int arr[]){
        int smallEle = Integer.MAX_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(smallEle>arr[i]){
                //swap
                int temp = smallEle;
                smallEle = arr[i];
                arr[i] = temp;
            }
        }
        return smallEle;
    }
    public static void main(String[] args){
        int arr[] = {3,4,5,2,4,6,7,34,5};
        int requiredElement = findSmallestEle(arr);
        System.out.println(requiredElement);
    }
}
