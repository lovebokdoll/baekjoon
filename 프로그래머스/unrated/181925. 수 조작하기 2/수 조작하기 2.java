class Solution {
    public String solution(int[] numLog) {
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<numLog.length;i++){
            int input = numLog[i]-numLog[i-1];
            if(input==1){sb.append("w");}
            else if(input==-1){sb.append("s");}
            else if(input==10){sb.append("d");}
            else if(input==-10){sb.append("a");}
        }
        String restult = sb.toString();
        return restult;
    }
}