public class FindMaxInArray{

    public static int findMax(int arr[],int idx){
        if(idx >= arr.length) return Integer.MIN_VALUE;

        int forwardMax = findMax(arr,idx+1);

        return Math.max(forwardMax,arr[idx]);
    }
    public static void main(String args[]){
        int arr[] = {5,14,9,6,7};
        System.out.println(findMax(arr,0));
    }   
}