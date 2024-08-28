import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        do{
            answer += n % 10;
                
            n /= 10;
            
        }while(0 < n);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(answer);

        return answer;
    }
}