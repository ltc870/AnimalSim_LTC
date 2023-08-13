import java.util.*;

public class Application {

  public static void main(String[] args) {

    // *********************************************
    // Location Tests
    // *********************************************
    System.out.println(
        "*********************************************\n\t\tLocation Tests\n*********************************************");

    // preferred constructor
    // InvalidCoordinationException
    try {
      Location location1 = new Location(5, 10);
      System.out.println(Arrays.toString(location1.getCoordinates()));
      location1.update(-11, 12);
      System.out.println(Arrays.toString(location1.getCoordinates()));
    } catch (InvalidCoordinateException err) {
      System.out.println("Exception caught: " + err.getMessage());
    }

    // empty argument constructor
    // InvalidCoordinationException
    try {
      Location location2 = new Location();
      location2.setXCoord(5);
      location2.setYCoord(5);
      System.out.println(Arrays.toString(location2.getCoordinates()));
    } catch (InvalidCoordinateException err) {
      System.out.println("Exception caught: " + err.getMessage());
    }

    System.out.println();

    // *********************************************
    // Animal Tests
    // *********************************************
    System.out.println(
        "*********************************************\n\t\tAnimal Tests\n*********************************************");

    // This is to show that the Animal class cannot be instantiated!!!
    // Animal animal = new Animal();

    System.out.println("Animal class cannot be instantiated!!");

    System.out.println();

    // *********************************************
    // Goldfinch Tests
    // *********************************************
    System.out.println(
        "*********************************************\n\t\tGoldfinch Tests\n*********************************************");

    // empty argument constructor
    // InvalidSimIDException
    try {
      Goldfinch goldfinch1 = new Goldfinch();
      goldfinch1.setSimID(-1);
      System.out.println(goldfinch1.getSimID());
    } catch (InvalidSimIDException err) {
      System.out.println("Exception caught: " + err.getMessage());
    }

    Goldfinch goldfinch2 = new Goldfinch();
    Location gfLocation1 = new Location(10, 20);
    goldfinch2.setSimID(1);
    System.out.println("The goldfinch2 sim ID is: " + goldfinch2.getSimID());
    goldfinch2.setLocation(gfLocation1);
    System.out.println("The goldfinch2 first location is: " + goldfinch2.getLocation());
    Location gfLocation2 = new Location(11, 12);
    goldfinch2.fly(gfLocation2);
    System.out.println("The goldfinch2 second location is: " + goldfinch2.getLocation());
    goldfinch2.walk(2);
    System.out.println("The goldfinch2 third location is: " + goldfinch2.getLocation());
    goldfinch2.eat();
    System.out.println("Is the goldfinch2 full?: " + goldfinch2.isFull());
    goldfinch2.sleep();
    System.out.println("Is the goldfinch2 rested?: " + goldfinch2.isRested());
    System.out.println("What's the goldfinch2 wingspan: " + goldfinch2.getWingSpan());

    // InvalidWingspanException
    try {
      Goldfinch goldFinch3 = new Goldfinch();
      goldFinch3.setWingSpan(4);
      System.out.println(goldFinch3.getWingSpan());
    } catch (InvalidWingspanException err) {
      System.out.println("Exception caught: " + err.getMessage());
    }

    // preferred constructor
    // InvalidSimIdException
    try {
      Goldfinch goldfinch4 = new Goldfinch(-2, gfLocation2, false, true, 9);
      System.out.println(goldfinch4.getSimID());
    } catch (InvalidSimIDException err) {
      System.out.println("Exception caught: " + err.getMessage());
    }

    Goldfinch goldfinch5 = new Goldfinch(2, new Location(2, 4), false, true, 9.5);
    System.out.println("The goldfinch5 simID is: " + goldfinch5.getSimID());
    System.out.println("The goldfinch5 first location is: " + goldfinch5.getLocation());
    Location gfLocation4 = new Location(5, 6);
    goldfinch5.fly(gfLocation4);
    System.out.println("The goldfinch5 second location is: " + goldfinch5.getLocation());
    goldfinch5.walk(3);
    System.out.println("The goldfinch5 third location is: " + goldfinch5.getLocation());
    System.out.println("Is the goldfinch5 full?: " + goldfinch5.isFull());
    System.out.println("Is the goldfinch5 rested?:" + goldfinch5.isRested());
    System.out.println("What's the goldfinch5 wingspan: " + goldfinch5.getWingSpan());

    // InvalidWingspanException
    try {
      Goldfinch goldfinch6 = new Goldfinch(2, new Location(2, 4), false, true, 12);
      System.out.println(goldfinch6.getWingSpan());
    } catch (InvalidWingspanException err) {
      System.out.println("Exception caught: " + err.getMessage());
    }

    System.out.println();

    // *********************************************
    // BrownBear Tests
    // *********************************************
    System.out.println(
        "*********************************************\n\t\tBrownBear Tests\n*********************************************");

    // empty argument constructor
    BrownBear brownBear2 = new BrownBear();
    Location bbLocation = new Location(5, 6);
    brownBear2.setSimID(3);
    System.out.println("The brownbear1 simID is: " + brownBear2.getSimID());
    brownBear2.setSubSpecies("Grizzly");
    System.out.println("The brownbear1 subspecies is: " + brownBear2.getSubSpecies());
    brownBear2.setLocation(bbLocation);
    System.out.println("The brownbear1 first location is: " + brownBear2.getLocation());
    brownBear2.walk(2);
    System.out.println("The brownbear1 second location is: " + brownBear2.getLocation());
    brownBear2.swim(1);
    System.out.println("The brownbear1 third location is: " + brownBear2.getLocation());
    brownBear2.eat();
    System.out.println("Is the brownbear1 full?: " + brownBear2.isFull());
    brownBear2.sleep();
    System.out.println("Did the brownbear1 get enough sleep?: " + brownBear2.isRested());

    // InvalidSubspeciesException
    try {
      BrownBear brownBear3 = new BrownBear();
      brownBear3.setSubSpecies("Japanese");
    } catch (InvalidSubspeciesException err) {
      System.out.println("Exception caught: " + err.getMessage());
    }

    // preferred constructor
    BrownBear brownBear4 = new BrownBear(4, new Location(3, 4), false, true, "European");
    System.out.println("The brownbear3 simID is: " + brownBear4.getSimID());
    System.out.println("The brownbear3 subspecies is: " + brownBear4.getSubSpecies());
    System.out.println("The brownbear3 first location is: " + brownBear4.getLocation());
    brownBear4.walk(3);
    System.out.println("The brownbear3 second location is: " + brownBear4.getLocation());
    brownBear4.swim(2);
    System.out.println("The brownbear3 third location is: " + brownBear4.getLocation());
    System.out.println("Is the brownbear3 full?: " + brownBear4.isFull());
    System.out.println("Is the brownbear3 rested?: " + brownBear4.isRested());

    // InvalidSubspeciesException
    try {
      BrownBear brownBear5 = new BrownBear(4, new Location(3, 4), false, true, "Korean");
      System.out.println(brownBear5.getSubSpecies());
    } catch (InvalidSubspeciesException err) {
      System.out.println("Exception caught: " + err.getMessage());
    }

    System.out.println();

    // *********************************************
    // Generics Tests
    // *********************************************
    System.out.println(
        "*********************************************\n\t\tGenerics Tests\n*********************************************");
    ArrayList<Animal> animalList = new ArrayList<>();

    // Adding the brown bears to the list
    animalList.add(new BrownBear(5, new Location(2, 2), false, true, "Asiatic"));
    animalList.add(new BrownBear(6, new Location(3, 3), false, true, "Kodiak"));

    // Adding the goldfinches to the list
    animalList.add(new Goldfinch(7, new Location(2, 2), false, true, 10));
    animalList.add(new Goldfinch(8, new Location(3, 3), false, true, 11));

    // Using the for loop to print out the animals
    for (Animal animal : animalList) {
      System.out.println(animal.toString());
    }
  }
}