/* things to implement: displaying the current flight with passengers who have
already booked their tickets and the open seats. use 2D arrays to store open
and booked seat. depending on seating and current capacity, pricing will vary.
cancellations are allowed after creation of ID and reserving a ticket, and fees
will be included for such cancellations.
*/

import java.util.Random;
import java.util.Scanner;

public class AirPlane
{
  public static void main(String[] args)
  {
    Random rand = new Random();
    int[][] plane = fill2DArr(6,4, rand);
    printAirplane(plane);

    Passenger passenger = new Passenger();
    passenger.setPassengerSeat(plane);
    printAirplane(plane);
  }

  private static int[][] fill2DArr(int row, int col, Random rand)
  {
    int[][] seats = new int[row][col];
    double toBeFilled = (row*col)*.75;
    int preFilledSeats = rand.nextInt((int) toBeFilled);
    int currentlyFilledSeats = 0;
    for(int r = 0; r < seats.length; r++)
    {
      for(int c = 0; c < seats[0].length; c++)
      {
        if(currentlyFilledSeats < preFilledSeats)
        {
          int canFill = rand.nextInt(2);
          if(canFill == 1)
          {
            seats[r][c] = 1;
            currentlyFilledSeats ++;
          }
        }
      }
    }
    return seats;
  }

  private static void printAirplane(int[][] seats)
  {
    String output = "";
    for(int r = 0; r < seats.length; r++)
    {
      for(int c = 0; c < seats[0].length; c++)
      {
        if(c == seats[0].length - 1) { output += String.valueOf(seats[r][c]) + "]\n";}
        else if(c == 0) { output += "[" + String.valueOf(seats[r][c]) + ", ";}
        else{ output += String.valueOf(seats[r][c]) + ", ";}
      }
    }
    System.out.println(output);
  }
}
