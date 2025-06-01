/*
Jesse Singleton
5/29/2025
CS 123

Test Data:
-Tested facility creation, animal addition, adoption, and surrender.
- Tested animal listing and searching functionalities.
- Tested CSV loading and saving functionalities.
- Tested input validation for various user inputs.
- Tested facility management options.
- Tested menu navigation and exit functionality.
- Tested animal information display.
- Tested console color outputs for better user experience.
- Tested error handling for invalid inputs.
- Tested the addition of new facilities.
- Tested the adoption and surrender of animals and ensured that
  the system correctly updates the lists of available animals.
- Tested object creation for dogs, cats, and birds with various attributes.
- Tested the system's ability to handle multiple facilities and animals.
- Tested output formatting for better readability.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



public class Main 
{
    //Colors for console output
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";

    public static void main(String[] args) throws InterruptedException
    {   
        Scanner input = new Scanner(System.in);
        ArrayList <Facility> facilities = new ArrayList<>();
        //Load facilities from CSV
        String csvFilePath = "C:\\Users\\erika\\Java files\\" +
        "PetRegistrationSystem\\PetRegistrationSystem\\src\\Facility1.csv";
        loadFacilitiesFromCSV(csvFilePath, facilities);
        Thread.sleep(500);
        //Load dogs from CSV
        Facility selected = facilities.get(0);
        String csvFilePath2 = "C:\\Users\\erika\\Java files\\" +
        "PetRegistrationSystem\\PetRegistrationSystem\\src\\Dogs1.csv";
        loadDogsFromCSV(csvFilePath2, selected);
        Thread.sleep(500);
        //Load cats from CSV
        String csvFilePath3 = "C:\\Users\\erika\\Java files\\" +
        "PetRegistrationSystem\\PetRegistrationSystem\\src\\Cats1.csv";
        loadCatsFromCSV(csvFilePath3, selected);
        Thread.sleep(500);
        String csvFilePath4 = "C:\\Users\\erika\\Java files\\" +
        "PetRegistrationSystem\\PetRegistrationSystem\\src\\Birds1.csv";
        loadBirdsFromCSV(csvFilePath4, selected);
        Thread.sleep(500);
        boolean exitProgram = false;
        //While loop to keep the program running until the user chooses to exit
        while (!exitProgram)
        {
            System.out.println(CYAN + "-----" + GREEN + " Welcome To The "+
            "Singleton Pet Registration System " + CYAN + "-----" + RESET);
            Thread.sleep(500);
            //Display facilities and options
            System.out.println(CYAN + "See Menu Options Below: " + RESET);
            Thread.sleep(500);
            //Loop through facilities and display them
            for (int i = 0; i < facilities.size(); i++)
            {
                System.out.println((i+1) + ". " + facilities.get(i).getName());
            }
            Thread.sleep(300);
            System.out.println((facilities.size()+1) + ". Add A " +
            "New Facility");
            Thread.sleep(300);
            System.out.println((facilities.size()+2) + ". Exit System");
            Thread.sleep(300);
            //Prompt user for selection
            System.out.print(CYAN + "Please Input Your Selection: " + RESET);
            //Input validation for selection
            int choice =InputValidator.getIntInput(input, facilities.size()+2);
            //Add a new facility
            if (choice == facilities.size()+1)
            {
                String name;
                String address;
                String phoneNum;
                String city;
                String state;
                System.out.print(CYAN +"What is the name of the facility you'd"
                +" like to add? " + RESET);
                name = input.nextLine();
                System.out.print(CYAN + "What is the phone number " +
                "associated with this facility? " + RESET);
                phoneNum = input.nextLine();
                System.out.print(CYAN +"What is the address of " + name +
                "? " + RESET);
                address = input.nextLine();
                System.out.print(CYAN + "In what city is " + name +
                " located? " + RESET);
                city = input.nextLine();
                System.out.print(CYAN + "In what State is " + name +
                " located? " + RESET);
                state = input.nextLine();
                facilities.add(new Facility(name, address, city, state,
                phoneNum));
                System.out.println(GREEN + name + " has been added to the " +
                "list of facilities!" + RESET);
                
            }
            //Exit the program
            else if (choice == facilities.size()+2)
            {
                exitProgram = true;
                System.out.println(PURPLE + "Thank You For Using The Singleton "
                + "Pet Registration System."); 
                System.out.println("See You Next Time!" + RESET);
                Thread.sleep(1500);
                //Write facilities to CSV
                saveFacilitiesToCSV(csvFilePath, facilities);
                Thread.sleep(500);
                //Write dogs to CSV
                saveDogsToCSV(csvFilePath2, selected);
                Thread.sleep(500);
                //Write cats to CSV
                saveCatsToCSV(csvFilePath3, selected);
                Thread.sleep(500);
                //Write birds to CSV
                saveBirdsToCSV(csvFilePath4, selected);
                Thread.sleep(500);
                //Exit message
                System.out.println(GREEN + "All changes have been saved." +
                RESET);
                Thread.sleep(500);
                System.out.println(RED + "Exiting The System." + RESET);
                Thread.sleep(500);
                continue;
            }
            //No facilities available
            if (facilities.size() == 0)
            {
                System.out.println("No facilities available. Please add a " +
                "facility first.");
                continue;
            }
            //Manage selected facility
            Facility selectedFacility = facilities.get(choice - 1);
            boolean manageFacility = true;
            while (manageFacility) 
            {
                //Display facility management options
                System.out.println(CYAN + "--- Managing Facility --- " +RESET);
                Thread.sleep(200);
                System.out.println(BLUE + "   " + selectedFacility.getName() + 
                RESET);
                Thread.sleep(200);
                System.out.println("1. Adopt Animal");
                Thread.sleep(200);
                System.out.println("2. Surrender Animal");
                Thread.sleep(200);
                System.out.println("3. List All Dogs");
                Thread.sleep(200);
                System.out.println("4. List All Cats");
                Thread.sleep(200);
                System.out.println("5. List All Birds");
                Thread.sleep(200);
                System.out.println("6. Search Animal by Name");
                Thread.sleep(200);
                System.out.println("7. See Facility Information");
                Thread.sleep(200);
                System.out.println("8. Return to Facility Selection");
                Thread.sleep(200);
                System.out.print("Enter choice: ");
                //Input validation for action choice
                int actionChoice;
                actionChoice = InputValidator.getIntInput(input, 8);
                //Switch case for action choice
                switch (actionChoice) 
                {
                    case 1:
                    // If no animals available for adoption
                    if (selectedFacility.getDogs().isEmpty() && 
                        selectedFacility.getCats().isEmpty() && 
                        selectedFacility.getBirds().isEmpty())
                    {
                        System.out.println(RED + "No animals available for " +
                        "adoption." + RESET);
                    }
                    // If animals are available for adoption, handle adoption
                    else
                    {
                        System.out.println(CYAN + "Select an animal to adopt: " 
                        + RESET);
                        System.out.println("1. Dog");
                        System.out.println("2. Cat");
                        System.out.println("3. Bird");
                        System.out.print(CYAN + "Enter your choice: " + RESET);
                        int animalChoice = InputValidator.getIntInput
                        (input, 3);
                        Animal selectedAnimal = null;
                        switch (animalChoice) {
                            // Handle adoption for dogs
                            case 1:
                                if (selectedFacility.getDogs().isEmpty())
                                {
                                    System.out.println(RED +"No dogs available"
                                    + "for adoption." + RESET);
                                }
                                else
                                {
                                    for (Dog dog : selectedFacility.getDogs())
                                    {
                                        dog.dogInfo();
                                        Thread.sleep(1000);
                                    }
                                    // Prompt user to enter dog name
                                    System.out.print(CYAN +"Enter the name of "
                                    + "the dog to adopt: " + RESET);
                                    String dogName = input.nextLine();
                                    for (Dog dog : selectedFacility.getDogs())
                                    {
                                        if (dog.getName().equalsIgnoreCase
                                        (dogName))
                                        {
                                            selectedAnimal = dog;
                                            break;
                                        }
                                    }
                                }
                                break;
                            // Handle adoption for cats
                            case 2:
                                if (selectedFacility.getCats().isEmpty())
                                {
                                    System.out.println(RED +"No cats available"
                                    + "for adoption." + RESET);
                                }
                                else
                                {
                                    for (Cat cat : selectedFacility.getCats())
                                    {
                                        cat.printCatInfo();
                                        Thread.sleep(1000);
                                    }
                                    System.out.print(CYAN +"Enter the name of "
                                    + "the cat to adopt: " + RESET);
                                    String catName = input.nextLine();
                                    for (Cat cat : selectedFacility.getCats())
                                    {
                                        if (cat.getName().equalsIgnoreCase
                                        (catName))
                                        {
                                            selectedAnimal = cat;
                                            break;
                                        }
                                    }
                                }
                                break;
                            // Handle adoption for birds
                            case 3:
                                if (selectedFacility.getBirds().isEmpty())
                                {
                                    System.out.println(RED + "No birds " +
                                    "available for adoption." + RESET);
                                }
                                else
                                {
                                    for(Bird bird :selectedFacility.getBirds())
                                    {
                                        bird.printBirdInfo();
                                        Thread.sleep(1000);
                                    }
                                    System.out.print(CYAN + "Enter the name of "
                                    + "the bird to adopt: " + RESET);
                                    String birdName = input.nextLine();
                                    for(Bird bird : selectedFacility.getBirds())
                                    {
                                        if (bird.getName().equalsIgnoreCase
                                        (birdName))
                                        {
                                            selectedAnimal = bird;
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                System.out.println(RED +"Invalid choice. Try " +
                                "again." + RESET);
                        }
                        // If an animal was selected, adopt it
                        if (selectedAnimal != null)
                        {
                            selectedFacility.adoptAnimal(selectedAnimal);
                        }
                        // If no animal was found with the given name
                        else
                        {
                            System.out.println(RED + "Animal not found."+RESET);
                        }
                    }
                    break;
                    // Surrender an animal
                    case 2:
                        System.out.println(CYAN + "Select an animal to " +
                        "surrender" + RESET);
                        System.out.println("1. Dogs");
                        System.out.println("2. Cats");
                        System.out.println("3. Birds");
                        System.out.print(CYAN + "Enter your choice: " + RESET);
                        int surrender = InputValidator.getIntInput
                        (input, 3);
                        // Variables for animal attributes
                        String type, name, sex, breed, color, size;
                        boolean aggressive, microchipped, fixed, feral, healthy;
                        int age, chipNum;
                        double timeAtFacility, weight;
                        // Initialize variables
                    switch (surrender)
                    {
                        case 1: //For Dog
                            type = "Dog";
                            timeAtFacility = 0.0;
                            System.out.print("What is the dogs name? ");
                            name = input.nextLine();
                            System.out.print("What breed is the dog? ");
                            breed = input.nextLine();
                            System.out.println("What sex is the dog?");
                            System.out.println("1. Male");
                            System.out.println("2. Female");
                            System.out.print("Enter your choice: ");
                            int temp = InputValidator.getIntInput(input, 2);
                            if (temp == 1)
                            {
                                sex = "M";
                            }
                            else
                            {
                                sex = "F";
                            }
                            System.out.print("What color is the dog? ");
                            color = input.nextLine();
                            System.out.println("Is the dog aggressive? ");
                            System.out.println("1. Yes");
                            System.out.println("2. No");
                            System.out.print("Enter your choice: ");
                            temp = InputValidator.getIntInput(input, 2);
                            if (temp == 1)
                            {
                                aggressive = true;
                            }
                            else
                            {
                                aggressive = false;
                            }
                            System.out.print("What is the dogs age? ");
                            age = InputValidator.getIntInput(input, 20);
                            System.out.print("What is the dogs weight? ");
                            weight = InputValidator.getDoubleInput
                            (input, 200);
                            System.out.println("Is the dog fixed? ");
                            System.out.println("1. Yes");
                            System.out.println("2. No");
                            System.out.print("Enter your choice: ");
                            temp = InputValidator.getIntInput(input, 2);
                            if (temp == 1)
                            {
                                fixed = true;
                            }
                            else
                            {
                                fixed = false;
                            }
                            System.out.println("Is the dog microchipped? ");
                            System.out.println("1. Yes");
                            System.out.println("2. No");
                            System.out.print("Enter your choice: ");
                            temp = InputValidator.getIntInput(input, 2);
                            if (temp == 1)
                            {
                                microchipped = true;
                                System.out.print("What is the chip number? ");
                                chipNum = input.nextInt();
                                input.nextLine();
                            }
                            else
                            {
                                microchipped = false;
                                chipNum = 0;
                            }
                            // Create a new Dog object
                            Dog surrenderedDog = new Dog(type, name, sex, age, 
                            timeAtFacility, breed, aggressive, fixed, weight,
                            microchipped, chipNum, color);
                            // Add the dog to the facility's list of dogs
                            selectedFacility.addDog(surrenderedDog);
                            System.out.println(GREEN + "Dog surrendered "+
                            "successfully!" + RESET);
                            break;
                        case 2: //For Cat
                            type = "Cat";
                            timeAtFacility = 0.0;
                            System.out.print("What is the cats name? ");
                            name = input.nextLine();
                            System.out.print("What breed is the cat? ");
                            breed = input.nextLine();
                            System.out.println("What sex is the cat?");
                            System.out.println("1. Male");
                            System.out.println("2. Female");
                            System.out.print("Enter your choice: ");
                            temp = InputValidator.getIntInput(input, 2);
                            if (temp == 1)
                            {
                                sex = "M";
                            }
                            else
                            {
                                sex = "F";
                            }
                            System.out.print("What color is the cat? ");
                            color = input.nextLine();
                            System.out.println("Is the cat feral? ");
                            System.out.println("1. Yes");
                            System.out.println("2. No");
                            System.out.print("Enter your choice: ");
                            temp = InputValidator.getIntInput(input, 2);
                            if (temp == 1)
                            {
                                feral = true;
                            }
                            else
                            {
                                feral = false;
                            }
                            System.out.print("What is the cats age? ");
                            age = InputValidator.getIntInput(input, 20);
                            System.out.print("What is the cats weight? ");
                            weight = InputValidator.getDoubleInput
                            (input, 200);
                            System.out.println("Is the cat fixed? ");
                            System.out.println("1. Yes");
                            System.out.println("2. No");
                            System.out.print("Enter your choice: ");
                            temp = InputValidator.getIntInput(input, 2);
                            if (temp == 1)
                            {
                                fixed = true;
                            }
                            else
                            {
                                fixed = false;
                            }
                            System.out.println("Is the cat microchipped? ");
                            System.out.println("1. Yes");
                            System.out.println("2. No");
                            System.out.print("Enter your choice: ");
                            temp = InputValidator.getIntInput(input, 2);
                            if (temp == 1)
                            {
                                microchipped = true;
                                System.out.print("What is the chip number? ");
                                chipNum = input.nextInt();
                                input.nextLine();
                            }
                            else
                            {
                                microchipped = false;
                                chipNum = 0;
                            }
                            // Create a new Cat object
                            Cat surrenderedCat = new Cat(type, name, sex, age, 
                            timeAtFacility, breed, feral, fixed, weight,
                            microchipped, chipNum, color);
                            // Add the cat to the facility's list of cats
                            selectedFacility.addCat(surrenderedCat);
                            System.out.println(GREEN + "Cat surrendered "+
                            "successfully!" + RESET);
                            break;
                        case 3: //For Bird
                            type = "Bird";
                            timeAtFacility = 0.0;
                            System.out.print("What is the birds name? ");
                            name = input.nextLine();
                            System.out.print("What breed is the bird? ");
                            breed = input.nextLine();
                            System.out.println("What sex is the bird?");
                            System.out.println("1. Male");
                            System.out.println("2. Female");
                            System.out.print("Enter your choice: ");
                            temp = InputValidator.getIntInput(input, 2);
                            if (temp == 1)
                            {
                                sex = "M";
                            }
                            else
                            {
                                sex = "F";
                            }
                            System.out.print("What color is the bird? ");
                            color = input.nextLine();
                            System.out.println("Is the bird healthy? ");
                            System.out.println("1. Yes");
                            System.out.println("2. No");
                            System.out.print("Enter your choice: ");
                            temp = InputValidator.getIntInput(input, 2);
                            if (temp == 1)
                            {
                                healthy = true;
                            }
                            else
                            {
                                healthy = false;
                            }
                            System.out.print("What is the birds age? ");
                            age = InputValidator.getIntInput(input, 20);
                            System.out.print("What is the birds weight? ");
                            weight = InputValidator.getDoubleInput
                            (input, 200);
                            System.out.println("What size is the bird? ");
                            System.out.println("1. Small");
                            System.out.println("2. Medium");
                            System.out.println("3. Large");
                            System.out.print("Enter your choice: ");
                            temp = InputValidator.getIntInput(input, 3);
                            if (temp == 1)
                            {
                                size = "Small";
                            }
                            else if (temp == 2)
                            {
                                size = "Medium";
                            }
                            else
                            {
                                size = "Large";
                            }
                            // Create a new Bird object
                            Bird surrenderedBird =new Bird(type, name, sex, age, 
                            timeAtFacility,breed, weight, color, size, healthy);
                            // Add the bird to the facility's list of birds
                            selectedFacility.addBird(surrenderedBird);
                            System.out.println(GREEN + "Bird surrendered "+
                            "successfully!" + RESET);
                            break;
                    }
                    break;
                    case 3:
                        // Call method to search dogs
                        if (selectedFacility.getDogs().isEmpty())
                        {
                            System.out.println(RED + "No dogs available for " +
                            "adoption." + RESET);
                        }
                        else
                        {
                            int index = 0;
                            for (Dog dogs : selectedFacility.getDogs())
                            {
                                index++;
                                dogs.print();
                                System.out.println(YELLOW +"1. See next dog" 
                                + RESET);
                                System.out.println(YELLOW +"2. Exit" + RESET);
                                System.out.print(CYAN + "Enter your choice: " 
                                + RESET);
                                int dogChoice = InputValidator.getIntInput
                                (input, 2);
                                if (dogChoice == 1)
                                {
                                    if (index == selectedFacility.
                                    getDogs().size())
                                    {
                                        Thread.sleep(500);
                                        System.out.println(RED + "No more dogs "
                                        + "available." + RESET);
                                        Thread.sleep(500);
                                        break; // exit loop
                                    }
                                    continue; // show next dog
                                }
                                else if (dogChoice == 2)
                                {
                                    break; // exit loop
                                }
                                else
                                {
                                    System.out.println(RED + "Invalid choice." +
                                    "Try again." + RESET);
                                }
                                System.out.println(CYAN + "No more dogs " +
                                "available."+ RESET);
                            }
                        }
                        break;
                    case 4:
                        // Call method to search cats
                        if (selectedFacility.getCats().isEmpty())
                        {
                            System.out.println(RED + "No cats available for " +
                            "adoption." + RESET);
                        }
                        else
                        {
                            int index = 0;
                            for (Cat cat : selectedFacility.getCats())
                            {
                                index++;
                                cat.print();
                                System.out.println(YELLOW +"1. See next cat" + 
                                RESET);
                                System.out.println(YELLOW +"2. Exit" + RESET);
                                System.out.print(CYAN + "Enter your choice: " + 
                                RESET);
                                int catChoice = InputValidator.getIntInput
                                (input, 2);
                                if (catChoice == 1)
                                {
                                    if (index == selectedFacility.
                                    getCats().size())
                                    {
                                        Thread.sleep(500);
                                        System.out.println(RED + "No more cats "
                                        + "available." + RESET);
                                        Thread.sleep(500);
                                        break; // exit loop
                                    }
                                    continue; // show next cat
                                }
                                else if (catChoice == 2)
                                {
                                    break; // exit loop
                                }
                                else
                                {
                                    System.out.println(RED + "Invalid choice." +
                                    "Try again." + RESET);
                                }
                                System.out.println(CYAN + "No more cats " +
                                "available."+ RESET);
                            }
                        }
                        break;
                    case 5:
                        // Call method to search birds
                        if (selectedFacility.getBirds().isEmpty())
                        {
                            System.out.println(RED + "No birds available for " +
                            "adoption." + RESET);
                        }
                        else
                        {
                            int index = 0;
                            for (Bird bird : selectedFacility.getBirds())
                            {
                                index++;
                                bird.print();
                                System.out.println(YELLOW +"1. See next bird" 
                                + RESET);
                                System.out.println(YELLOW +"2. Exit" + RESET);
                                System.out.print(CYAN + "Enter your choice: " 
                                + RESET);
                                int birdChoice = InputValidator.getIntInput
                                (input, 2);
                                if (birdChoice == 1)
                                {
                                    if (index == selectedFacility.
                                    getBirds().size())
                                    {
                                        Thread.sleep(500);
                                        System.out.println(RED + "No more birds"
                                        + " available." + RESET);
                                        Thread.sleep(500);
                                        break; // exit loop
                                    }
                                    continue; // show next bird
                                }
                                else if (birdChoice == 2)
                                {
                                    break; // exit loop
                                }
                                else
                                {
                                    System.out.println(RED + "Invalid choice." +
                                    " Try again." + RESET);
                                }
                                System.out.println(CYAN + "No more birds " +
                                "available." + RESET);
                            }
                        }
                        break;
                    case 6:
                        //Search animal by name
                        System.out.print(CYAN + "Enter the name of the animal: "
                        + RESET);
                        name = input.nextLine();
                        boolean found = false;
                        for (Dog dog : selectedFacility.getDogs())
                        {
                            if (dog.getName().equalsIgnoreCase(name))
                            {
                                dog.print();
                                found = true;
                            }
                        }
                        for (Cat cat : selectedFacility.getCats())
                        {
                            if (cat.getName().equalsIgnoreCase(name))
                            {
                                cat.print();
                                found = true;
                            }
                        }
                        for (Bird bird : selectedFacility.getBirds())
                        {
                            if (bird.getName().equalsIgnoreCase(name))
                            {
                                bird.print();
                                found = true;
                            }
                        }
                        if (!found)
                        {
                            System.out.println(RED +"Animal not found." +RESET);
                            break; 
                        }
                        System.out.println(GREEN + "Animal found!" + RESET);
                        break;
                    case 7:
                        // Display facility information
                        Thread.sleep(500);
                        System.out.println(selectedFacility.toString());
                        Thread.sleep(1500);
                        break;
                    case 8:
                        manageFacility = false; // exit loop
                        break;
                    default:
                        System.out.println(RED + "Invalid choice. Try again." 
                        + RESET);
                }
            }
        }
    }

    /* Structure for all load and save CSV methods were generated by 
     * DeepAI.org generative AI. Methods were then modified by me to
     * fit the needs of the program.
     */
    
    //Load Facilities from CSV
    public static void loadFacilitiesFromCSV(String filePath,
    ArrayList<Facility> facilities) 
    {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) 
        {
            String line;
            boolean isFirstLine = true;
            while ((line = br.readLine()) != null) 
            {
                if (isFirstLine) 
                {
                    isFirstLine = false;
                    continue;
                }
                String[] fields = line.split(",");
                if (fields.length >= 5)
                {
                    String name = fields[0].trim();
                    String address = fields[1].trim();
                    String city = fields[2].trim();
                    String state = fields[3].trim();
                    String phoneNum = fields[4].trim();
                    Facility facility = new Facility(name, address, city, state,
                    phoneNum);
                    facilities.add(facility);
                } 
                else 
                {
                    System.out.println(RED + "Invalid line in CSV: " + line +
                    RESET);
                }
            }
            System.out.println(GREEN +"Facilities loaded successfully from CSV."
            + RESET);
        } 
        catch (IOException e) 
        {
            System.out.println(RED + "Error reading CSV file: " + e.getMessage()
            + RESET);
        }
    }
    
    //Loads Dogs from CSV
    public static void loadDogsFromCSV(String filePath, Facility facility) 
    {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) 
        {
            String line;
            boolean isFirstLine = true;
            while ((line = br.readLine()) != null) 
            {
                if (isFirstLine) 
                {
                    isFirstLine = false;
                    continue;
                }
                String[] fields = line.split(",");
                if (fields.length >= 9) 
                {
                    String type = fields[0].trim();
                    String name = fields[1].trim();
                    String sex = fields[2].trim();
                    int age = Integer.parseInt(fields[3].trim());
                    double timeAtFacility =Double.parseDouble(fields[4].trim());
                    String breed = fields[5].trim();
                    boolean aggressive = Boolean.parseBoolean(fields[6].trim());
                    boolean fixed = Boolean.parseBoolean(fields[7].trim());
                    double weight = Double.parseDouble(fields[8].trim());
                    boolean microchipped=Boolean.parseBoolean(fields[9].trim());
                    int chipNum = Integer.parseInt(fields[10].trim());
                    String color = fields[11].trim();
                    // Create Dog object
                    Dog dog = new Dog(type, name, sex, age, 
                    timeAtFacility, breed, aggressive, fixed, weight, 
                    microchipped, chipNum, color);
                    // Add to facility
                    facility.addDog(dog);
                } 
                else 
                {
                    System.out.println(RED + "Invalid dog line: " + line+RESET);
                }
            }
            System.out.println(GREEN + "Dogs loaded successfully." + RESET);
        }
        catch (IOException e) 
        {
            System.out.println(RED + "Error reading dog CSV: " + e.getMessage() 
            + RESET);
        }
    }
    
    //Loads Cats from CSV
    public static void loadCatsFromCSV(String filePath, Facility facility) 
    {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) 
        {
            String line;
            boolean isFirstLine = true;
            while ((line = br.readLine()) != null) 
            {
                if (isFirstLine) 
                {
                    isFirstLine = false;
                    continue;
                }
                String[] fields = line.split(",");
                if (fields.length >= 12) 
                {
                    String type = fields[0].trim();
                    String name = fields[1].trim();
                    String sex = fields[2].trim();
                    int age = Integer.parseInt(fields[3].trim());
                    double timeAtFacility =Double.parseDouble(fields[4].trim());
                    String breed = fields[5].trim();
                    boolean isFeral = Boolean.parseBoolean(fields[6].trim());
                    boolean isFixed = Boolean.parseBoolean(fields[7].trim());
                    double weight = Double.parseDouble(fields[8].trim());
                    boolean isMicrochipped = Boolean.parseBoolean
                    (fields[9].trim());
                    int chipNum = Integer.parseInt(fields[10].trim());
                    String color = fields[11].trim();
                    Cat cat=new Cat(type, name, sex, age, timeAtFacility, breed, 
                    isFeral, isFixed, weight, isMicrochipped, chipNum, color);
                    // Add to facility
                    facility.addCat(cat);
                } 
                else 
                {
                    System.out.println(RED + "Invalid cat line: " + line+RESET);
                }
            }
            System.out.println(GREEN + "Cats loaded successfully." + RESET);
        } 
        catch (IOException e) 
        {
            System.out.println(RED + "Error reading cat CSV: " + 
            e.getMessage() + RESET);
        }
    }
    
    //Loads Birds from CSV
    public static void loadBirdsFromCSV(String filePath, Facility facility) 
    {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) 
        {
            String line;
            boolean isFirstLine = true;
            while ((line = br.readLine()) != null) 
            {
                if (isFirstLine) 
                {
                    isFirstLine = false;
                    continue;
                }
                String[] fields = line.split(",");
                if (fields.length >= 10) 
                {
                    String type = fields[0].trim();       
                    String name = fields[1].trim();
                    String sex = fields[2].trim();
                    int age = Integer.parseInt(fields[3].trim());
                    double timeAtFacility =Double.parseDouble(fields[4].trim());
                    String breed = fields[5].trim();
                    double weight = Double.parseDouble(fields[6].trim());
                    String color = fields[7].trim();
                    String size = fields[8].trim();
                    boolean isHealthy = Boolean.parseBoolean(fields[9].trim());
                    // Create Bird object
                    Bird bird = new Bird(type, name, sex, age, 
                    timeAtFacility, breed, weight, color, size, isHealthy);
                    // Add to facility
                    facility.addBird(bird);
                } 
                else 
                {
                    System.out.println(RED + "Invalid bird line: " 
                    + line + RESET);
                }
            }
            System.out.println(GREEN + "Birds loaded successfully." + RESET);
        } 
        catch (IOException e) 
        {
            System.out.println(RED + "Error reading bird CSV: " + 
            e.getMessage() + RESET);
        }
    }

    // Save Facilities to CSV
    public static void saveFacilitiesToCSV(String filePath, 
    ArrayList<Facility> facilities) 
    {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) 
        {
            // Write header
            bw.write("Name,Address,City,State,PhoneNumber");
            bw.newLine();
            for (Facility facility : facilities) {
                String line = String.format("%s,%s,%s,%s,%s",
                    facility.getName(),
                    facility.getAddress(),
                    facility.getCity(),
                    facility.getState(),
                    facility.getPhoneNum());
                bw.write(line);
                bw.newLine();
            }
            System.out.println(GREEN + "Facilities saved successfully to CSV." 
            + RESET);
        } catch (IOException e) 
        {
            System.out.println(RED + "Error writing facilities to CSV: " 
            + e.getMessage() + RESET);
        }
    }

    // Save Dogs to CSV
    public static void saveDogsToCSV(String filePath, Facility facility) 
    {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) 
        {
            // Write header
            bw.write("Type,Name,Sex,Age,TimeAtFacility,Breed,Aggressive," +
            "Fixed,Weight,Microchipped,ChipNum,Color");
            bw.newLine();
            for (Dog dog : facility.getDogs()) {
                String line = String.format
                ("%s,%s,%s,%d,%.2f,%s,%b,%b,%.2f,%b,%d,%s",
                    dog.getType(),
                    dog.getName(),
                    dog.getSex(),
                    dog.getAge(),
                    dog.getTimeAtFacility(),
                    dog.getBreed(),
                    dog.isAggressive(),
                    dog.isFixed(),
                    dog.getWeight(),
                    dog.isMicrochipped(),
                    dog.getChipNum(),
                    dog.getColor());
                bw.write(line);
                bw.newLine();
            }
            System.out.println(GREEN + "Dogs saved successfully to CSV."+RESET);
        } 
        catch (IOException e) 
        {
            System.out.println(RED + "Error writing dogs to CSV: " + 
            e.getMessage() + RESET);
        }
    }

    // Save Cats to CSV
    public static void saveCatsToCSV(String filePath, Facility facility) 
    {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) 
        {
            // Write header
            bw.write("Type,Name,Sex,Age,TimeAtFacility,Breed,Feral,Fixed," +
            "Weight,Microchipped,ChipNum,Color");
            bw.newLine();
            for (Cat cat : facility.getCats()) 
            {
                String line = String.format
                ("%s,%s,%s,%d,%.2f,%s,%b,%b,%.2f,%b,%d,%s",
                    cat.getType(),
                    cat.getName(),
                    cat.getSex(),
                    cat.getAge(),
                    cat.getTimeAtFacility(),
                    cat.getBreed(),
                    cat.isFeral(),
                    cat.isFixed(),
                    cat.getWeight(),
                    cat.isMicrochipped(),
                    cat.getChipNum(),
                    cat.getColor());
                bw.write(line);
                bw.newLine();
            }
            System.out.println(GREEN + "Cats saved successfully to CSV."+RESET);
        } 
        catch (IOException e) 
        {
            System.out.println(RED + "Error writing cats to CSV: " + 
            e.getMessage() + RESET);
        }
    }

    // Save Birds to CSV
    public static void saveBirdsToCSV(String filePath, Facility facility) 
    {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) 
        {
            // Write header
            bw.write("Type,Name,Sex,Age,TimeAtFacility,Breed,Weight,Color,"+
            "Size,Healthy");
            bw.newLine();
            for (Bird bird : facility.getBirds()) 
            {
                String line = String.format
                ("%s,%s,%s,%d,%.2f,%s,%.2f,%s,%s,%b",
                    bird.getType(),
                    bird.getName(),
                    bird.getSex(),
                    bird.getAge(),
                    bird.getTimeAtFacility(),
                    bird.getBreed(),
                    bird.getWeight(),
                    bird.getColor(),
                    bird.getSize(),
                    bird.getHealth());
                bw.write(line);
                bw.newLine();
            }
            System.out.println(GREEN +"Birds saved successfully to CSV."+RESET);
        } 
        catch (IOException e) 
        {
            System.out.println(RED + "Error writing birds to CSV: " 
            + e.getMessage() + RESET);
        }
    }
}
