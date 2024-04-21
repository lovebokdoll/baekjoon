import java.util.ArrayList;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        s = s.toLowerCase();
        // ArrayList로 변경
        int cntP=0;
        int cntL = 0;
       
        // 문자를 한개씩 자른다.
        for(int i=0; i<s.length();i++){
             // 같은 문자열은 하나의 배열에 넣는다
            char c = s.charAt(i);
           
            if(c == 'p')cntP++;
            if(c =='y') cntL++;
             
        }
        
        if(cntP!=cntL){
            answer = false;
        }

        return answer;
    }
}