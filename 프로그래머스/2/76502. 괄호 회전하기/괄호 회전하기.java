/*
사례 1. A, [] 이 둘이 올바른 괄호 문자열이라면, (A),[A],{A} 또는 ([]),[[]], {[]} 이 셋모두 올바른 문자열
사례 2. A,B 가 올바른 괄호 문자열이라면, AB 도 올바른 괄호문자열임. {}, ([]) 모두 올바른 괄호 문자열임으로 {}([]) 가능
구해야 하는 문제 : s가 매개변수로 지어지면 s를 왼쪽으로 x 칸 만큼 회전 시 s가 올바른 괄호 문자열이 되게 하는 x 의 갯수를 계산
주의할점 x 는 0도 포함, 최대치는 s의 길이(최대치 1000)만큼, 정답이 없을 경우 0 리턴

문제 해석하기:
옆에 붙어 있어도 되고, 포함되어도 올바른 괄호 문자열로 판별, 단 열려있으면 닫혀있어야 한다.
계속 돌려가면서 올바른 괄호 문자열인지 판별해야 한다.

이 문제는 문자열을 하나 더 이어 붙혀서 슬라이드 윈도우로 처리한다.
*/

import java.util.*;

class Solution {
    public static int answer = 0;
    
    public int solution(String s) {
        
        HashMap<Character, Character> map = new HashMap<>();
        map.put(']','[');
        map.put('}','{');
        map.put(')','(');
        
        int origin = s.length();
        s += s;
        String doubling = s + s;
        
        A:for(int i = 0; i < origin; i++){
            ArrayDeque<Character> stack = new ArrayDeque<>();
            
            for(int j = i; j < i + origin; j++) {
                char c = s.charAt(j);
                
                if(!map.containsKey(c)) stack.push(c);
                else {
                    if(stack.isEmpty() || !stack.pop().equals(map.get(c))) continue A;
                }
            }
            if(stack.isEmpty()) answer++;            
        }     
        return answer;
    }
}