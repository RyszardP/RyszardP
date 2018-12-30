package homework9;
public class UserLastNameException extends Exception {
    private final String lastNameException;

    public UserLastNameException(String lastNameException) {
        this.lastNameException = lastNameException;
    }

    public String getLastNameException() {
        return lastNameException;
    }
}
