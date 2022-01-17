//Classwork 17-01-2021 Monday
/* Tathagata Ghosh - Information Technology - 2020ITB065 - HY */

/*Q.Write a Java program to display the class schedule for “Object Oriented System Design” class for the month of January and February. Use multidimensional arrays to store month, date, day and time.*/

import java.io.*;
class Object_Oriented_System_Designing_Schedule
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the total number of classes in January and February :");
		int n = Integer.parseInt(br.readLine());
		int s[][]= new int[n][5];

		int m[][]= {{31, 6}, {28, 2}, {31, 2}, {30, 5}};
        int d[][]= {{1,1200,1250},{4,1430,1620}};

        int mn= 0;
		int i = 0;
        while(mn<2)
        {
            int dn= m[mn][1];
            for(int day= 1; day<=m[mn][0]; ++day)
            {
                if(dn==1)
                    {
						s[i][0] = mn+1;
						s[i][1] = day;
						s[i][2]= d[0][0];
						s[i][3]= d[0][1];
						s[i][4]= d[0][2];
						i++;
					}
                else if(dn==4)
                    {
						s[i][0] = mn+1;
						s[i][1] = day;
						s[i][2]= d[1][0];
						s[i][3]= d[1][1];
						s[i][4]= d[1][2];
						i++;
					}
                dn= (dn+1)%7;
            }
            mn++;   
        }

		System.out.println("The details of OOSD schedule : ");
		System.out.println("Month \t\tDate \tDay \tArrival Time \tDeparture Time");
		for(i = 0; i<n ; i++)
		{
			System.out.print(((s[i][0]==1)?"January \t":"February \t"));
			System.out.print(s[i][1]+"\t");
			switch(s[i][2])
			{
				case 1: System.out.print("Mon \t");
						break;
				case 2: System.out.print("Tue \t");
						break;
				case 3: System.out.print("Wed \t");
						break;
				case 4: System.out.print("Thur \t");
						break;
				case 5: System.out.print("Fri \t");
						break;
				case 6: System.out.print("Sat \t");
						break;
				case 7: System.out.print("Sun \t");
						break;
			}
			System.out.print(s[i][3]+" \t\t");
			System.out.println(s[i][4]);
		}
	}
}