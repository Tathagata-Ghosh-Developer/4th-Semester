//Assignment-1 20-01-2021 Thursday
/* Tathagata Ghosh - Information Technology - 2020ITB065 - HY */

/*Q6. Write a Java code to solve a second order linear equation 3x2 + 2x + 5 = 0. Use type casting to realize the solution.*/
import static java.lang.Math.*;  
public class QuadraticEquation
{  
    static void calculateRoots(int a, int b, int c)  
    {
        //comparing the value of a with 0, if a is 0 then the equation is not quadratic   
        if (a == 0)   
        {  
            System.out.println("The value of a cannot be 0.");  
            return;  
        }  

        //calculating discriminant (d)  
        int d = b * b - 4 * a * c;  
        double sqrtval = sqrt(abs(d));

        if (d > 0)   
        {  
            System.out.println("The roots of the equation are real and different. \n");  
            System.out.println((double)(-b + sqrtval) / (2 * a) + "\n"+ (double)(-b - sqrtval) / (2 * a));  
        }

        else if (d == 0)   
        {  
            System.out.println("The roots of the equation are real and same. \n");  
            System.out.println(-(double)b / (2 * a) + "\n"+ -(double)b / (2 * a));  
        }
    
        // executes if d < 0  
        else   
        {  
            System.out.println("The roots of the equation are complex and different. \n");  
            System.out.println(-(double)b / (2 * a) + " + i"+ sqrtval + "\n"+ -(double)b / (2 * a)+ " - i" + sqrtval);  
        }  
    }
    public static void main(String args[])  
    {  
        
        int a = 3, b = 2, c = 5;       
        calculateRoots(a, b, c);   
    }  
}  