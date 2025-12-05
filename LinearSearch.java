class LinearSearch{
    public static int linearSearch(int arr[],int element){
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == element){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {3,4,5,2,7,6,8,9};
        int requiredElement = linearSearch(arr, 6);
        System.out.println("Required Element at index " + requiredElement);

    }
}