class Solution {
    public int solution(int a, int b) {
    
        String plus = Integer.toString(a)+Integer.toString(b); //문자열로 변경하여 이어붙여 출력하기
        int multiply = 2*a*b;
        int resultPlus = Integer.valueOf(plus);// 다시 int형으로 변환
        if(resultPlus>multiply||resultPlus==multiply)  {
            return resultPlus;
        }else{
            return multiply;
        }
    }
}