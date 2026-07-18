package day02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Number49 {
    public List<List<String>> groupAnagrams(String[] strs){
        Map<String, List<String>> groups = new HashMap<>();
        for (String word : strs){
            int[] frequency = new int[26];
            for (int i = 0; i < word.length(); i++){
                frequency[word.charAt(i) - 'a']++;
            }

            StringBuilder signature = new StringBuilder();
            for (int count : frequency){
                signature.append("#").append(count);
            }
            groups.computeIfAbsent(signature.toString(), k -> new ArrayList<>())
                    .add(word);
        }
        return new ArrayList<>(groups.values());
    }
}
