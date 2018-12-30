package homework9;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<User> users = UtilsRandom.generateCollecion(20);
        System.out.println("Users List:");
        for (int i =0 ; i < users.size(); i++){
            Validator v = new Validator(users.get(i));
            System.out.println();
            System.out.println("User");
            System.out.println(users.get(i));
                        System.out.println(v.checkUser());

        }
    }
}
