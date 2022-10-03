package CarPractice;

public class Car
{
    private String model;
    private String color;
    private int year;
    private int gearbox;

    public Car()
    {

    }

    //Getters & Setters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getGearbox() {
        return gearbox;
    }

    public void setGearbox(int gearbox) {
        this.gearbox = gearbox;
    }

    //Methods
    public void Start()
    {
        System.out.println("I'm Starting now.");
    }
    public void Stop()
    {
        System.out.println("Ok, i'm stopped, what now?");
    }
    public void Running()
    {
        System.out.println("Now i'm Running, nothing can stop me!");
    }

    public void printData(String model, String color, int year)
    {
        System.out.println(model+ "\n" + color + "\n" + year);
    }

    public void tellGear(int gearbox)
    {
        System.out.println("Im running with "+gearbox+"th gear now.");
    }
}


