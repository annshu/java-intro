package lesson2;

import javax.annotation.Generated;

public class Person {
    String name;
    String surname;
    int age;
    private static int count = 0;

    Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        // count++;
        System.out.println(++count + " class loading." + age);
    }

    public static void main(String[] args) {
        Person person1 = new Person("name1", "surname1", 20);
        Person person2 = new Person("name2", "surname2", 23);
        Person person3 = new Person("name2", "surname2", 23);
        if (person2.equals(person3)){
            System.out.println("something");
            System.out.println(person2.hashCode());
            System.out.println(person3.hashCode());
            System.out.println(person1.hashCode());
        }
        else {
            System.out.println(person1.hashCode());
        }


    }

    void DoSomething() {
        String end = "is doing something";

        System.out.println(name + " " + surname + end);
    }

    static {
        System.out.println("First class loading.");
    }

    {
        // System.out.println(count + " class loading." );

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (!name.equals(person.name)) return false;
        return surname.equals(person.surname);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + surname.hashCode();
        result = 31 * result + age;
        return result;
    }
}
