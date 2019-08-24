package tutoring_abstraction;

public class Vehicle2 extends Vehicle
{
    public Vehicle2(){}

    public Vehicle2(String makeVehicle, String modelVehicle, int yearVehicle)
    {
        this.makeVehicle = makeVehicle;
        this.modelVehicle =modelVehicle;
        this.yearVehicle = yearVehicle;

        String make = "Make: ";
        String model = "Model: ";
        String year = "Year: ";

        System.out.println(make+makeVehicle);
        System.out.println(model+modelVehicle);
        System.out.println(year+yearVehicle);

    }

    @Override
    public void engine(String size)
    {
        String msg = "This car comes with a "+size+" engine";
        System.out.println(msg);
    }

    @Override
    public void transmission(String type)
    {
        String msgA = "You've selected AUTOMATIC drive mode NOW!";
        String msgB = "You've selected MANUAL drive mode NOW!";
        String msgC = "Sorry! This is an invalid request, please try again!";

        if (type.equalsIgnoreCase("automatic"))
        {
            System.out.println(msgA);

        }else if (type.equalsIgnoreCase("manual"))
        {
            System.out.println(msgB);
        }else
        {
            System.out.println(msgC);
        }

    }

    @Override
    public String soundSystem(String brand, String type) {
        return null;
    }
}
