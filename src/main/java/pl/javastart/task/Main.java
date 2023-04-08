package pl.javastart.task;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        try {
            Person person = new Person("Jan", "Kowalski", 12, "654644546");
            System.out.println(person);
            person.setAge(0);
            person.setFirstName(null);
            System.out.println(person);
        } catch (IncorrectAgeException | NameUndefinedException e) {
            System.err.println(e.getMessage());
        } finally {
            Thread.sleep(30);
            System.out.println("Koniec programu");
        }

    }
}
