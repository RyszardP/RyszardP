package homework9;
public class UserNameException extends Exception {
    private final String nameException;

    public UserNameException(String nameException) {
        this.nameException = nameException;
    }

    public String getNameException() {
        return nameException;
    }
}
