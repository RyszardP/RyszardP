package homework8;
public class Tasks {
    // task l
    private static final String SPL = " ";
    private static final String VOWELS = "aeiouyAEIOUY";
    private static final String QUESTION = "?";
    private static final char SYMBOLS[] = {',', '.', ':', ';', '!', '?'};

    public static String bigLetters(String txt) {
        String s2 = "";
        String[] t1 = txt.split(" ");
        for (String text : t1) {
            String varText = text.substring(0, 1).toUpperCase();
            String allText = text.substring(1);
            s2 += varText + allText + SPL;
        }
        return " Text after replace: " + s2;
    }

    public static void CountSymbol(String txt) {
        // 2. Подсчитать количество содержащихся в данном тексте знаков препинания

        int countPuncMarks = 0;
        for (int i = 0; i < txt.length(); i++) {
            for (int j = 0; j < SYMBOLS.length; j++) {
                if (SYMBOLS[j] == txt.charAt(i))
                    countPuncMarks++;
            }


        }
        System.out.println("The number of punctuation in the text: " + countPuncMarks);
    }
//        3.  Определить сумму всех целых чисел, встречающихся в заданном тексте

    public static void numberOfSum(String txt) {
        int sum = 0;

        String num = "";

        for (int i = 0; i < txt.length(); i++) {
            if (Character.isDigit(txt.charAt(i))) {
                num = num + txt.charAt(i);
            } else {
                if (!num.equals("")) {
                    sum = sum + Integer.parseInt(num);
                    num = "";
                }
            }
        }
        System.out.println("Sum of numbers in the text: " + sum);
    }

    //        4. В каждом слове текста k-ю букву заменить заданным символом. Если  k больше длины слова, корректировку не выполнять.
    // task 4
    public static void replaceSymbol(String txt, int k, String replace) {
          StringBuilder builder = new StringBuilder();
        String newText = "";
        String[] texts = txt.split(" ");
        for (String text : texts) {
            if (text.length() > k) {
                newText = text.substring(0, k - 1) + replace + text.substring(2);
            } else {
                newText = text;
            }
            builder.append(newText + SPL);
        }
        System.out.println(builder.toString());
    }

    //        5. Удалить из текста его часть, заключенную между двумя символами, которые вводятся (например, между скобками ‘(’ и ‘)’ или между звездочками ‘*’ и т.п.).
    //task 5

    public static String deletePart(String txt, String fromChar, String toChar) {
        return txt.substring(0, txt.indexOf(fromChar)) + txt.substring((txt.lastIndexOf(toChar)) + 1);
    }


//        6.  Найти и напечатать, сколько раз повторяется в тексте каждое слово, которое встречается в нем.
//task 6
public static void wordsCount(String txt){

}

//        7. Найти, каких букв, гласных или согласных, больше в каждом предложении текста
//task 7
public static void lettersCount(String txt){
    String sentences[] = txt.toLowerCase().split("[.!?]\\s*");
    int charCount = 0;
    int vowelsCount = 0;
    for (String sentenceForChar : sentences) {
        for (char charSentence : sentenceForChar.toCharArray()) {
            if (Character.isLetter(charSentence)) {
                charCount++;
                if (VOWELS.indexOf(charSentence) != -1)
                    vowelsCount++;
            }
        }
        System.out.println(sentenceForChar);
        System.out.println("Number of vowels: " + vowelsCount);
        System.out.println("Number of consonants: " + (charCount - vowelsCount));
    }
}

//        8. Во всех вопросительных предложениях текста найти и напечатать без повторений слова заданной длины
//task 8

    public static void questionMethod(String txt, int wordLength){
        System.out.println(" Specified Length=" + wordLength);
        System.out.println();
        String stringA = txt.replaceAll("[?]", "?~");  //replace all question marks with symbol '?~' to save the question mark '?' after splitting a text.

        String sentenceArr[] = stringA.split("[!.~]");  //split the text into sentences
        String wordss[][] = new String[sentenceArr.length][];
        for (int i = 0; i < sentenceArr.length; i++) {
            if (sentenceArr[i].endsWith(QUESTION)) {
                System.out.println(sentenceArr[i]);
                wordss[i] = sentenceArr[i].toLowerCase().replaceAll("[-.?!)(,:\\d]", "").split("\\s");
                for (int j = 0; j < wordss[i].length; ++j) {
                    if (wordss[i][j].length() == wordLength)
                        System.out.println(wordss[i][j]);
                }
            }
        }
    }

}