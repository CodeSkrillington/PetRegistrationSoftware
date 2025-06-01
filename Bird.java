/*
Jesse Singleton
5/29/2025
CS 123
 */

public class Bird extends Animal {

    //Instance Variables
    private static int tempNum = 1;
    private int cageNum;
    private String size;
    private boolean isHealthy;

    //Overloaded Constructors
    public Bird(String type, String name, String sex, int age, 
    double timeAtFacility, String breed, double weight, String color,
    String size, boolean isHealthy)
    {
        super(type, name, sex, age, timeAtFacility, breed, weight, color);
        this.size = size;
        this.isHealthy = isHealthy;
        this.cageNum = tempNum;
        tempNum++;
    }

    public Bird(String type, String name, String sex, int age, 
    double timeAtFacility, String breed, double weight, String size,
    boolean isHealthy)
    {
        super(type, name, sex, age, timeAtFacility, breed, weight);
        this.size = size;
        this.isHealthy = isHealthy;
        this.cageNum = tempNum;
        tempNum++;
    }
    
    public Bird(String type, String name, String sex, int age, 
    double timeAtFacility, String breed, String size,
    boolean isHealthy)
    {
        super(type, name, sex, age, timeAtFacility, breed);
        this.size = size;
        this.isHealthy = isHealthy;
        this.cageNum = tempNum;
        tempNum++;
    }

    public Bird(String type, String name, String sex, int age, 
    double timeAtFacility, String size, boolean isHealthy)
    {
        super(type, name, sex, age, timeAtFacility);
        this.size = size;
        this.isHealthy = isHealthy;
        this.cageNum = tempNum;
        tempNum++;
    }

    public Bird(String type, String name, String sex, int age, String size, 
    boolean isHealthy)
    {
        super(type, name, sex, age);
        this.size = size;
        this.isHealthy = isHealthy;
        this.cageNum = tempNum;
        tempNum++;
    }

    public Bird(String type, String name, String sex, String size, 
    boolean isHealthy)
    {
        super(type, name, sex);
        this.size = size;
        this.isHealthy = isHealthy;
        this.cageNum = tempNum;
        tempNum++;
    }

    public Bird(String type, String name, String size, boolean isHealthy)
    {
        super(type, name);
        this.size = size;
        this.isHealthy = isHealthy;
        this.cageNum = tempNum;
        tempNum++;
    }

    public Bird(String type, String size, boolean isHealthy)
    {
        super(type);
        this.size = size;
        this.isHealthy = isHealthy;
        this.cageNum = tempNum;
        tempNum++;
    }

    public Bird(String size, boolean isHealthy)
    {
        super();
        this.size = size;
        this.isHealthy = isHealthy;
        this.cageNum = tempNum;
        tempNum++;
    }

    //Get Size Category
    public String getSize()
    {
        return size;
    }

    //Get Health Status
    public boolean getHealth()
    {
        return isHealthy;
    }

    //Print Bird Info   
    public void printBirdInfo()
    {
        System.out.println("Bird Name: " + getName() + ", Breed: " + getBreed()
        + ", Age: " + getAge());
    }

    //Print Bird
    public void print() throws InterruptedException
    {
        super.print();
        System.out.println(CYAN + "Size: " + RESET + size);
        Thread.sleep(250);
        System.out.print(CYAN + "Health Status: " + RESET);
        if (isHealthy)
        {
            System.out.println(GREEN + "Healthy" + RESET);
        }
        else
        {
            System.out.println(RED + "Unhealthy" + RESET);
        }
        Thread.sleep(250);
        System.out.println(CYAN + "Cage Number: " + RESET + cageNum);
        Thread.sleep(250);
        System.out.println(RED + "---------------------------------------" +
        "--------" + RESET);
    }
}
