public class Factorial{

    public static int calc_fact(int n){
        if(n == 0 || n == 1) return 1; 
        return calc_fact(n-1) * n;
    }
    public static void main(String args[]){
        int n = 5;

        System.out.println(calc_fact(n));
    }
}