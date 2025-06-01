

public class Cat extends Animal {

    //Instance Variables
    private static int tempNum = 26;
    private int kennelNum;
    private boolean isFeral;
    private boolean isFixed;
    private boolean isMicrochipped;
    private int chipNum;

    //Overloaded Constructors
    public Cat(String type, String name, String sex, int age, 
    double timeAtFacility, String breed, boolean isFeral, boolean isFixed, 
    double weight, boolean isMicrochipped, int chipNum, String color)
    {
        super(type, name, sex, age, timeAtFacility, breed, weight, color);
        this.kennelNum = tempNum;
        tempNum++;
        this.isFeral = isFeral;
        this.isFixed = isFixed;
        this.isMicrochipped = isMicrochipped;
        if (!isMicrochipped)
        {
            chipNum = 0;
        }
        else
        {
            this.chipNum = chipNum;
        }
    }

    public Cat(String type, String name, String sex, int age, 
    double timeAtFacility, String breed, boolean isFeral, boolean isFixed, 
    double weight, boolean isMicrochipped, String color)
    {
        super(type, name, sex, age, timeAtFacility, breed, weight, color);
        this.kennelNum = tempNum;
        tempNum++;
        this.isFeral = isFeral;
        this.isFixed = isFixed;
        this.isMicrochipped = isMicrochipped;
        if (!isMicrochipped)
        {
            chipNum = 0;
        }
    }

    public Cat(String type, String name, String sex, int age, 
    double timeAtFacility, String breed, boolean isFeral, boolean isFixed, 
    double weight, boolean isMicrochipped, int chipNum)
    {
        super(type, name, sex, age, timeAtFacility, breed, weight);
        this.kennelNum = tempNum;
        tempNum++;
        this.isFeral = isFeral;
        this.isFixed = isFixed;
        this.isMicrochipped = isMicrochipped;
        if (!isMicrochipped)
        {
            chipNum = 0;
        }
        else
        {
            this.chipNum = chipNum;
        }
    }

    public Cat(String type, String name, String sex, int age, 
    double timeAtFacility, String breed, boolean isFeral, boolean isFixed, 
    double weight, boolean isMicrochipped)
    {
        super(type, name, sex, age, timeAtFacility, breed, weight);
        this.kennelNum = tempNum;
        tempNum++;
        this.isFeral = isFeral;
        this.isFixed = isFixed;
        this.isMicrochipped = isMicrochipped;
        if (!isMicrochipped)
        {
            chipNum = 0;
        }
    }

    public Cat(String type, String name, String sex, int age, 
    double timeAtFacility, String breed, boolean isFeral, boolean isFixed,
    boolean isMicrochipped, int chipNum)
    {
        super(type, name, sex, age, timeAtFacility, breed);
        this.kennelNum = tempNum;
        tempNum++;
        this.isFeral = isFeral;
        this.isFixed = isFixed;
        this.isMicrochipped = isMicrochipped;
        if (!isMicrochipped)
        {
            chipNum = 0;
        }
        else
        {
            this.chipNum = chipNum;
        }
    }

    public Cat(String type, String name, String sex, int age, 
    double timeAtFacility, String breed, boolean isFeral, boolean isFixed,
    boolean isMicrochipped)
    {
        super(type, name, sex, age, timeAtFacility, breed);
        this.kennelNum = tempNum;
        tempNum++;
        this.isFeral = isFeral;
        this.isFixed = isFixed;
        this.isMicrochipped = isMicrochipped;
        if (!isMicrochipped)
        {
            chipNum = 0;
        }
    }

    public Cat(String type, String name, String sex, int age, 
    double timeAtFacility, boolean isFeral, boolean isFixed,
    boolean isMicrochipped, int chipNum)
    {
        super(type, name, sex, age, timeAtFacility);
        this.kennelNum = tempNum;
        tempNum++;
        this.isFeral = isFeral;
        this.isFixed = isFixed;
        this.isMicrochipped = isMicrochipped;
        if (!isMicrochipped)
        {
            chipNum = 0;
        }
        else
        {
            this.chipNum = chipNum;
        }
    }

    public Cat(String type, String name, String sex, int age, 
    double timeAtFacility, boolean isFeral, boolean isFixed,
    boolean isMicrochipped)
    {
        super(type, name, sex, age, timeAtFacility);
        this.kennelNum = tempNum;
        tempNum++;
        this.isFeral = isFeral;
        this.isFixed = isFixed;
        this.isMicrochipped = isMicrochipped;
        if (!isMicrochipped)
        {
            chipNum = 0;
        }
    }

    public Cat(String type, String name, String sex, int age, 
    boolean isFeral, boolean isFixed, boolean isMicrochipped, int chipNum)
    {
        super(type, name, sex, age);
        this.kennelNum = tempNum;
        tempNum++;
        this.isFeral = isFeral;
        this.isFixed = isFixed;
        this.isMicrochipped = isMicrochipped;
        if (!isMicrochipped)
        {
            chipNum = 0;
        }
        else
        {
            this.chipNum = chipNum;
        }
    }

    public Cat(String type, String name, String sex, int age, 
    boolean isFeral, boolean isFixed, boolean isMicrochipped)
    {
        super(type, name, sex, age);
        this.kennelNum = tempNum;
        tempNum++;
        this.isFeral = isFeral;
        this.isFixed = isFixed;
        this.isMicrochipped = isMicrochipped;
        if (!isMicrochipped)
        {
            chipNum = 0;
        }
    }

