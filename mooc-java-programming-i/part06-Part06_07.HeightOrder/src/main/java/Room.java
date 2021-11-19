import java.util.ArrayList;

public class Room {

    ArrayList<Person> people;

    public Room() {
        this.people = new ArrayList<>();
    }

    public void add(Person person) {
        this.people.add(person);
    }

    public boolean isEmpty() {
        return people.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return this.people;
    }

    public Person shortest() {
        if (people.isEmpty()) {
            return null;
        }

        Person shortestPerson = this.people.get(0);

        for (Person person : this.people) {

            if (person.getHeight() < shortestPerson.getHeight()) {
                shortestPerson = person;
            }
        }
        return shortestPerson;
    }

    public Person take() {
        if (people.isEmpty()) {
            return null;
        }

        Person shortestPerson = shortest();

        people.remove(shortestPerson);

        return shortestPerson;
    }
}
