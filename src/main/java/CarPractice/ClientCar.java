package CarPractice;

public class ClientCar
{
    public static void main(String[] args)
    {
        //instantiating and setting values
        Car Honda = new Car();
        Honda.setModel("HRV");
        Honda.setColor("Red");
        Honda.setGearbox(6);
        Honda.setYear(1992);

        Car Ford = new Car();
        Ford.setModel("F100");
        Ford.setColor("Blue");
        Ford.setGearbox(6);
        Ford.setYear(2002);

        Car Chevrolet = new Car();
        Chevrolet.setModel("Cruze");
        Chevrolet.setColor("Black");
        Chevrolet.setGearbox(6);
        Chevrolet.setYear(2022);

        //Printing data
        System.out.println("\n" +"********* Honda *********");
        Honda.printData(Honda.getModel(), Honda.getColor(), Honda.getYear());
        Honda.Start();
        Honda.Running();
        Honda.tellGear(Honda.getGearbox());
        Honda.Stop();

        System.out.println("\n"+"********* Ford *********");
        Honda.printData(Ford.getModel(), Ford.getColor(), Ford.getYear());
        Ford.Start();
        Ford.Running();
        Ford.tellGear(Ford.getGearbox());
        Ford.Stop();

        System.out.println("\n"+"********* Chevrolet *********");
        Chevrolet.printData(Chevrolet.getModel(), Chevrolet.getColor(), Chevrolet.getYear());
        Chevrolet.Start();
        Chevrolet.Running();
        Chevrolet.tellGear(Chevrolet.getGearbox());
        Chevrolet.Stop();

    }
}
