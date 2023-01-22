import java.util.*;

public class Ex6 {


    public Ex6(String wordFirst, String wordSecond) {
        comparison(wordFirst, wordSecond);
    }

    private void comparison(String wordFirst, String wordSecond) {
        Set<Character> setFirst = new HashSet<>();
        for (char ch : wordFirst.toCharArray()) {
            setFirst.add(ch);
        }
        Set<Character> setSecond = new HashSet<>();
        for (char ch : wordSecond.toCharArray()) {
            setSecond.add(ch);
        }
        System.out.println(setSecond.containsAll(setFirst));

    }

    public static void main(String[] args) {
        Ex6 ex = new Ex6("abс", "ab");
    }
}
