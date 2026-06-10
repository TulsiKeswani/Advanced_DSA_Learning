import java.util.*;

public class Problem_1{

    public static void printDecreasing(int n){
        if(n == 0) return;
        System.out.println(n);
        printDecreasing(n-1);
    }

    // Assuming (n-2) work will done by func -->

    // public static void printDecreasing(int n){
    //     if(n == 0) return;
    //     System.out.println(n);
    //     if(n == 1) return;
    //     System.out.println(n-1);
    //     printDecreasing(n-2);
    // }
    public static void main(String args[]){
        int N = 6;

        printDecreasing(N);
    }
}