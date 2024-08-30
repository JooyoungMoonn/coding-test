class Solution {
     //int의 표현 범위는 -21억~+21억이지만, x*n에서 이 범위를 벗어나므로 x를 long타입으로 변경해줘야 함.
    public long[] solution(long x, int n) {
        long[] answer = new long [n];
        
        for(int i = 0; i < n; i++){
            answer[i] = x * (i+1);
        }
        
        return answer;
    }
}