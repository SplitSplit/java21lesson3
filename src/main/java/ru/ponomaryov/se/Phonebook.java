package ru.ponomaryov.se;

import java.util.*;

public class Phonebook {
    private HashMap<String, Set<String>> contacts = new HashMap<>();;

    public Phonebook() {

    }

    public void add(String name, String number) {
        Set<String> numbers = contacts.get(name);
        if (numbers == null) {
            numbers = new HashSet<>();
            contacts.put(name, numbers);
        }
        numbers.add(number);
    }

    public Collection<String> get(String name) {
        return contacts.get(name);
    }
}
