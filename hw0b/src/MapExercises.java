import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExercises {
    /**
     * Returns a map from every lower case letter to the number corresponding to
     * that letter, where 'a' is
     * 1, 'b' is 2, 'c' is 3, ..., 'z' is 26.
     */
    public static Map<Character, Integer> letterToNum() {
        // creat key value pairs for each letter in the alphabet
        Map<Character, Integer> letterMap = new HashMap<>();
        for (char c = 'a'; c <= 'z'; c++) {
            letterMap.put(c, c - 'a' + 1);
        }
        return letterMap;
    }

    /**
     * Returns a map from the integers in the list to their squares. For example, if
     * the input list
     * is [1, 3, 6, 7], the returned map goes from 1 to 1, 3 to 9, 6 to 36, and 7 to
     * 49.
     */
    public static Map<Integer, Integer> squares(List<Integer> nums) {
        Map<Integer, Integer> squaresMap = new HashMap<>();
        for (int num : nums) {
            squaresMap.put(num, num * num);
        }
        return squaresMap;
    }

    /** Returns a map of the counts of all words that appear in a list of words. */
    public static Map<String, Integer> countWords(List<String> words) {
        Map<String, Integer> countWordsMap = new HashMap<>();
        for (String word : words) {
            countWordsMap.put(word, countWordsMap.getOrDefault(word, 0) + 1);
        }
        return countWordsMap;
    }
}
