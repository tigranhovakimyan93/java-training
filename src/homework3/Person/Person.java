package homework3.Person;

class Person implements Comparable<Person> {

    private String name;
    private String workPlace;
    private int age;

    Person() {
    }

    Person(String name, String workPlace, int age) {
        this.name = name;
        this.workPlace = workPlace;
        this.age = age;
    }

    String getName() {
        return name;
    }

    String getWorkPlace() {
        return workPlace;
    }

    int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person o) {
        int i = 0;
        if (this.getName().equals(o.getName()) && this.getWorkPlace().equals(o.getWorkPlace()) && this.getAge() == o.getAge()) {
            i = 1;
        }
        return i;
    }
}