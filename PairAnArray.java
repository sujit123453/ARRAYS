// (3,2)(3,4)(3,5)(3,6)(3,7)(3,2)
// (2,4)(2,5)(2,6)(2,7)(2,2)
// (4,5)(4,6)(4,7)(4,2)
// (5,6)(5,7)(5,2)
// (6,7)(6,2)
// (7,2)
//O(n*n)
public class PairAnArray { 
    public static void pairAnArray(int arr[]){
        int total_pairs = 0;
        for(int i =0;i<arr.length;i++){
            int curr = arr[i];
            for(int j = i+1;j<arr.length;j++){
                System.out.print("(" + curr + "," + arr[j] + ")");
                total_pairs++;
            }
            System.out.println();
        }
        System.out.println(total_pairs);
    }
    public static void main(String[] args) {
        int arr[] = {3,2,4,5,6,7,2};
        pairAnArray(arr);
        
    }
}
