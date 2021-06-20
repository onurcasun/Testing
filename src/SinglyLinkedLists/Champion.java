package SinglyLinkedLists;

import java.util.Objects;

public class Champion {
    
    private String firstName;
    private String lastName;
    private int id;


    public Champion(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }


    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "{" +
            " firstName='" + getFirstName() + "'" +
            ", lastName='" + getLastName() + "'" +
            ", id='" + getId() + "'" +
            "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Champion)) {
            return false;
        }
        Champion employee = (Champion) o;
        return Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, id);
    }
}
