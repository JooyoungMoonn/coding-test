class Solution {
    public String solution(String s) {
        String answer = "";
        int idx = 0;        // 단어별 인덱스를 세기 위한 변수
        
        for(int i = 0; i < s.length(); i++){
            
            char c = s.charAt(i);
            
            if(c == ' ') {
                answer += " ";  //  공백을 그대로 추가하고 idx는 증가시키지 않음
                idx = 0;        // 공백이 나오면 인덱스 초기화
            } else{
                if(idx % 2 == 0){       // i로 나머지 구하면 똑같이 문장을 기준으로 하게됨.. idx로 고쳐서 단어기준으로!!
                    answer += Character.toUpperCase(s.charAt(i));
                } else {
                    answer += Character.toLowerCase(s.charAt(i));
                }
                idx++;  // 공백이 아닌 문자에서만 인덱스를 증가
            }
            
            
            
            // // s.indexOf(s.charAt(i))로 하면 indexOf가 해당 문자의 첫번째 등장위치를 반환하기에 L과 O가 적용이 안됐음.
            // if(i % 2 == 0){
            //     answer += Character.toUpperCase(s.charAt(i));
            // } else{
            //     answer += Character.toLowerCase(s.charAt(i));
            // }
            
        }
        
        return answer;
    }
}