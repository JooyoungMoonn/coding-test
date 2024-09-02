class Solution {
    // answer를 long으로 반환하고 싶으면 아래 배열을 long으로 바꿔야함.
    public long[] solution(long n) {
        
        int length = Long.toString(n).length();
        long[] answer = new long[length];   // 만약 int로 반환하고 싶으면 answer 배열 형을 int로 만들어야함.
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = n % 10;
            n = n / 10;
        }
        
        return answer;
    }
}