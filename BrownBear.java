public class BrownBear extends Animal implements Walkable, Swimmable {

  // class fields
  private String subSpecies;

  // empty argument constructor
  public BrownBear() {
    super();
    subSpecies = "Alaskan";
  }

  // preferred constructor
  public BrownBear(int simID, Location location, boolean full, boolean rested, String subSpecies) {
    super.setSimID(simID);
    super.setLocation(location);
    super.setFull(false);
    super.setRested(true);
    validateSubspecies(subSpecies);
    this.subSpecies = subSpecies;
  }

  // GETTERS AND SETTERS
  // getSubSpecies method that returns the subspecies of the brownbear
  public String getSubSpecies() {
    return subSpecies;
  }

  // setSubSpecies that allows the user to set the subspecies of the brownbear
  public void setSubSpecies(String subSpecies) {
    validateSubspecies(subSpecies);
    this.subSpecies = subSpecies;
  }

  // walk method that sets the new coordinates of the brownbear
  @Override
  public void walk(int direction) {
    int newX = getLocation().getXCoord() + (3 * direction);
    int newY = getLocation().getYCoord() + (3 * direction);
    Location newLocation = new Location(newX, newY);
    super.setLocation(newLocation);
  }

  // swim method that sets the new coordinates of the brownbear
  @Override
  public void swim(int direction) {
    int newX = getLocation().getXCoord() + (2 * direction);
    int newY = getLocation().getYCoord() + (2 * direction);
    Location newLocation = new Location(newX, newY);
    super.setLocation(newLocation);
  }

  // validateSubspecies method that validates the correct subspecies of brownbear
  private void validateSubspecies(String subSpecies) {
    if (!(subSpecies == "Alaskan" || subSpecies == "Asiatic" || subSpecies == "European" || subSpecies == "Grizzly"
        || subSpecies == "Kodiak" || subSpecies == "Siberian")) {
      throw new InvalidSubspeciesException(
          "Invalid subspecies; Must be either Alaskan, Asiatic, European, Grizzly, Kodiak, or Siberian,");
    }
  }

  // toString method that returns information about the brownbear
  @Override
  public String toString() {
    return "BrownBear [simID=" + simID + ", location=" + location + ", full=" + full + ", rested=" + rested
        + ", subSpecies=" + subSpecies + "]";
  }

}
