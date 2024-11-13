public class recursive_anagram {

    static boolean areAnagrams(String str1, String str2) {
            // Base case: If both strings are empty, they are anagrams
            if (str1.isEmpty() && str2.isEmpty()) {
                return true;
            }
    
            // If the lengths of the strings are not equal, they cannot be anagrams
            if (str1.length() != str2.length()) {
                return false;
            }
    
            // Take the first character of str1
            char firstChar = str1.charAt(0);
    
            // Find the position of this character in str2
            int indexInStr2 = str2.indexOf(firstChar);
    
            // If the character is not found, they are not anagrams
            if (indexInStr2 == -1) {
                return false;
            }
    
            // Remove the character from both strings and recurse
            String newStr1 = str1.substring(1);
            String newStr2 = str2.substring(0, indexInStr2) + str2.substring(indexInStr2 + 1);
    
            // Recursively check the rest of the strings
            return areAnagrams(newStr1, newStr2);
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

