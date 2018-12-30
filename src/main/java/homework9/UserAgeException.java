package homework9;

public class UserAgeException extends Exception {
    private final String ageException;

    public UserAgeException(String ageException) {
        this.ageException = ageException;
    }

    public String getAgeException() {
        return ageException;
    }
}
