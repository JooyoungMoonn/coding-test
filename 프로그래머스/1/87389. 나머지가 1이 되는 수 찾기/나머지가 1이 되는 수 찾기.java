class Solution {
    public int solution(int n) {                // 이것은 풀이를 본 문제....
        int answer = 0;                         // 요새 배열에 꽂혀서 배열 넣은 실수도 저지르고
                                                // 제한사항 n을 x로 착각하고.....
        for(int i = 1; i <= n; i++){            // 근데 웃긴 건 당연히 3부터 나머지가 생긴다는 걸 생각 못하고....
            if(n % i == 1){                     // 부끄럽습네다....
               answer = i;
                break;
            }
        }
        
        
        return answer;
    }
}