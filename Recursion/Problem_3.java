public class Problem_3{

    public static void printIncreasingDecreasing(int n){
            if(n == 0) return;

            System.out.println(n);
            printIncreasingDecreasing(n - 1);

            if(n != 1)
                System.out.println(n);
    }

    public static void main(String args[]){
         int n = 5;

         printIncreasingDecreasing(n);
    }
}