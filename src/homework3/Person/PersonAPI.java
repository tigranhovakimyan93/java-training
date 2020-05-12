package homework3.Person;

import java.util.ArrayList;
import java.util.Comparator;

class PersonAPI {

    static ArrayList<Person> workTogether(ArrayList<Person> employees) {
        ArrayList<Person> tempArrayList = new ArrayList<>(employees.size());
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getWorkPlace().equals("Android")) {
                tempArrayList.add(employees.get(i));
            }
        }
        return tempArrayList;
    }

    static int minAgeIndex(ArrayList<Person> employees) {
        int current = 0;
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getAge() < employees.get(current).getAge()) {
                current = i;
            }
        }
        return current;
    }

    static int maxAgeIndex(ArrayList<Person> employees) {
        int current = 0;
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getAge() > employees.get(current).getAge()) {
                current = i;
            }
        }
        return current;
    }

    static ArrayList<Person> sortByAge(ArrayList<Person> employees) {
        employees.sort(Comparator.comparing(Person::getAge));
        return employees;
    }

    static ArrayList<Person> sortByName(ArrayList<Person> employees) {
        employees.sort(Comparator.comparing(Person::getName));
        return employees;
    }

    static ArrayList<Person> sortByWorkPlace(ArrayList<Person> employees) {
        employees.sort(Comparator.comparing(Person::getWorkPlace));
        return employees;
    }

    static ArrayList<Person> samePerson(ArrayList<Person> employees) {
        ArrayList<Person> tempArrayList = new ArrayList<>(employees.size());
        for (int i = 0; i < employees.size() - 1; i++) {
            if (employees.get(i).compareTo(employees.get(i + 1)) > 0) {
                tempArrayList.add(employees.get(i));
            }
        }
        return tempArrayList;
    }

    static int[] allAges(ArrayList<Person> employees) {
        int[] allAges = new int[employees.size()];
        for (int i = 0; i < allAges.length; i++) {
            allAges[i] = employees.get(i).getAge();
        }
        return allAges;
    }

    static int mostUsedAge(int[] ages) {
        int count = 1;
        int popular = ages[0];
        for (int i = 0; i < (ages.length - 1); i++) {
            int temp = ages[i];
            int tempCount = 0;
            for (int j = 1; j < ages.length; j++) {
                if (temp == ages[j]) {
                    tempCount++;
                }
            }
            if (tempCount > count) {
                popular = temp;
                count = tempCount;
            }
        }
        return popular;
    }
}
