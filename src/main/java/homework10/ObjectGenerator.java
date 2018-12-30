package homework10;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ObjectGenerator {
    public ObjectGenerator() {
    }

    @Override
    public String toString() {
        return super.toString();
    }


    public static Books[] randomGenerator(String s, String randomWords, String words, String s1, int i) {
        Books[] book = new Books[Task2.numberOfBooks];
        for (int j = 0; j < Task2.numberOfBooks; i++) {
            if (j >= 0 && j < 10) {
                book[j] = new Books("a", "a", "a", "a", 55) {
                    @Override
                    public int compareTo(Books o) {
                        return 0;
                    }
                };
            } else {
                book[j] = new Books(randomWords(), randomWords(), randomWords(), randomWords(), (int) (Math.random() * 100)) {
                    @Override
                    public int compareTo(Books o) {
                        return 0;
                    }
                };
            }
        }
        return book;
    }


    static String randomWords() {
        String rndStrings = new String();
        Random random = new Random();
        char[] word = new char[random.nextInt(10) + 4];
        for (int j = 0; j < word.length; j++) {
            word[j] = (char) ('a' + random.nextInt(26));
        }
        rndStrings = new String(word);
        return rndStrings;
    }

    public static Books generator(String name, String authorName, String authorSurName, String authorFatherName, int index) {
        return new Books(name, authorName, authorSurName, authorFatherName, index) {

        };
    }

    public static Students generator(String name, String surname, int mark) {
        return new Students(name, surname, mark) {
        };
    }
}

