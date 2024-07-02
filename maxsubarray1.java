public class maxsubarray1 {
    public static void sumSubArray(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE; // -infinity
        for(int i=0;i<numbers.length;i++){
            int start = i;
            for(int j=i;j<numbers.length;j++){
                int end = j;
                currSum = 0; //again need to start with new number
                for(int k=start; k<=end; k++){
                    currSum += numbers[k];//adding instead of printing
                }
            System.out.println(currSum); //printing all the current sum value
            if(maxSum < currSum){ // checking
                maxSum = currSum;
            }
            }
        }
        System.out.println("Maximum Sum = " + maxSum);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10}; // output = 30
        sumSubArray(numbers);
    }
}
