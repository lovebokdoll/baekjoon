import java.util.*;
class Solution {
    public ArrayList<Integer> solution(int[] num_list) {
        ArrayList<Integer> numList = new ArrayList<>();
      
        for(int i=0;i<num_list.length;i++){
            numList.add(num_list[i]); // ArrayList에 값 추가
            }
        int lastNumber = num_list[num_list.length-1];
        int secondLastNumber = num_list[num_list.length-2];
        if(lastNumber>secondLastNumber){
            numList.add(lastNumber-secondLastNumber);
        }else {
           numList.add(lastNumber* 2);
        }
         return numList;
        }
       
    }
