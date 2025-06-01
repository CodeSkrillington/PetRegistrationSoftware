

import java.util.ArrayList;
public class Facility 
{
    
    //Instance Variables
    private String name;
    private String address;
    private String city;
    private String state;
    private String phoneNum;
    //private Bird bird;
    //private Dog dog;
    private int sysID;
    private static int nextID = 111111;
    //private Animal animals;
    private ArrayList<Bird> birds;
    private ArrayList<Dog> dogs;
    private ArrayList<Cat> cats;

    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";

    //Constructor
    public Facility()
    {
        name = "Unknown";
        address = "Not Specified";
        phoneNum = "Not Specified";
        city = "Not Specified";
        state = "Not Specified";
        this.birds = new ArrayList<>();
        this.dogs = new ArrayList<>();
        this.cats = new ArrayList<>();
        this.sysID = nextID++;
    }

    //Overloaded Constructors
    public Facility(String name, String address, String city, String state, String phoneNum)
    {
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
        this.city = city;
        this.state = state;
        this.sysID = nextID++;
        this.birds = new ArrayList<>();
        this.dogs = new ArrayList<>();
        this.cats = new ArrayList<>();
    }

    //GETTERS
    //Get Name
    public String getName()
    {
        return name;
    }

    //Get Address
    public String getAddress()
    {
        return address;
    }

    //Get Phone Number
    public String getPhoneNum()
    {
        return phoneNum;
    }

    //Get City
    public String getCity()
    {
        return city;
    }

    //Get State
    public String getState()
    {
        return state;
    }

    //Get System ID
    public int getSysID()
    {
        return sysID;
    }

    //SETTERS
    //Set Name
    public void setName(String newName)
    {
        this.name = newName;
    }

    //Set Address
    public void setAddress(String newAddress)
    {
        this.address = newAddress;
    }

    //Set Phone Number
    public void setPhoneNum(String newPhoneNum)
    {
        this.phoneNum = newPhoneNum;
    }

    //Set City
    public void setCity(String newCity)
    {
        this.city = newCity;
    }

    //Set State
    public void setState(String newState)
    {
        this.state = newState;
    }

    //Set System ID
    public void setSysID(int newID)
    {
        this.sysID = newID;
    }

    //FACILITY METHODS
    //Add Dog to Facility
    public void addDog(Dog dog)
    {
        dogs.add(dog);
    }

    //Add Cat to Facility
    public void addCat(Cat cat)
    {
        this.cats.add(cat);
    }

    //Add Bird to Facility
    public void addBird(Bird bird)
    {
        this.birds.add(bird);
    }
    //Get a List of Dogs At Facility
    public ArrayList<Dog> getDogs()
    {
        return dogs;
    }

    //Get a List of Cats at Facility
    public ArrayList<Cat> getCats()
    {
        return cats;
    }

    //Get a List of Birds at Facility
    public ArrayList<Bird> getBirds()
    {
        return birds;
    }

    //Adopt Animal
    public void adoptAnimal(Animal animal) throws InterruptedException
    {
        if (animal instanceof Dog)
        {
            dogs.remove(animal);
            System.out.println(GREEN + "Congratulations! You have adopted "
            + animal.getName()+ "!" + RESET);
            Thread.sleep(1000);

        }
        else if (animal instanceof Cat)
        {
            cats.remove(animal);
            System.out.println(GREEN + "Congratulations! You have adopted "
            + animal.getName()+ "!" + RESET);
            Thread.sleep(1000);
        }
        else if (animal instanceof Bird)
        {
            birds.remove(animal);
            System.out.println(GREEN + "Congratulations! You have adopted "
            + animal.getName()+ "!" + RESET);
            Thread.sleep(1000);
        }
    }

    //To String Method
    @Override
    public String toString()
    {
        return RED + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" 
        + GREEN + name + " is located at " + address + ", " + city +
        ", " + state + ". The phone number is " + phoneNum + RED +
        "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" + RESET;
    }
}
