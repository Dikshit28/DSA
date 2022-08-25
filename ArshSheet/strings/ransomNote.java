package ArshSheet.strings;

public class ransomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            arr[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if (arr[ransomNote.charAt(i) - 'a'] < 1) {
                return false;
            }
            arr[ransomNote.charAt(i) - 'a']--;
        }
        return true;
    }

    public static void main(String[] args) {
        String ransomNote = "aa", magazine = "ab";
        System.out.println(canConstruct(ransomNote, magazine));
    }
}
