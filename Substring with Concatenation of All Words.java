import java.util.*;

class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if (s == null || words.length == 0) return result;

        int wordLen = words[0].length();
        int totalWords = words.length;
        int totalLen = wordLen * totalWords;
        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : words) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }
        for (int i = 0; i <= s.length() - totalLen; i++) {
            String sub = s.substring(i, i + totalLen);
            if (isValid(sub, wordCounts, wordLen)) {
                result.add(i);
            }
        }
        return result;
    }

    private boolean isValid(String sub, Map<String, Integer> wordCounts, int wordLen) {
        Map<String, Integer> seen = new HashMap<>();
        for (int i = 0; i < sub.length(); i += wordLen) {
            String word = sub.substring(i, i + wordLen);
            if (!wordCounts.containsKey(word)) return false;
            
            seen.put(word, seen.getOrDefault(word, 0) + 1);
            if (seen.get(word) > wordCounts.get(word)) return false;
        }
        return true;
    }
}
