import java.util.Scanner;
class DaysInMonth{
public static void main(String args[])
{
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the month number => ");
 int m =sc.nextInt();
 if(m==1)
{
  System.out.println("january = 31 days in january");
  }
else if(m==2)
  {
  System.out.println("feburary = 28 days in feburary  ");
  }
 else if(m==3)
  {
  System.out.println("march = 31 days in march ");
  }
 else if(m==4)
  {
  System.out.println("April = 30 days in April ");
  }
 else if(m==5)
  {
  System.out.println("May = 31 days in May");
  }
 else if(m==6)
  {
  System.out.println("June = 30 days in June");
  }
 else if(m==7)
  {
  System.out.println("July = 31 days in July");
  }
 else if(m==8)
  {
  System.out.println("August = 31 days in August ");
  }
 else if(m==9)
  {
  System.out.println("September = 30 days in September ");
  }
 else if(m==10)
  {
  System.out.println("October = 31 days in October");
  }
 else if(m==11)
  {
  System.out.println("November = 30 days in November");
  }
 else if(m==12)
  {
  System.out.println("December = 31 days in December ");
  }
  else
{
System.out.println("Invalid month number");
}
  }
}