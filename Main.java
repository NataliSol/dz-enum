import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        //task 1
        enum CardRank {
            ACE(1),
            TWO(2),
            THREE(3),
            FOUR(4),
            FIVE(5),
            SIX(6),
            SEVEN(7),
            EIGHT(8),
            NINE(9),
            TEN(10),
            JACK(11),
            QUEEN(12),
            KING(13);

            private final int digit;

            CardRank(int digit) {
                this.digit = digit;
            }
            public int getDigit(){
                return digit;
            }
        }
        CardRank cardRank=CardRank.EIGHT;
        System.out.println(cardRank.getDigit());


        //task 2
        String sentence = "I would like to have a dog";
        HashMap<String, Integer> word = new HashMap<>();
        word.put("a", 0);
        word.put("e", 0);
        word.put("i", 0);
        word.put("o", 0);
        word.put("u", 0);
        char[] chars = sentence.toCharArray();
        for (int j = 0; j < chars.length; j++) {
            switch (chars[j]) {
                case 97:
                    word.put("a", word.get("a") + 1);
                    break;
                case 101:
                    word.put("e", word.get("e") + 1);
                    break;
                case 105:
                    word.put("i", word.get("i") + 1);
                    break;
                case 111:
                    word.put("o", word.get("o") + 1);
                    break;
                case 117:
                    word.put("u", word.get("u") + 1);
                    break;
            }
        }
        System.out.println(" a: " + word.get("a") + " e: " + word.get("e") + " i: " + word.get("i") + " 0: " +
                word.get("o") + " u: " + word.get("u"));
        //Розділіть рядок на масив слів за допомогою пробілу як роздільника.
        String[] array = sentence.split(" ");
        System.out.println(array[2].length());
        // Витягніть перший символ першого слова та виведіть їх на консоль.
        char[] charsOfWord = array[1].toCharArray();
        for (int i = 0; i < 1; i++) {
            System.out.println(charsOfWord[i]);
        }
        //Замініть всі входження слова "dog" на "cat" у рядку.
        String value = "I would like to have a dog".replace("dog", "cat");
        System.out.println(value);

        //task 3
        StringBuilder stringBuilder = new StringBuilder("I");
        stringBuilder.append(" would");
        stringBuilder.append(" like");
        stringBuilder.append(" to");
        stringBuilder.append(" have");
        stringBuilder.append(" a");
        stringBuilder.append(" dog");
        System.out.println(stringBuilder.toString().toUpperCase());
    }
}
