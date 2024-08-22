
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Solution {
    
    public long solution(long n) {
    
        String[] Arr = Long.toString(n).split("");
        
        Arrays.sort(Arr, Comparator.reverseOrder());
        
        String rtn = "";
        for(String arr:Arr){
            rtn += arr;
        }
       
        return  Long.parseLong(rtn);
    }
}