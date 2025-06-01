

public class Dog extends Animal 
{
    //Instance Variables
    private int kennelNum;
    private static int tempNum = 1;
    private boolean isAggressive;
    private boolean isFixed;
    private boolean isMicrochipped;
    private int chipNum;

    //Overloaded Constructors
    public Dog(String type, String name, String sex, int age,
    double timeAtFacility, String breed, boolean isAggressive, boolean isFixed,
    double weight, boolean isMicrochipped, int chipNum, String color)
    {
        super(type, name, sex, age, timeAtFacility, breed, weight, color);
        this.kennelNum = tempNum;
        tempNum++;
        this.isAggressive = isAggressive;
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

    public Dog(String type, String name, String sex, int age,
    double timeAtFacility, String breed, boolean isAggressive, boolean isFixed,
    double weight, boolean isMicrochipped, String color)
    {
        super(type, name, sex, age, timeAtFacility, breed, weight, color);
        this.kennelNum = tempNum;
        tempNum++;
        this.isAggressive = isAggressive;
        this.isFixed = isFixed;
        this.isMicrochipped = isMicrochipped;
        if (!isMicrochipped)
        {
            chipNum = 0;
        }
    }

    public Dog(String type, String name, String sex, int age,
    double timeAtFacility, String breed, boolean isAggressive, boolean isFixed,
    double weight, boolean isMicrochipped, int chipNum)
    {
        super(type, name, sex, age, timeAtFacility, breed, weight);
        this.kennelNum = tempNum;
        tempNum++;
        this.isAggressive = isAggressive;
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

    public Dog(String type, String name, String sex, int age,
    double timeAtFacility, String breed, boolean isAggressive, boolean isFixed,
    double weight, boolean isMicrochipped)
    {
        super(type, name, sex, age, timeAtFacility, breed, weight);
        this.kennelNum = tempNum;
        tempNum++;
        this.isAggressive = isAggressive;
        this.isFixed = isFixed;
        this.isMicrochipped = isMicrochipped;
        if (!isMicrochipped)
        {
            chipNum = 0;
        }
    }

    public Dog(String type, String name, String sex, int age,
    double timeAtFacility, String breed, boolean isAggressive, boolean isFixed,
    boolean isMicrochipped, int chipNum)
    {
        super(type, name, sex, age, timeAtFacility, breed);
        this.kennelNum = tempNum;
        tempNum++;
        this.isAggressive = isAggressive;
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

    public Dog(String type, String name, String sex, int age,
    double timeAtFacility, String breed, boolean isAggressive, boolean isFixed,
    boolean isMicrochipped)
    {
        super(type, name, sex, age, timeAtFacility, breed);
        this.kennelNum = tempNum;
        tempNum++;
        this.isAggressive = isAggressive;
        this.isFixed = isFixed;
        this.isMicrochipped = isMicrochipped;
        if (!isMicrochipped)
        {
            chipNum = 0;
        }
    }

    public Dog(String type, String name, String sex, int age,
    double timeAtFacility,boolean isAggressive, boolean isFixed,
    boolean isMicrochipped, int chipNum)
    {
        super(type, name, sex, age, timeAtFacility);
        this.kennelNum = tempNum;
        tempNum++;
        this.isAggressive = isAggressive;
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

    public Dog(String type, String name, String sex, int age,
    double timeAtFacility,boolean isAggressive, boolean isFixed,
    boolean isMicrochipped)
    {
        super(type, name, sex, age, timeAtFacility);
        this.kennelNum = tempNum;
        tempNum++;
        this.isAggressive = isAggressive;
        this.isFixed = isFixed;
        this.isMicrochipped = isMicrochipped;
        if (!isMicrochipped)
        {
            chipNum = 0;
        }
    }

    public Dog(String type, String name, String sex, int age,
    boolean isAggressive, boolean isFixed, boolean isMicrochipped, int chipNum)
    {
        super(type, name, sex, age);
        this.kennelNum = tempNum;
        tempNum++;
        this.isAggressive = isAggressive;
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

    public Dog(String type, String name, String sex, int age,
    boolean isAggressive, boolean isFixed, boolean isMicrochipped)
    {
        super(type, name, sex, age);
        this.kennelNum = tempNum;
        tempNum++;
        this.isAggressive = isAggressive;
        this.isFixed = isFixed;
        this.isMicrochipped = isMicrochipped;
        if (!isMicrochipped)
        {
            chipNum = 0;
        }
    }

    public Dog(String type, String name, String sex, boolean isAggressive,
    boolean isFixed, boolean isMicrochipped, int chipNum)
    {
        super(type, name, sex);
        this.kennelNum = tempNum;
        tempNum++;
        this.isAggressive = isAggressive;
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

    public Dog(String type, String name, String sex, boolean isAggressive,
    boolean isFixed, boolean isMicrochipped)
    {
        super(type, name, sex);
        this.kennelNum = tempNum;
        tempNum++;
        this.isAggressive = isAggressive;
        this.isFixed = isFixed;
        this.isMicrochipped = isMicrochipped;
        if (!isMicrochipped)
        {
            chipNum = 0;
        }
    }

    public Dog(String type, String name, boolean isAggressive,
    boolean isFixed, boolean isMicrochipped, int chipNum)
    {
        super(type, name);
        this.kennelNum = tempNum;
        tempNum++;
        this.isAggressive = isAggressive;
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

    public Dog(String type, String name, boolean isAggressive,
    boolean isFixed, boolean isMicrochipped)
    {
        super(type, name);
        this.kennelNum = tempNum;
        tempNum++;
        this.isAggressive = isAggressive;
        this.isFixed = isFixed;
        this.isMicrochipped = isMicrochipped;
        if (!isMicrochipped)
        {
            chipNum = 0;
        }
    } 

    public Dog(String type, boolean isAggressive, boolean isFixed,
    boolean isMicrochipped, int chipNum)
    {
        super(type);
        this.kennelNum = tempNum;
        tempNum++;
        this.isAggressive = isAggressive;
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

    public Dog(String type, boolean isAggressive, boolean isFixed,
    boolean isMicrochipped) 
    {
        super(type);
        this.kennelNum = tempNum;
        tempNum++;
        this.isAggressive = isAggressive;
        this.isFixed = isFixed;
        this.isMicrochipped = isMicrochipped;
        if (!isMicrochipped)
        {
            chipNum = 0;
        }
    } 
    
    public Dog(boolean isAggressive,boolean isFixed, boolean isMicrochipped,
    int chipNum) 
    {
        super();
        this.kennelNum = tempNum;
        tempNum++;
        this.isAggressive = isAggressive;
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

    public Dog(boolean isAggressive,boolean isFixed, boolean isMicrochipped)
    {
        super();
        this.kennelNum = tempNum;
        tempNum++;
        this.isAggressive = isAggressive;
        this.isFixed = isFixed;
        this.isMicrochipped = isMicrochipped;
        if (!isMicrochipped)
        {
            chipNum = 0;
        }
    } 

    //Set Kennel Number
    public void setKennel(int newKennel)
    {
        this.kennelNum = newKennel;
    }

    //Get Kennel Number
    public int getKennel()
    {
        return kennelNum;
    }

    //Get Aggressive Statue
    public boolean isAggressive()
    {
        return isAggressive;
    }

    //Get Microchip Status
    public boolean isMicrochipped()
    {
        return isMicrochipped;
    }

    //Get Neuter Status
    public boolean isFixed()
    {
        return isFixed;
    }

    //Get Microchip Number
    public int getChipNum()
    {
        return chipNum;
    }
    //Print Dog Information
    public void print() throws InterruptedException
    {
        super.print();
        System.out.println(CYAN + "Kennel Number: " + RESET + kennelNum);
        Thread.sleep(250);
        if (isAggressive)
        {
            System.out.println(CYAN + "Aggressive: " + RED + "Yes" + RESET);
        }
        else
        {
            System.out.println(CYAN + "Aggressive: " + GREEN + "No" + RESET);
        }
        Thread.sleep(250);
        if (isFixed)
        {
            System.out.println(CYAN + "Spayed/Neutered: " + RESET + "Yes");
        }
        else
        {
            System.out.println(CYAN + "Spayed/Neutered: " + RESET + "No");
        }
        Thread.sleep(250);
        if (isMicrochipped)
        {
            System.out.println(CYAN + "Microchipped: " + RESET + "Yes");
            Thread.sleep(250);
            System.out.println(CYAN + "Microchip Number: " + RESET + chipNum);
        }
        else
        {
            System.out.println(CYAN + "Microchipped: " + RESET +  "No");
        }
        Thread.sleep(250);
        System.out.println(RED + "---------------------------------------" +
        "--------" + RESET);
    }
    //Print Dog Information Summarized
    public void dogInfo()
    {
        System.out.println("Name: " + getName() + ", Breed: " + getBreed() +
        ", Age: " + getAge());
    }
}
