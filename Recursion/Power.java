public class Power{

    public static int calc_power(int x, int y){
        if(y == 0) return 1;
        return calc_power(x, y-1) * x;
    }

    public static int optimized_calc_pow(int x,int y){
        if(y == 0) return 1;
        int smallans = optimized_calc_pow(x, y / 2);
        int ans = smallans * smallans;
        
        if(y % 2 != 0) 
            ans = ans * x;

        return ans;
    }
    public static void main(String args[]){
        int x = 2;
        int y = 5;
        System.out.println(calc_power(x, y));
        System.out.println(optimized_calc_pow(x, y));
    }
}