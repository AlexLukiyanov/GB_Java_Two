import java.util.*;

public class Lesson_3_Homework {
    public static void main(String[] args) {
        String[] arrayWords = new String[]{"Java", "GeekBrains", "Java", "HomeWork", "Java", "HomeWork",
                "Laptop", "HomeWork", "Glass", "Laptop", "Mouse", "Dog", "Cat", "Laptop"};

        System.out.println("Список слов в масииве " +(Arrays.toString(arrayWords)));

        Set<String> arrayWordsUnique = new HashSet<>(Arrays.asList(arrayWords));
        System.out.println("Список уникальных слов в массиве " + (arrayWordsUnique));

        ArrayList<String> setArrayWords = new ArrayList<String>(Arrays.asList(arrayWords));

        int count = 0;

        for (int i = 0; i < setArrayWords.size();) {
            for (int j = 0; j < setArrayWords.size(); j++) {
                if (setArrayWords.get(i) == setArrayWords.get(j)) {
                    count++;
                }
            }
            System.out.println("Слово " + setArrayWords.get(i) + " Встречается " + count + " раз");
            count = 0;
            for (int k = 0; k < setArrayWords.size(); k++) {
                if (setArrayWords.get(i) == setArrayWords.get(k)) {
                    setArrayWords.remove(i);
                }
            }


            System.out.println(setArrayWords);
        }
    }
}
