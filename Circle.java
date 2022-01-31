//Assignment-1 20-01-2021 Thursday
/* Tathagata Ghosh - Information Technology - 2020ITB065 - HY */

/*Q3. Write a Java program to find area and perimeter of a circle using class. The class will have different methods to compute area and perimeter separately. Print the values of area and perimeter.*/
import java.io.*;
public class Circle 
{
    double radius;
    Circle(){}

    Circle(double radius)
    {
        this.radius = radius;
    }
    
    void input()throws IOException
    {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        System.out.print("Input Radius : ");
        radius = Double.parseDouble(br.readLine());
    }
    double area()
    {
        return ( Math.PI * radius * radius );
    }

    double perimeter()
    {
        return ( 2.0 * Math.PI * radius );
    }

    void show()
    {
        System.out.println("Radius : " + radius);
        System.out.println("Perimeter : " + this.perimeter());
        System.out.println("Area : " + this.area());
    }

    public static void main( String args[] )throws IOException
    {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        
        Circle c1 = new Circle();
        c1.input();
        c1.show();

        Circle c2 = new Circle(25.0);
        c2.show();
    }
}
