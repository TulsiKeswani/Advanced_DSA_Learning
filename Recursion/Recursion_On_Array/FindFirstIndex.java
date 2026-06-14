public class FindFirstIndex{

    // Approach 1
    public static int findFirstOccu(int arr[],int idx,int key){
        if(idx >= arr.length) return -1;

        return arr[idx] == key ? idx : findFirstOccu(arr,idx+1,key);
    }

    // Approach 2

     public static int findFirstOccu2(int arr[],int idx,int key){
        if(idx >= arr.length) return -1;

        int findIdxForward = findFirstOccu2(arr,idx+1,key);

        return arr[idx] == key ? idx : findIdxForward;
    }
    public static void main(String args[]){
        int arr[] = {9,10,2,3,2,2,4,5};

        System.out.println(findFirstOccu(arr,0,7));
        System.out.println(findFirstOccu2(arr,0,7));
    }
}