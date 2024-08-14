class Solution {
    public int[] solution(long n) {
    
        // n의 길이의 크기를 가진 배열 생성
        String str = String.valueOf(n);
        int[] answer = new int[str.length()];
        
        int idx = 0;
        
        while(n>0){
            answer[idx] = Long.valueOf(n%10).intValue();
            n/=10;
            idx++;
        }

        return answer;
    }
}