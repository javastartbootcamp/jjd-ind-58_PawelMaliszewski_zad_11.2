package pl.javastart.task;

import java.util.Objects;

public class Person {

    private static final int MINIMUM_AGE = 1;
    private static final int MINIMUM_LETTERS = 2;
    private String firstName;
    private String lastName;
    private int age;
    private String pesel;

    public Person(String firstName, String lastName, int age, String pesel) {
        throwExceptionIfNameIsNotCorrect(firstName);
        throwExceptionIfNameIsNotCorrect(lastName);
        throwExceptionIfAgeIsNotCorrect(age);
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pesel = pesel;
    }

    private void throwExceptionIfNameIsNotCorrect(String name) {
        if (name == null) {
            throw new NameUndefinedException("Pole nie może być NULL");
        } else if (name.length() <= MINIMUM_LETTERS) {
            throw new NameUndefinedException("Imię lub Nazwisko za krótkie");
        }
    }

    private void throwExceptionIfAgeIsNotCorrect(int age) {
        if (age < MINIMUM_AGE) {
            throw new IncorrectAgeException("Wiek nieprawidłowy");
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        throwExceptionIfNameIsNotCorrect(firstName);
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        throwExceptionIfNameIsNotCorrect(lastName);
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        throwExceptionIfAgeIsNotCorrect(age);
        this.age = age;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Person person = (Person) o;
        return age == person.age && Objects.equals(firstName, person.firstName)
                && Objects.equals(lastName, person.lastName)
                && Objects.equals(pesel, person.pesel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, pesel);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", pesel='" + pesel + '\'' +
                '}';
    }
}

