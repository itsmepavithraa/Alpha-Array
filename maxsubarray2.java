public class maxsubarray2 {
    public static void sumSubArray(int numbers[]){
        int currSum = 0;
        int prefix[] = new int[numbers.length];
        //calculate prefix array
        prefix[0] = numbers[0]; //first value will be equal 
        for(int i=1;i<prefix.length;i++){
            prefix[i] = prefix[i-1] + numbers[i]; //adding the next sum to the previous sum
        }
        int maxSum = Integer.MIN_VALUE; // -infinity
        for(int i=0;i<numbers.length;i++){
            int start = i;
            for(int j=i;j<numbers.length;j++){
                int end = j;
                currSum = start==0 ? prefix[end] : prefix[end] - prefix[start - 1] ; //start = 0 ==> 0-1 = -1
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
