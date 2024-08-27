class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        double total = 0;
        for(int i = 0; i < arr.length; i++){        // arr.length는 길이여서 0번째는 1이다.
             total += arr[i];                       // 그리고 for문은 사이에 , 가 아니라 ;이다.. 다시 공부해...
        }
        answer = total / arr.length;
        
        return answer;
    }
}