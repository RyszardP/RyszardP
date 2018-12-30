package homework9;
public class User {
    private String userName;
    private String userLastName;
    private int userAge;
    private int userHeight;

    public User(String userName, String userLastName, int userAge, int userHeight) {
        this.userName = userName;
        this.userLastName = userLastName;
        this.userAge = userAge;
        this.userHeight = userHeight;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public int getUserHeight() {
        return userHeight;
    }

    public void setUserHeight(int userHeight) {
        this.userHeight = userHeight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (userAge != user.userAge) return false;
        return userHeight == user.userHeight;
    }

    @Override
    public int hashCode() {
        int result = userAge;
        result = 31 * result + userHeight;
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("userName='").append(userName).append('\'');
        sb.append(", userLastName='").append(userLastName).append('\'');
        sb.append(", userAge=").append(userAge);
        sb.append(", userHeight=").append(userHeight);
        sb.append('}');
        return sb.toString();
    }
}
