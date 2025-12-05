import java.util.Arrays;
public class BinarySearch {
    public static int binarySearch(int arr[] ,int element){
        int start = 0;
        int lastEle = arr.length-1;

        while(start<=lastEle){
            int mid = (start+lastEle)/2;
            if(arr[mid] == element){
                return mid;
            }if(arr[mid]<element){
                start = mid+1;
            }else{
                lastEle= mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[] = {2,3,4,5,6,7,8,9,10,3,4}; //array should be unsorted
        Arrays.sort(arr); // 2,3,3,4,4,5,6,7,8,9,10
        int requiredElement = binarySearch(arr, 10);
        System.out.println("Required Element is at index " + requiredElement);
    }
}
