public class Problem_2{

    public static void printIncreasing(int n){
        if(n == 0) return;
        printIncreasing(n-1);
        System.out.println(n);
    }

    public static void main(String args[]){
            int n = 6;

            printIncreasing(n);
    }
}