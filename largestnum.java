public class largestnum {
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE; // -infinity
        int smallest = Integer.MAX_VALUE; //+infinity
        for(int i=0;i<numbers.length;i++){
            if(largest < numbers[i]){
                largest = numbers[i]; // Updating the largest number if current number is greater than largest
            }
            if(smallest > numbers[i]){
                smallest = numbers[i]; //Updating
            }
            
        }
        System.out.println("Smallest number: " + smallest); //printing smallest number
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {1,-9,6,13,5};
        System.out.println("The Largest number is: " + getLargest(numbers));
    }
    
}
