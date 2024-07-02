public class maxsubarray3 {
    public static void kadanes(int numbers[]){
        int ms = Integer.MIN_VALUE; //-infinity
        int cs = 0;

        for(int i=0;i<numbers.length;i++){
            cs = cs+ numbers[i];
            if(cs < 0 ){ //checking (if negative [less than 0])
                cs = 0;
            }
            ms = Math.max(cs, ms); //Math function [which give the maximum of cs and ms]
        }
        System.out.println("The max of the sub array is = " + ms); //printing the output
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10}; // output = 30
        kadanes(numbers);
    }
}

