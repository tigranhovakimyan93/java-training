package homework3.Person;

import java.text.ParseException;
import java.util.*;

public class Main extends Person {


    public static void main(String[] args) {
        ArrayList<Person> employees = EmployeesProvider.getData();
        for (int i = 0; i < PersonAPI.workTogether(employees).size(); i++) {
            if (i < PersonAPI.workTogether(employees).size() - 1) {
                System.out.print(PersonAPI.workTogether(employees).get(i).getName() + ", ");
            } else {
                System.out.println(PersonAPI.workTogether(employees).get(i).getName() + " are working in " + PersonAPI.workTogether(employees).get(i).getWorkPlace() + " team.");
            }
        }
        System.out.println(employees.get(PersonAPI.minAgeIndex(employees)).getName() + " is the youngest employees in the team. His age is " + employees.get(PersonAPI.minAgeIndex(employees)).getAge());
        System.out.println(employees.get(PersonAPI.maxAgeIndex(employees)).getName() + " is the oldest employees in the team. His age is " + employees.get(PersonAPI.maxAgeIndex(employees)).getAge());
        System.out.println("Sorted by names:");
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(PersonAPI.sortByName(employees).get(i).getName());
        }
        System.out.println("Sorted by ages:");
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(PersonAPI.sortByAge(employees).get(i).getName() + ": " + PersonAPI.sortByAge(employees).get(i).getAge());
        }
        System.out.println("Sorted by work place:");
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(PersonAPI.sortByWorkPlace(employees).get(i).getName() + ": " + PersonAPI.sortByWorkPlace(employees).get(i).getWorkPlace());
        }
        for (int i = 0; i < PersonAPI.samePerson(employees).size(); i++) {
            System.out.println(PersonAPI.samePerson(employees).get(i).getName() + " is duplicated");
        }
        System.out.println("Most of the employees in this office are " + PersonAPI.mostUsedAge(PersonAPI.allAges(employees)) + " years old.");
    }
}
