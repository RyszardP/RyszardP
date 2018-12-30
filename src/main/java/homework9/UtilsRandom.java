package homework9;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UtilsRandom {
    static Random UserRandom = new Random();

    public static List<User> generateCollecion (int countOfUsers){
        List<User> collectionOfUsers = new ArrayList<>(countOfUsers);

        String [] namesArray = {"Yun","Pak","Vova","Petr","O","Gennadiy","Boris","Fima","Ahmad","Masud","Matiliudavsiavicianiauskadamas"};
        String [] lastNamesArray = {"Petro","Ivanov","Cerazaborimostnoguzaderisenko","Medved","Putin","Pushkin","U","Vasiljev"};

        for (int i = 0 ; i < countOfUsers; i++){
            collectionOfUsers.add(new User(namesArray[UserRandom.nextInt(namesArray.length)],lastNamesArray[UserRandom.nextInt(lastNamesArray.length)],UserRandom.nextInt(120),UserRandom.nextInt(221)));
        }

        return collectionOfUsers;
    }
    public static int randNumber (int min,int max) {return  UserRandom.nextInt((max - min)+1)+min;}
}
