public class Location {

  // Class variable members
  private int xCoord;
  private int yCoord;

  // Empty-argument constructor
  public Location() {
    this(0, 0);
  }

  // Preferred constructor
  public Location(int xCoord, int yCoord) {
    validateCoordinates(xCoord, yCoord);
    this.xCoord = xCoord;
    this.yCoord = yCoord;
  }

  // GETTERS AND SETTERS
  // getXCoord method that allows the user to retrieve the x coordinate
  public int getXCoord() {
    return xCoord;
  }

  // setXCoord method that allows the user to set the x coordinate.
  public void setXCoord(int xCoord) {
    if (xCoord < 0) {
      throw new InvalidCoordinateException("X coordinate must be greater than zero");
    }
    this.xCoord = xCoord;
  }

  // getYCoord method that allows the user to retrieve the y coordinate.
  public int getYCoord() {
    return yCoord;
  }

  // setYCoord method that allows the user to set the y coordinate.
  public void setYCoord(int yCoord) {
    if (yCoord < 0) {
      throw new InvalidCoordinateException("Y coordinates must be greater than zero");
    }
    this.yCoord = yCoord;
  }

  // Update method to update the coordinates
  public void update(int xCoord, int yCoord) {
    validateCoordinates(xCoord, yCoord);
    setXCoord(xCoord);
    setYCoord(yCoord);
  }

  // getCoordinates method that will allow the user to retrieve both coordinates
  // in an array.
  public int[] getCoordinates() {
    int[] coordinates = { xCoord, yCoord };
    return coordinates;
  }

  // validateCoordinates helper method that assists in ensuring both coordinates
  // are greater than zero.
  private void validateCoordinates(int xCoord, int yCoord) {
    if (xCoord < 0 || yCoord < 0) {
      throw new InvalidCoordinateException("Both coordinates must be greater than zero");
    }
  }

  // toString method that will print out the class's information
  @Override
  public String toString() {
    return "Location [xCoord=" + xCoord + ", yCoord=" + yCoord + "]";
  }
}
