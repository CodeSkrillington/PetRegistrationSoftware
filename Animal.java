/*
Jesse Singleton
5/29/2025
CS 123
 */


public class Animal
{

    private String type;
    private String name;
    private String sex;
    private int age;
    private double timeAtFacility;
    private String breed;
    private double weight;
    private String color;
    private int petID;
    private static int nextPetID = 0001;
    
    //Colors for console output
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";

    //Default constructor
    public Animal()
    {
        type = "Unspecified";
        name = "Unspecified";
        sex = "Unspecified";
        age = -1;
        timeAtFacility = -1.0;
        breed = "Unspecified";
        weight = -1.0;
        color = "Unspecified";
        petID = nextPetID++;
    }

    //Overloaded Constructors
    public Animal(String type, String name, String sex,
    int age, double timeAtFacility, String breed, double weight, String color)
    {
        this.type = type;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.timeAtFacility = timeAtFacility;
        this.breed = breed;
        this.weight = weight;
        this.color = color;
        this.petID = nextPetID++;
    }

    public Animal(String type, String name, String sex,
    int age, double timeAtFacility, String breed, double weight)
    {
        this.type = type;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.timeAtFacility = timeAtFacility;
        this.breed = breed;
        this.weight = weight;
        this.color = "Unspecified";
        this.petID = nextPetID++;
    }

    public Animal(String type, String name, String sex,
    int age, double timeAtFacility, String breed)
    {
        this.type = type;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.timeAtFacility = timeAtFacility;
        this.breed = breed;
        this.weight = 0.0;
        this.color = "Unspecified";
        this.petID = nextPetID++;
    }

    public Animal(String type, String name, String sex,
    int age, double timeAtFacility)
    {
        this.type = type;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.timeAtFacility = timeAtFacility;
        this.breed = "Unspecified";
        this.weight = 0.0;
        this.color = "Unspecified";
        this.petID = nextPetID++;
    }

    public Animal(String type, String name, String sex,
    int age)
    {
        this.type = type;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.timeAtFacility = -1.0;
        this.breed = "Unspecified";
        this.weight = 0.0;
        this.color = "Unspecified";
        this.petID = nextPetID++;
    }

    public Animal(String type, String name, String sex)
    {
        this.type = type;
        this.name = name;
        this.sex = sex;
        this.age = -1;
        this.timeAtFacility = -1.0;
        this.breed = "Unspecified";
        this.weight = 0.0;
        this.color = "Unspecified";
        this.petID = nextPetID++;
    }

    public Animal(String type, String name)
    {
        this.type = type;
        this.name = name;
        this.sex = "Unspecified";
        this.age = -1;
        this.timeAtFacility = -1.0;
        this.breed = "Unspecified";
        this.weight = 0.0;
        this.color = "Unspecified";
        this.petID = nextPetID++;
    }

    public Animal(String type)
    {
        this.type = type;
        this.name = "Unspecified";
        this.sex = "Unspecified";
        this.age = -1;
        this.timeAtFacility = -1.0;
        this.breed = "Unspecified";
        this.weight = 0.0;
        this.color = "Unspecified";
        this.petID = nextPetID++;
    }

    //Get Name
    public String getName()
    {
        return name;
    }

    //Get Age
    public int getAge()
    {
        return age;
    }

    //Get Breed
    public String getBreed()
    {
        return breed;
    }

    //Get Type
    public String getType()
    {
        return type;
    }

    //Get Time at Facility
    public double getTimeAtFacility()
    {
        return timeAtFacility;
    }

    //Get Sex
    public String getSex()
    {
        return sex;
    }

    //Get Color
    public String getColor()
    {
        return color;
    }

    //Get Weight
    public double getWeight()
    {
        return weight;
    }

    //Print Animal Information Method
    public void print() throws InterruptedException
    {
        System.out.println(RED + "---------------------------------------" +
        "--------" + RESET);
        Thread.sleep(250);
        System.out.println(CYAN  + "Type: " +RESET + type);
        Thread.sleep(250);
        System.out.println(CYAN + "Name: " + RESET + name);
        Thread.sleep(250);
        System.out.println(CYAN + "Sex: " + RESET + sex);
        Thread.sleep(250);
        System.out.println(CYAN + "Age: " + RESET + age);
        Thread.sleep(250);
        System.out.println(CYAN + "Time at facility: " + RESET 
        + timeAtFacility + " days");
        Thread.sleep(250);
        System.out.println(CYAN + "Breed: " + RESET + breed);
        Thread.sleep(250);
        System.out.println(CYAN + "Weight: " + RESET + weight + "lbs");
        Thread.sleep(250);
        System.out.println(CYAN + "Color: " + RESET + color);
        Thread.sleep(250);
        System.out.println(CYAN + "Pet Identification Number: " + RESET +
        petID);
        Thread.sleep(250);
        
    }
}
