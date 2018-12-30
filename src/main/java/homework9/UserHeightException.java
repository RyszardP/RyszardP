package homework9;
public class UserHeightException extends Exception {
    public final String heightException;

    public UserHeightException(String heightException) {
        this.heightException = heightException;
    }

    public String getHeightException() {
        return heightException;
    }
}
