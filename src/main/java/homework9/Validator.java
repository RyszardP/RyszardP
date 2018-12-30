package homework9;

public class Validator<T extends User> {

    private T newUser;
    private int minAge = 18;
    private int minHeight = 200;


    private boolean correctName;
    private boolean correctLastName;
    private boolean correctAge;
    private boolean correctHeight;
    private boolean isUserInfoTrue;

    public Validator(T newUser) {
        this.newUser = newUser;
    }

    private void checkAge() throws UserAgeException {
        if (newUser.getUserAge() < minAge) {
            throw new UserAgeException("Age error: low age");
        }
    }

    private void checkHeight () throws UserHeightException {
        if (newUser.getUserHeight() < minHeight){
            throw new UserHeightException("Height erorr : low height");
        }
    }

    public boolean checkUser() {

        if (!isUserInfoTrue) {

            try {
                checkHeight();
                System.out.println( "OK Height");
            } catch (UserHeightException e){
                System.out.println("Height is low");
            }

            try {
                checkAge();
                System.out.println("Age OK");
            } catch (UserAgeException e) {
                 System.out.println("age is low");
            }
        }
        isUserInfoTrue = true;

        return correctAge;
    }


    public String userInfo() {
        if (correctAge) checkUser();


        StringBuilder sb = new StringBuilder("Validator{");
        sb.append("correctAge=").append(correctAge ? "OK" : "False");

        sb.append('}');
        return sb.toString();
    }

    @Override
    public String toString() {
        return newUser.toString();

    }
}


