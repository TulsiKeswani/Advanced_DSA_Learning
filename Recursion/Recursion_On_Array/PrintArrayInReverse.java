public class PrintArrayInReverse{
    public static void printArrRev(int arr[],int idx){
        if(idx >= arr.length) return;

        printArrRev(arr,idx+1);
        System.out.print(arr[idx] + " ");
    }
    public static void main(String args[]){
        int arr[] = {9,4,17,20,2};

        printArrRev(arr,0);
    }
}