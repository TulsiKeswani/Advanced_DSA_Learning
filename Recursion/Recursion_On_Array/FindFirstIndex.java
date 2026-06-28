public class FindFirstIndex{

    public static int findFirstOccu(int arr[],int idx,int key){
        // base case
        if(idx >= arr.length) return -1;

        // Faith --> Function will found the first index of key from idx+1 To (n-1) elemets
        int soFarIdx = findFirstOccu(arr,idx+1,key);

        // My JOb --> Check that is current value is the first index of key
        if(arr[idx] == key) return idx;

        return soFarIdx;
    }
    public static void main(String args[]){
        int arr[] = {9,10,2,3,2,2,4,5,9};

        System.out.println(findFirstOccu(arr,0,9));

    }
}