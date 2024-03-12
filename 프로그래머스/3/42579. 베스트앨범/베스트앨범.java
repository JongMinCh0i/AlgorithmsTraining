/*
    1. 총 재생 횟수를 기준으로 장르를 내림차순으로 정렬
    2. 각 장르별 2곡씩 선정해서 플레이리스트 만들기
*/

// 기존에 ArrayList<Integer>로 하려고 시도 했지만 그럴 경우 해당 배열의 index(고유 번호)를 잡을 수가 없음으로 int[] 을 통해 idx, value를 추가함


import java.io.*;
import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        
        // 1. 장르별 {장르, 총 재생수} Map을 만든다.
        // 2. 곡의 정보는? 어디에 담을 것인지
        Map<String, List<int []>> genresAndPlays = new HashMap<>();
        Map<String, Integer> playMap = new HashMap<>();
    
        for(int i = 0; i < genres.length; i++) {
            String genre = genres[i];
            int playCount = plays[i];
            
            genresAndPlays.putIfAbsent(genre, new ArrayList<>());            
            genresAndPlays.get(genre).add(new int[]{i, playCount}); 
            playMap.put(genre, playMap.getOrDefault(genre, 0) + playCount);
        }
                
        // 정렬 1차 : 총 재생 횟수를 기준으로 장르를 내림차순으로 정렬 
        Stream<Map.Entry<String, Integer>> sortedGenre = playMap.entrySet().stream()
            .sorted((o1, o2) -> Integer.compare(o2.getValue(), o1.getValue())); 
        
        ArrayList<Integer> answer = new ArrayList<>();
        
        sortedGenre.forEach(entry -> {
            Stream<int[]> sortedSongs = genresAndPlays.get(entry.getKey()).stream()
                .sorted((song1, song2) -> Integer.compare(song2[1], song1[1]))
                .limit(2);
            
            sortedSongs.forEach(song -> answer.add(song[0]));
        });
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
