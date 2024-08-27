class Solution {
    public long solution(int a, int b) {
        
        long answer = 0;
        int start = 0;
        int end = 0;
        
        if(a==b){
            
            answer = a;
            
        } else if(a>b){
            
            start = b;
            end = a;
         
        } else if(b>a){
            
            start = a;
            end = b;
        }
        
        for(int i=start;i<=end;i++){
            
            answer+=i;
            
        }
        
        return answer;
    }
}