    public Cat(String type, String name, String sex, boolean isFeral, 
    boolean isFixed, boolean isMicrochipped, int chipNum)
    {
        super(type, name, sex);
        this.kennelNum = tempNum;
        tempNum++;
        this.isFeral = isFeral;
        this.isFixed = isFixed;
        this.isMicrochipped = isMicrochipped;
        if (!isMicrochipped)
        {
            chipNum = 0;
        }
        else
        {
            this.chipNum = chipNum;
        }
    }

    public Cat(String type, String name, String sex, boolean isFeral, 
    boolean isFixed, boolean isMicrochipped)
    {
        super(type, name, sex);
        this.kennelNum = tempNum;
        tempNum++;
        this.isFeral = isFeral;
        this.isFixed = isFixed;
        this.isMicrochipped = isMicrochipped;
        if (!isMicrochipped)
        {
            chipNum = 0;
        }
    }

    public Cat(String type, String name, boolean isFeral, 
    boolean isFixed ,boolean isMicrochipped, int chipNum)
    {
        super(type, name);
        this.kennelNum = tempNum;
        tempNum++;
        this.isFeral = isFeral;
        this.isFixed = isFixed;
        this.isMicrochipped = isMicrochipped;
        if (!isMicrochipped)
        {
            chipNum = 0;
        }
        else
        {
            this.chipNum = chipNum;
        }
    }

    public Cat(String type, String name, boolean isFeral, 
    boolean isFixed, boolean isMicrochipped)
    {
        super(type, name);
        this.kennelNum = tempNum;
        tempNum++;
        this.isFeral = isFeral;
        this.isFixed = isFixed;
        this.isMicrochipped = isMicrochipped;
        if (!isMicrochipped)
        {
            chipNum = 0;
        }
    }

    public Cat(String type, boolean isFeral, 
    boolean isFixed, boolean isMicrochipped, int chipNum)
    {
        super(type);
        this.kennelNum = tempNum;
        tempNum++;
        this.isFeral = isFeral;
        this.isFixed = isFixed;
        this.isMicrochipped = isMicrochipped;
        if (!isMicrochipped)
        {
            chipNum = 0;
        }
        else
        {
            this.chipNum = chipNum;
        }
    }

    public Cat(String type, boolean isFeral, boolean isFixed,
    boolean isMicrochipped)
    {
        super(type);
        this.kennelNum = tempNum;
        tempNum++;
        this.isFeral = isFeral;
        this.isFixed = isFixed;
        this.isMicrochipped = isMicrochipped;
        if (!isMicrochipped)
        {
            chipNum = 0;
        }
    }

    public Cat(boolean isFeral, boolean isFixed, boolean isMicrochipped, 
    int chipNum)
    {
        super();
        this.kennelNum = tempNum;
        tempNum++;
        this.isFeral = isFeral;
        this.isFixed = isFixed;
        this.isMicrochipped = isMicrochipped;
        if (!isMicrochipped)
        {
            chipNum = 0;
        }
        else
        {
            this.chipNum = chipNum;
        }
    }

    public Cat(boolean isFeral, boolean isFixed, boolean isMicrochipped)
    {
        super();
        this.kennelNum = tempNum;
        tempNum++;
        this.isFeral = isFeral;
        this.isFixed = isFixed;
        this.isMicrochipped = isMicrochipped;
        if (!isMicrochipped)
        {
            chipNum = 0;
        }
    }

    //Get Feral Status
    public boolean isFeral()
    {
        return isFeral;
    }

    //Get Spay/Neuter Status
    public boolean isFixed()
    {
        return isFixed;
    }

    //Get Microchip Status
    public boolean isMicrochipped()
    {
        return isMicrochipped;
    }

    //Get Microchip Number
    public int getChipNum()
    {
        return chipNum;
    }

    //Print Cat Information Singularly
    public void printCatInfo()
    {
        System.out.println("Cat Name: " + getName() + ", Breed: " + getBreed()
        + ", Age: " + getAge());
    }

    //Print Cats
    public void print() throws InterruptedException
    {
        super.print();
        System.out.print(CYAN + "Feral: " + RESET);
        if (isFeral)
        {
            System.out.println(RED + "Yes" + RESET);
        }
        else
        {
            System.out.println(GREEN + "No" + RESET);
        }
        Thread.sleep(250);
        System.out.print(CYAN + "Fixed: " + RESET);
        if (isFixed)
        {
            System.out.println(GREEN + "Yes" + RESET);
        }
        else
        {
            System.out.println(RED + "No" + RESET);
        }
        Thread.sleep(250);
        System.out.print(CYAN + "Microchipped: " + RESET);
        if (isMicrochipped)
        {
            System.out.println(GREEN + "Yes" + RESET);
        }
        else
        {
            System.out.println(RED + "No" + RESET);
        }
        Thread.sleep(250);
        if (isMicrochipped)
        {
            System.out.println(CYAN + "Microchip Number: " + RESET + chipNum);
            Thread.sleep(250);
        }
        else
        {
            System.out.println(CYAN + "Microchip Number:" + RESET + 
            "Not Microchipped");   
            Thread.sleep(250);
        }
        System.out.println(CYAN + "Kennel Number: " + RESET + kennelNum);
        Thread.sleep(250);
        System.out.println(RED + "---------------------------------------" +
        "--------" + RESET);
    }   
}

