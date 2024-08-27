class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        String rtn = String.valueOf(x);
        String[] rtnArr= rtn.split("");
        
        int rtnNum = getNumberTotal(rtnArr);
        
        if(x%rtnNum!=0){
            answer=false;
        }
        
        return answer;
    }
    
    
    private int getNumberTotal(String[] rtnArr){
        
        int rtn = 0;
        
        for(String num : rtnArr){
            rtn += Integer.parseInt(num);
        }
        return rtn;
    }
    
}