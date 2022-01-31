//Assignment-1 20-01-2021 Thursday
/* Tathagata Ghosh - Information Technology - 2020ITB065 - HY */

/*Q2. Write a Java program to specify various properties of a Car like type, colour, make, cost, gear type, mileage*/
import java.io.*;
public class Car
{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));;
    String type , color , gearType , make ;
    double cost , mileage ;
    Car()//default constructor
    {}

    Car(String type , String color , double cost , String make , String gearType , double mileage)//parameterized constructor
    {
        this.type = type;
        this.color = color;
        this.cost = cost;
        this.make = make;
        this.gearType = gearType;
        this.mileage = mileage;
    }

    void input()throws IOException
    {
        System.out.println("Input Car Type : ");
        type = br.readLine();
        System.out.println("Input Car Color : ");
        color = br.readLine();
        System.out.println("Input Car Cost : ");
        cost = Double.parseDouble(br.readLine());
        System.out.println("Input Car Make : ");
        make = br.readLine();
        System.out.println("Input Car Gear Type : ");
        gearType = br.readLine();
        System.out.println("Input Car Mileage : ");
        mileage = Double.parseDouble(br.readLine());
    }

    void display()
    {
        System.out.println(" Car Info : \n");
        System.out.println(" Type : " + type + " \n Color : " + color +" \n Cost : " + cost + " \n Make : " + make + " \n Gear Type : " + gearType + " \n Mileage : " + mileage );
    }

    public static void main(String args[])throws IOException
    {
        Car c1 = new Car();
        c1.input();
        c1.display();
        Car c2 = new Car("Two Wheeler","Black",1000000.65,"1995 Classic","Auto",25.6);
        c2.display();
    }
}
