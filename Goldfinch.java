public class Goldfinch extends Animal implements Walkable, Flyable {

  // class fields
  private double wingSpan;

  // empty argument constructor
  public Goldfinch() {
    super();
    wingSpan = 9.0;
  }

  // preferred constructor
  public Goldfinch(int simID, Location location, boolean full, boolean rested, double wingSpan) {
    super.setSimID(simID);
    super.setLocation(location);
    super.setFull(false);
    super.setRested(true);
    validateWingSpan(wingSpan);
    this.wingSpan = wingSpan;
  }

  // getWingSpan method that returns the wingspan to the user
  public double getWingSpan() {
    return wingSpan;
  }

  // setWingSpan method that allows the user to set the wingspan
  public void setWingSpan(double wingSpan) {
    validateWingSpan(wingSpan);
    this.wingSpan = wingSpan;
  }

  // walk method that sets the new location of the goldfinch
  @Override
  public void walk(int direction) {
    int newX = getLocation().getXCoord() + (1 * direction);
    int newY = getLocation().getYCoord() + (1 * direction);
    Location newLocation = new Location(newX, newY);
    setLocation(newLocation);
  }

  // fly method that sets the new location of the goldfinch
  @Override
  public void fly(Location location) {
    super.setLocation(location);
  }

  // validateWingSpan method that allows the user to check if the wingspan is
  // correct
  private void validateWingSpan(double wingSpan) {
    if (!(wingSpan >= 5.0 && wingSpan <= 11.0)) {
      throw new InvalidWingspanException("Invalid wingspan, must be between 5.0 and 11.0");
    }
  }

  // toString method that returns information about the goldfinch
  @Override
  public String toString() {
    return "Goldfinch [simID=" + simID + ", location=" + location + ", full=" + full + ", rested=" + rested
        + ", wingSpan=" + wingSpan + "]";
  }
}
