import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DetermineIfClose {
    public boolean closeStrings(String word1, String word2) {
        // Uzunluklar farklıysa doğrudan false döndür
        if (word1.length() != word2.length()) {
            return false;
        }

        // Adım 1: Karakterlerin varlık kontrolü
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for (char c : word1.toCharArray()) {
            set1.add(c);
            freq1[c - 'a']++;
        }

        for (char c : word2.toCharArray()) {
            set2.add(c);
            freq2[c - 'a']++;
        }

        // Karakter setleri aynı değilse false döndür
        if (!set1.equals(set2)) {
            return false;
        }

        // Adım 2: Frekansları karşılaştır
        Arrays.sort(freq1);
        Arrays.sort(freq2);

        return Arrays.equals(freq1, freq2);
    }

    public static void main(String[] args) {
        DetermineIfClose d = new DetermineIfClose();

        String word1 = "abc";
        String word2 = "bca";
        System.out.println(d.closeStrings(word1, word2));

        word1 = "a";
        word2 = "aa";
        System.out.println(d.closeStrings(word1, word2));

        word1 = "cabbba";
        word2 = "abbccc";
        System.out.println(d.closeStrings(word1, word2));

        word1 = "abcd";
        word2 = "abc";
        System.out.println(d.closeStrings(word1, word2));
    }

}

