package homework3.Person;

import java.util.ArrayList;

public class EmployeesProvider {

    private static ArrayList<Person> employees;

    static ArrayList<Person> getData() {

        if (employees != null) {
            return employees;
        }

        String[] names = {"Tigran", "Armen", "Smbat", "Ruben", "Arman", "Seryozha", "Armen",
                "Manvel", "Andranik", "Mariam", "Marianna", "Harut", "Tigran", "Stepan", "Vahe", "Smbat"};
        String[] workPlaces = {"QA", "Android", "Android", "Android", "Android", "iOS", "iOS",
                "Backend", "Analytics", "Dashboard", "Web", "Ops", "Shef", "Shef", "Analytics", "Android"};
        int[] ages = {26, 27, 27, 26, 24, 26, 27, 33, 29, 34, 30, 35, 42, 45, 44, 27};

        employees = new ArrayList<>();

        for (int i = 0; i < names.length; i++) {
            employees.add(new Person(names[i], workPlaces[i], ages[i]));
        }
        return employees;
    }
}