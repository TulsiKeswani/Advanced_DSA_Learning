public class PrintArray{
    public static void printArr(int arr[],int idx){
        if(idx >= arr.length) return;

        System.out.print(arr[idx] + " ");
        printArr(arr,idx+1);
    }
    public static void main(String args[]){
        int arr[] = {9,5,17,20,4};

        printArr(arr,0);
    }
}