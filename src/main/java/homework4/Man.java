package homework4;
import java.util.Objects;

public class Man implements firstInterface{
    private String firstName;
    private String lastName;
    public Man (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}

    public String getContact() {
        return firstName + " " + lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Man man = (Man) o;
        return Objects.equals(firstName, man.firstName) &&
                Objects.equals(lastName, man.lastName);
    }

    @Override
    public void MethodHead() {

    }

    @Override
    public void MethodTwoArms() {

    }

    @Override
    public void MethodTwoLegs() {

    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    @Override
    public String toString() {
        return "Man{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



}
