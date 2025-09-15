package week1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorExample {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("cherry");
        words.add("date");
        words.add("apple");
        words.add("elderberry");
        words.add("fig");
        words.add("grape");

        System.out.println("Original list:");
        System.out.println(words);

        // 1) Remove all occurrences of the word "apple"
        removeWord(words, "apple");
        System.out.println("After removing \"apple\":");
        System.out.println(words);

        // 2) Remove character 'e' from every word in the list
        removeCharacterFromWords(words, 'e');
        System.out.println("After removing character 'e':");
        System.out.println(words);
    }


    public static void removeWord(List<String> list, String target) {
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            String word = iter.next();
            if (word.equals(target)) {
                iter.remove();
            }
        }
    }

    public static void removeCharacterFromWords(List<String> list, char ch) {
        ListIterator<String> listIter = list.listIterator();
        while (listIter.hasNext()) {
            String word = listIter.next();
            String newWord = removeChar(word, ch);
            // replace the current word with modified version
            listIter.set(newWord);
        }
    }


    private static String removeChar(String s, char ch) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c != ch) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}

