public class TowerOfHanoi{

    public static void towerOfHanoi(int n,int from,int to,int aux){
        if(n == 0) return;

        towerOfHanoi(n-1,from,aux,to);
        System.out.println("Move disk " + n + " From " + from + " To "+ to);
        towerOfHanoi(n-1, aux, to, from);

    }

    public static void main(String args[]){
        int n = 3;

        towerOfHanoi(n,1,3,2);
    }
}