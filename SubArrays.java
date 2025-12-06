// 3 
// 3 2
// 3 2 4
// 3 2 4 5
// 3 2 4 5 6
// 3 2 4 5 6 3
// 3 2 4 5 6 3 2

// 2
// 2 4
// 2 4 5
// 2 4 5 6
// 2 4 5 6 3
// 2 4 5 6 3 2

// 4
// 4 5
// 4 5 6
// 4 5 6 3
// 4 5 6 3 2

// 5
// 5 6 
// 5 6 3
// 5 6 3 2

// 6
// 6 3
// 6 3 2

// 3
// 3 2

// 2+
// o(n*n*n)
public class SubArrays {
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
    public static void main(String[] args) {
        int arr[] = {3,2,4,5,6,3,2};
        printSubArray(arr);
    }
}
