import java.util.Scanner;
class largestNumber
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter the first number <<<....");
int num1 = sc.nextInt();
System.out.print("Enter the second number <<<....");
int num2 = sc.nextInt();
System.out.print("Enter the third number <<<....");
int num3 = sc.nextInt();
System.out.print("Enter the fourth number <<<....");
int num4 = sc.nextInt();

if(num1>num2 && num2>num3 && num1>num4)
System.out.println("The Largest number is <<<...."+num1);

else if(num2>num1 && num2>num3 && num2>num4)
  System.out.println("The Largest number is <<<...."+num2);

else if(num3>num1 && num3>num2 && num3>num4)
  System.out.println("The Largest number is <<<...."+num3);
 
 else
    System.out.println("The Largest number is <<<...."+num4);
  }
}


   
   