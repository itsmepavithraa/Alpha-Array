public class insertionsort {
    public static void insertionSort(int arr[], int n){
        for(int i=1;i<n;i++){ //outer loop that traverse from index 1 to last element(n)
            int key = arr[i]; //storing first index value (arr[i]) into key
            int j = i-1; 
            while(j>=0 && arr[j]>key){ //for positive && condition chekcing for right shift
                arr[j+1] = arr[j]; //right shifting
                j--; //checking all the elements
            }
            arr[j+1] = key; //fixing into the right place
        }
    }
    public static void printArray(int arr[]){ //printing all the inserted sort
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
    }
    System.out.println();
}
    public static void main(String[] args) {
        int[] arr = {5,4,1,3,2};
        insertionSort(arr, arr.length);
        printArray(arr);
    }
}
