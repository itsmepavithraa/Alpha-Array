public class largestnum {
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE; // Initializing the variable with minimum possible integer value
        for(int i=0;i<numbers.length;i++){
            if(largest < numbers[i]){
                largest = numbers[i]; // Updating the largest number if current number is greater than largest
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,6,13,5};
        System.out.println("The Largest number is: " + getLargest(numbers));
    }
    
}
