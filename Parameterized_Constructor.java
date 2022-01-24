//Classwork 24-01-2021 Monday
/* Tathagata Ghosh - Information Technology - 2020ITB065 - HY */

/*Q.Write a Java program to create a parameterised constructor in a class to initialise two integer variables and find the average of the two integers creating a class method in the same class.*/

public class Parameterized_Constructor 
{
    int a,b;//global variables

    Parameterized_Constructor(){}//Default constructor

    Parameterized_Constructor(int a, int b)//Parameterised Constructor
    {
        this.a = a;
        this.b = b;
    }

    double average()//member function
    {
        return (a+b)/2.0;
    }

    public static void main(String[] args)
    {
        Parameterized_Constructor p = new Parameterized_Constructor(19,47);
        double avg = p.average();
        System.out.println("Average of "+(p.a)+" and "+(p.b)+" = "+avg);
    }
}
