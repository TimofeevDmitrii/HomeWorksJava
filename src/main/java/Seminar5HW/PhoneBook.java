package Seminar5HW;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {

    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    public void add(String name, Integer phoneNum) {
        ArrayList<Integer> pNumber = new ArrayList<>();
        if (phoneBook.containsKey(name))
           pNumber = phoneBook.get(name);
        pNumber.add(phoneNum);
        phoneBook.put(name, pNumber);


//        Другой вариант решения
//        if (phoneBook.containsKey(name))
//            phoneBook.get(name).add(phoneNum);
//        else{
//            ArrayList<Integer> pNumber = new ArrayList<>();
//            pNumber.add(phoneNum);
//            phoneBook.put(name, pNumber);
//        }
    }

    public ArrayList<Integer> find(String name) {
        ArrayList<Integer> resultList = new ArrayList<>();
        if (phoneBook.containsKey(name))
            resultList=phoneBook.get(name);
        return resultList;
    }

    public static HashMap<String, ArrayList<Integer>> getPhoneBook() {
        return phoneBook;
    }
}
