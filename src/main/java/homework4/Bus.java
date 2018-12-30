package homework4;
import java.util.*;

class Bus extends Driver {

    int number; // Bus Number
    String model; // Bus model
    int year; // year
    int run; //  run
    int route; // Bus route




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bus bus = (Bus) o;
        return number == bus.number &&
                year == bus.year &&
                run == bus.run &&
                route == bus.route &&
                Objects.equals(model, bus.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), number, model, year, run, route);
    }

    public Bus(String firstName, String lastName, int number, String model, int year, int run, int route) {
        super(firstName, lastName);
        this.number = number;
        this.model = model;
        this.year = year;
        this.run = run;
        this.route = route;
    }

    @Override
    public void MethodHead() {
        super.MethodHead();
    }

    @Override
    public void MethodTwoArms() {
        super.MethodTwoArms();
    }

    @Override
    public void MethodTwoLegs() {
        super.MethodTwoLegs();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void DriverInfo() {
        super.DriverInfo();
    }


    public static void main(String[] args) {

        Bus[] B = new Bus[6];
        B[0] = new Bus("Иван", "Иванов", 4568, "МАЗ 105", 2012, 300000, 291);
        B[1] = new Bus("Петр", "Гаврилос", 5687, "МАЗ 107", 2010, 250000, 291);
        B[2] = new Bus("Данил", "Козловский", 3241, "МАЗ 107", 2012, 260000, 15);
        B[3] = new Bus("Болеслав", "Веремейчик", 4555, "МАЗ 105", 2011, 270000, 15);
        B[4] = new Bus("Давид", "Гоцман", 4251, "МАЗ 105", 2013, 240000, 7);
        B[5] = new Bus("Азоев", "Аслан", 6581, "МАЗ 107", 2018, 450, 7);




        /*System.out.println("Имя и фамилия водителей");
        for (int i = 0; i < B.length; i++) {
            B[i].DriverInfo();
            System.out.println();
        }*/

       /* System.out.println("Список автопарка :");
        for (int i = 0; i < B.length; i++) {
            B[i].list();
            System.out.println();
        }*/


       /* Bus.sortByDriver(B);
        System.out.println("список водителей, отсортированный по фамилии водителей: ");
        for (int i = 0; i < B.length; i++) {
            B[i].list1();
            System.out.println();
        }*/

        /*Bus.sortByroute(B);
        System.out.println("список автобусов, отсортированный по номеру маршрута: ");
        for (int i = 0; i < B.length; i++) {
            System.out.println();
            B[i].DriverInfo();
            B[i].list2();
            System.out.println();
        }*/

            Comparator<Bus>BusComparator = new comparator();
            List<Bus> Buses = new LinkedList<Bus>();


            Buses.sort(BusComparator);
            Buses.forEach(System.out::println);

    }


    public int getRoute() {
        return route;
    }

    public void setRoute(int route) {
        this.route = route;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }


    public static void sortByNumber(Bus[] arr) {
        Arrays.sort(arr, Comparator.comparing(Bus::getNumber));
    }

    // список автопарка
    public void list() {
        System.out.println("Имя: " + getFirstName() + "; Фамлилия: " + getLastName() + "; Номер автобуса: " + getNumber() +
                "; марка: " + getModel() + "; год: " + getYear() + "; пробег: " + getRoute() + "; маршрут: " + getRoute());
    }




    // сортировка по Фамилии
    public static void sortByDriver(Bus[] arr) {
        Arrays.sort(arr, Comparator.comparing(Bus::getLastName));
    }

    public void list1() {
        System.out.println("Фамлилия " + getLastName());
    }

    // сортировка по маршруту
    public static void sortByroute(Bus[] arr) {
        Arrays.sort(arr, Comparator.comparing(Bus::getRoute));
    }

    public void list2() {
        System.out.println("Маршрут - " + getRoute() + "; номер автобуса - " + getNumber());

    }

}




