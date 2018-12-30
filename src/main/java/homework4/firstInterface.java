package homework4;
public interface firstInterface {
    public static final Integer HEAD = 1;
    public static final Integer LEGS = 2;
    public static final Integer ARMS = 2;

    default void MethodHead() {
        System.out.println(" Head ");
    }
    default void MethodTwoArms() {
        System.out.println(" Two Arms ");
    }
    default void MethodTwoLegs() {
        System.out.println(" Two Legs ");
    }
}
