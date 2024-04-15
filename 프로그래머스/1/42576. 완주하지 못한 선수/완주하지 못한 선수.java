import java.util.*;

class Solution {
    public static HashMap<String, Integer> participantMap = new HashMap<>();
    
    public void init(String[] participant) {
        for(int i = 0; i < participant.length; i++) {
            String name = participant[i];
            participantMap.put(name , participantMap.getOrDefault(name, 0) + 1);
        }
    }
    
    public String logic(String[] participant, String[] completion) {
        for(int i = 0; i < completion.length; i++) {
            String completionName = completion[i];
            participantMap.put(completionName, participantMap.get(completionName) - 1);
        }
        
        for(int i = 0; i < participant.length; i++) {
            String name =  participant[i];
            if(participantMap.get(name) > 0) {
                return name;
            }
        }
        return "";
    }

    public String solution(String[] participant, String[] completion) {
        init(participant);
        return logic(participant, completion);
    }
}