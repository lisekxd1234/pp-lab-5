package company.beans;

import company.exceptions.InvalidAgeException;

public class Person {
    // prywatne pola name (String) oraz age (int)
    private String name;
    private int age;

    // konstruktor przyjmujący name i age, rzucający wyjątek InvalidAgeException
    public Person(String name, int age) throws InvalidAgeException {
        if (age < 0 || age > 125) { // sprawdź czy wiek mieści się w zakresie od 0 do 125
            throw new InvalidAgeException("Invalid age!"); // rzuć wyjątek w przypadku niewłaściwego wieku
        }
        this.name = name;
        this.age = age;
    }

    // gettery i settery dla name i age
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 125) {
            throw new InvalidAgeException("Invalid age!");
        }
        this.age = age;
    }
}
