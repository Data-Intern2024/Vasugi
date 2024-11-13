import java.util.HashMap;

public class anagrams {

   
    static boolean areAnagrams(String str1, String str2) {
        
        if (str1.length() != str2.length()) {
            return false;
        }

        // Create a HashMap to count the occurrences of characters
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Loop through the first string and populate the HashMap
        for (char c : str1.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Loop through the second string and decrease the count
        for (char c : str2.toCharArray()) {
            // If the character is not found or the count is zero, they are not anagrams
            if (!charCountMap.containsKey(c) || charCountMap.get(c) == 0) {
                return false;
            }
            charCountMap.put(c, charCountMap.get(c) - 1);
        }

        // If all character counts are zero, then the strings are anagrams
        for (int count : charCountMap.values()) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
}
