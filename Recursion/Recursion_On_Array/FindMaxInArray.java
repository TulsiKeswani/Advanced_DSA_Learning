public class FindMaxInArray{

    public static int findMax(int arr[],int idx){

        // Base Case 
        if(idx >= arr.length){
            return Integer.MIN_VALUE;
        }

        // Faith --> Function will return maximum from (n-1) elements 
        int maxSoFar = findMax(arr,idx+1);

        // My JOb --> Compare current element with soFar max
        return Math.max(maxSoFar,arr[idx]);
    }
    public static void main(String args[]){
        int arr[] = {5,14,9,6,7};
        System.out.println(findMax(arr,0));
    }   
}