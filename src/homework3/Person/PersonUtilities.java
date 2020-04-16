package homework3.Person;

import java.util.*;

public class PersonUtilities extends Person {

    private static String[] names = {"Tigran", "Armen", "Smbat", "Ruben", "Arman", "Seryozha", "Armen",
            "Manvel", "Andranik", "Mariam", "Marianna", "Harut", "Tigran", "Stepan", "Vahe", "Smbat"};
    private static String[] workPlaces = {"QA", "Android", "Android", "Android", "Android", "iOS", "iOS",
            "Backend", "Analytics", "Dashboard", "Web", "Ops", "Shef", "Shef", "Analytics", "Android"};
    private static int[] ages = {26, 27, 27, 26, 24, 26, 27, 33, 29, 34, 30, 35, 42, 45, 44, 27};

    private static ArrayList<Person> workTogether(ArrayList<Person> employee) {
        ArrayList<Person> tempArrayList = new ArrayList<>(employee.size());
        for (int i = 0; i < employee.size(); i++) {
            if (employee.get(i).getWorkPlace().equals("Android")) {
                tempArrayList.add(employee.get(i));
            }
        }
        return tempArrayList;
    }

    private static int minAgeIndex(ArrayList<Person> employee) {
        int current = 0;
        for (int i = 0; i < employee.size(); i++) {
            if (employee.get(i).getAge() < employee.get(current).getAge()) {
                current = i;
            }
        }
        return current;
    }

    private static int maxAgeIndex(ArrayList<Person> employee) {
        int current = 0;
        for (int i = 0; i < employee.size(); i++) {
            if (employee.get(i).getAge() > employee.get(current).getAge()) {
                current = i;
            }
        }
        return current;
    }

    private static ArrayList<Person> sortByAge(ArrayList<Person> employee) {
        employee.sort(Comparator.comparing(Person::getAge));
        return employee;
    }

    private static ArrayList<Person> sortByName(ArrayList<Person> employee) {
        employee.sort(Comparator.comparing(Person::getName));
        return employee;
    }

    private static ArrayList<Person> sortByWorkPlace(ArrayList<Person> employee) {
        employee.sort(Comparator.comparing(Person::getWorkPlace));
        return employee;
    }

    private static ArrayList<Person> samePerson(ArrayList<Person> employee) {
        ArrayList<Person> tempArrayList = new ArrayList<>(employee.size());
        for (int i = 0; i < employee.size() - 1; i++) {
            if (employee.get(i).compareTo(employee.get(i + 1)) > 0) {
                tempArrayList.add(employee.get(i));
            }
        }
        return tempArrayList;
    }

    private static int mostUsedAge(int[] ages) {
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

    public static void main(String[] args) {
        ArrayList<Person> employee = new ArrayList<>(names.length);
        for (int i = 0; i < names.length; i++) {
            employee.add(new Person(names[i], workPlaces[i], ages[i]));
        }
        for (int i = 0; i < workTogether(employee).size(); i++) {
            if (i < workTogether(employee).size() - 1) {
                System.out.print(workTogether(employee).get(i).getName() + ", ");
            } else {
                System.out.println(workTogether(employee).get(i).getName() + " are working in " + workTogether(employee).get(i).getWorkPlace() + " team.");
            }
        }
        System.out.println(employee.get(minAgeIndex(employee)).getName() + " is the youngest employee in the team. His age is " + employee.get(minAgeIndex(employee)).getAge());
        System.out.println(employee.get(maxAgeIndex(employee)).getName() + " is the oldest employee in the team. His age is " + employee.get(maxAgeIndex(employee)).getAge());
        System.out.println("Sorted by names:");
        for (int i = 0; i < employee.size(); i++) {
            System.out.println(sortByName(employee).get(i).getName());
        }
        System.out.println("Sorted by ages:");
        for (int i = 0; i < employee.size(); i++) {
            System.out.println(sortByAge(employee).get(i).getName() + ": " + sortByAge(employee).get(i).getAge());
        }
        System.out.println("Sorted by work place:");
        for (int i = 0; i < employee.size(); i++) {
            System.out.println(sortByWorkPlace(employee).get(i).getName() + ": " + sortByWorkPlace(employee).get(i).getWorkPlace());
        }
        for (int i = 0; i < samePerson(employee).size(); i++) {
            System.out.println(samePerson(employee).get(i).getName() + " is duplicated");
        }
        System.out.println("Most of the employees in this office are " + mostUsedAge(ages) + " years old.");
    }
}
