import java.util.Random;

public abstract class Animal {

  // Class fields
  protected int simID;
  protected Location location;
  protected boolean full;
  protected boolean rested;

  // Empty argument constructor
  public Animal() {
    simID = 0;
    location = new Location(0, 0);
    full = false;
    rested = true;
  }

  // Preferred argument constructor
  public Animal(int simID, Location location) {
    validateSimID(simID);
    this.simID = simID;
    this.location = new Location(0, 0);
    this.full = false;
    this.rested = true;
  }

  // GETTERS AND SETTERS
  // getSimID method that returns the simID of the animal
  public int getSimID() {
    return simID;
  }

  // setSimID method that allows the user to set the simID of the animal
  public void setSimID(int simID) {
    validateSimID(simID);
    this.simID = simID;
  }

  // getLocation method that returns the location of the animal
  public Location getLocation() {
    return location;
  }

  // setLocation method that allows the user to set the location of the animal
  public void setLocation(Location location) {
    this.location = location;
  }

  // isFull method that returns a boolean
  public boolean isFull() {
    return full;
  }

  // setFull method that allows the user to set if the animal is full or not
  public void setFull(boolean full) {
    this.full = full;
  }

  // isRested method that returns a boolean
  public boolean isRested() {
    return rested;
  }

  // setRested method that allows the user to set if the animal is rested or not
  public void setRested(boolean rested) {
    this.rested = rested;
  }

  // eat method that sets if the animal is full or not
  public void eat() {
    Random random = new Random();
    double double_random = random.nextDouble();
    if (double_random <= 0.5) {
      setFull(false);
    } else {
      setFull(true);
    }
  }

  // sleep method that sets if the animal is rested or not
  public void sleep() {
    Random random = new Random();
    double double_random = random.nextDouble();
    if (double_random <= 0.5) {
      setRested(false);
    } else {
      setRested(true);
    }
  }

  // validateSimID method that validates the simID of the animal
  private void validateSimID(int simID) {
    if (simID < 0) {
      throw new InvalidSimIDException("simID must be greater than 0");
    }
  }

  // toString method that prints out information about the animal
  @Override
  public String toString() {
    return "Animal [simID=" + simID + ", location=" + location + ", full=" + full + ", rested=" + rested + "]";
  }
}
