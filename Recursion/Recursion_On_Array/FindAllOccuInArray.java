import java.util.*;
class FindAllOccu{

    public static int[] findAllOccurences(int arr[],int i,int tar,int count){
        if(i >= arr.length){
            return new int[count];
        }

        if(arr[i] == tar) count++;

        int ans[] = findAllOccurences(arr,i+1,tar,count);
        if(arr[i] == tar)
            ans[count-1] = i;

        return ans;
    }
    
    public static void main(String args[]){
        int arr[] = {3,5,7,9,5,5,11,5,8};

        System.out.println(Arrays.toString(findAllOccurences(arr,0,5,0)));
    }
}