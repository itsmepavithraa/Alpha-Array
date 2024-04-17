public class arrayfun {
    public static void update(int marks[], int nonChangeable){

        nonChangeable =10; //changing nonChangeable as 10 but it won't change the original value
        
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args) {

        int nonChangeable = 5; //declaring nonChangeable as 5
        
        int marks[] = {97,98,99};
        update(marks, nonChangeable);
        //print our marks
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+ " ");
        }
        System.out.println();

        System.out.println(nonChangeable); //print 5 as it is because array works on call by reference. this is call by value.
    }
}
