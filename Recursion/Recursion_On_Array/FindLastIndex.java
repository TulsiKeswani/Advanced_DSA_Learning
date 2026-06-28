public class FindLastIndex{

    public static int findLastIndex(int arr[],int idx,int tar){
        // base case
        if(idx == arr.length) return -1;
        
        // Faith --> Function will return last index of target from idx+1 to (n-1) elements
        int furtherIndex = findLastIndex(arr,idx+1,tar);

        // MYJob --> check if furtherIndex exist otherwise check current index value == target or not

        if(furtherIndex != -1) return furtherIndex;


        return arr[idx] == tar ? idx : -1;
    }
    
    public static void main(String args[]){
        int arr[] = {10,2,3,2,2,4,5};

        System.out.println(findLastIndex(arr,0,2));
    }
}