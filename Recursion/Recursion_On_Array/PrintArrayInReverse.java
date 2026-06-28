public class PrintArrayInReverse{
    public static void printArrRev(int arr[],int idx){
        // base case 
        if(idx >= arr.length) return;
        if(idx < 0) { 
            printArrRev(arr,0);
            return;
        }

        // faith --> Function will print (n-1) elements in reverse order
        printArrRev(arr,idx+1);

        // My Job
        System.out.print(arr[idx] + " ");

    }
    public static void main(String args[]){
        int arr[] = {9,4,17,20,2};

        printArrRev(arr,-10);
    }
}