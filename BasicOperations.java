//Assignment-1 20-01-2021 Thursday
/* Tathagata Ghosh - Information Technology - 2020ITB065 - HY */

/*Q4. Write a Java code to overload constructors using automatic type conversion.*/
public class BasicOperations
{
    double a,b;
    BasicOperations(){}
    BasicOperations(int a,int b)
    {
        this.a = a;
        this.b = b;
    }
    BasicOperations(double a,double b)
    {
        this.a = a;
        this.b = b;
    }
    BasicOperations(double a,int b)
    {
        this.a = a;
        this.b = b;
    }
    BasicOperations(int a,double b)
    {
        this.a = a;
        this.b = b;
    }

    void add()
    {
        System.out.println("Sum = " + (a+b) );
    }
    void dif()
    {
        System.out.println("Difference = " + (b-a) );
    }

    public static void main(String[] args) 
    {
        BasicOperations b1 = new BasicOperations(5.0,6);
        BasicOperations b2 = new BasicOperations(9,6);
        b1.dif();
        b2.add();
    }
}


