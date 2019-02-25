package ru.ponomaryov.se;

import java.util.*;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        String[] words = {"Рим", "Милан", "Неаполь", "Турин", "Палермо", "Милан", "Болонья", "Флоренция", "Милан", "Катания", "Венеция", "Верона", "Турин", "Падуя", "Триест", "Таранто", "Брешиа", "Падуя", "Парма", "Модена"};

        analizeWords(words);
        System.out.println();
        phonebookTest();
    }

    private static void analizeWords(String[] words)
    {
        Set<String> uWords = new HashSet<>();
        Map<String, Integer> wMap = new HashMap<>();
        List<String> wArray = new ArrayList<>();

        Integer wordCount;
        for (String s : words) {
            wordCount = wMap.get(s);
            if (wordCount == null) {
                wordCount = 1;
            } else {
                wordCount++;
            }
            wMap.put(s, wordCount);
            uWords.add(s);
            wArray.add(s);
        }

        int i = 0;
        int totalCount = 0;
        for (String o : uWords) {
            i++;
            System.out.println("[№" + i + "] " + o + " (" + wMap.get(o) + ")");
            totalCount += wMap.get(o);
        }
        System.out.println("Total words: " + totalCount);
    }

    private static void phonebookTest()
    {
        Phonebook phonebook = new Phonebook();
        phonebook.add("Petrov", "85999084567");
        phonebook.add("Ivanov", "88083507865");
        phonebook.add("Sidorov", "88006547895");
        phonebook.add("Petrov", "89085087167");
        System.out.println(phonebook.get("Petrov"));
    }
}

