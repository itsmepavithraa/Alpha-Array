public class pairs {
    public static void printPairs(int numbers[]){
        for(int i=0;i<numbers.length;i++){ //outer loop
            int curr = numbers[i]; //2 4 6 8 10
            for(int j=i+1;j<numbers.length;j++){ //inner loop // j=i+1(incase of 2 we get j as 4,6,8,10)
                System.out.print("(" + curr + "," + numbers[j]+ ")"); //printing
            }
            System.out.println(); //next line
        }
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        printPairs(numbers); //call
    }
}
