package homework4;

abstract class Driver extends Man {


    public Driver(String firstName, String lastName) {
        super(firstName, lastName);
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

    public void DriverInfo() {
        System.out.printf(super.getFirstName() + " " + super.getLastName() + " ");

    }


}
