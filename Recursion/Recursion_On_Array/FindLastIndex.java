public class FindLastIndex{

    public static int findLastIndex(int arr[],int idx,int tar){
        if(idx >= arr.length) return -1;

        int lastIdx = findLastIndex(arr,idx+1,tar);

        if(lastIdx == -1 && arr[idx] == tar) return idx;

        return lastIdx;
    }
    
    public static void main(String args[]){
        int arr[] = {10,2,3,2,2,4,5};

        System.out.println(findLastIndex(arr,0,2));
    }
}