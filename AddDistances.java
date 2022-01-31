//Assignment-1 20-01-2021 Thursday
/* Tathagata Ghosh - Information Technology - 2020ITB065 - HY */

/*Q3. Write a Java program to add two distances using class method.*/

import java.util.*;

//class Distance to read, print and add distance
class Distance 
{
  int m;
  int cm;

  public void getDistance() 
  {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter meter : ");
    m = sc.nextInt();
    System.out.print("Enter centimeter: ");
    cm = sc.nextInt();
  }

  public void showDistance() 
  {
    System.out.println(m + "m," + cm + "cm");
  }

  public void addDistance(Distance D1, Distance D2) 
  {
    cm = D1.cm + D2.cm;
    m = D1.m + D2.m + (cm / 100);
    cm = cm % 100;
  }
}

public class AddDistances 
{
  public static void main(String[] s) 
  {
      Distance D1 = new Distance();
      Distance D2 = new Distance();
      Distance D3 = new Distance();

      //read first distance
      System.out.println("Enter first distance: ");
      D1.getDistance();

      //read second distance
      System.out.println("Enter second distance: ");
      D2.getDistance();

      //add distances
      D3.addDistance(D1, D2);
      //print distance
      System.out.println("Total distance is:");
      D3.showDistance();
    }
}