import java.util.Scanner;

public class Passenger
{
  public void setPassengerSeat(int[][] seats)
  {
    Scanner obj = new Scanner(System.in);
    System.out.println("Above are the current seating arrangements. Please enter the row and column of your desired location (i.e, enter 11): ");
    String seating = obj.nextLine();
    int row = Integer.parseInt(seating.substring(0,1)), col = Integer.parseInt(seating.substring(1,2));
    while(seats[row][col] == 1)
    {
      System.out.println("The location you have chosen is already taken, please enter a different seat: ");
      seating = obj.nextLine();
      row = Integer.parseInt(seating.substring(0,1));
      col = Integer.parseInt(seating.substring(1,2));
    }
    seats[row][col] = 5;
    System.out.println("You have successfully reserved your seating in row " + row + ", column " + col +". Please let us know how we can further assist.");
  }

  // return the string of seating above and determine the price.
}
