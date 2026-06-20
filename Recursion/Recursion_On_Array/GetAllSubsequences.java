import java.util.Arrays;
import java.util.ArrayList;
public class GetAllSubsequences{

    // using Recursion

    public static ArrayList<String> getAllSubsequence(String str){
        if(str.length() == 0) return new ArrayList<String>(Arrays.asList(""));
        ArrayList<String> list = getAllSubsequence(str.substring(1));
        ArrayList<String> myans = new ArrayList<>(list);
        for(String s : list){
            myans.add(str.charAt(0) + s);
        }

        return myans;
    }
    public static void main(String args[]){
        String str = "abcd";

        System.out.println(getAllSubsequence(str));
    }
}