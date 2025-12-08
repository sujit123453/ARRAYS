class RemoveDuplicates{
    public static int removeDuplicates(int arr[]){
        if(arr.length == 0){
            return 0;
        }
        int k = 1;
        for(int i = 1;i<arr.length;i++){
            if(arr[i] != arr[k-1]){
                arr[k] = arr[i];
                
                k++;
            }
           
        }
        return k;
    }
    public static void main(String[] args){
        int arr[] = {1,1,1,2,3,3,4,4,5,5,8,9,9};
        int k = removeDuplicates(arr);
        System.out.println(k);
         for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}