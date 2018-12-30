package homework1;
public class Task18 {
    public static void main(String[] args) {

//         * 18 Write a method that translates rubles into dollars at a given rate. As arguments, specify the number of
//        rubles and the course.
        System.out.println();
        System.out.println("18 задание");
        double BYN = 400;
        double kursNBRB = 2.1590;
        double USD = BYN/kursNBRB;
        System.out.println(BYN + " Рублей - это");
        System.out.println(USD + " долларов по курсу " + kursNBRB);
    }
}
