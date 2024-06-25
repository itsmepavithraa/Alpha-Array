public class largestnum{
    public static int largestArray(int numbers[]){
        int largest = Integer.MIN_VALUE; //-infinity
        int smallest = Integer.MAX_VALUE;//+infinity
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>largest){
                largest = numbers[i];
            }
            if(numbers[i]<smallest){
                smallest = numbers[i];
            }
        }
        System.out.println("The smallest Number is: "+ smallest);
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {-8, 14,5,89,900};
        int lar = largestArray(numbers);
        System.out.println("The largest Numbers is: " + lar);
    }
}