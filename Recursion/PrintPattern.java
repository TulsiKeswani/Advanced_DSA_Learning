public class PrintPattern{

    // With return 
    public static String printPattern(int n){
        if(n == 0) 
            return "";

        String smallAns = printPattern(n-1);
        return n + " " + smallAns +  n + " " +  smallAns + n + " ";
    }

    // Without return

    public static void printPattern2(int n){
        if(n == 0) return;

        System.out.print(n + " ");
        printPattern2(n-1);
        System.out.print(n + " ");
        printPattern2(n-1);
        System.out.print(n + " ");
    }
    public static void main(String args[]){
            int n = 3;

            System.out.println(printPattern(n));
            printPattern2(n);
    }
}