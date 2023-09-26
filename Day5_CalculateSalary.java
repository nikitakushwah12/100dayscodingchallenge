import java.util.Scanner;
 class CalculateSalary{
public static void main(String[]args)
{
  Scanner num1= new Scanner(System.in);
  System.out.println("please enter your monthly salary: ");
  double monthlySalary = num1.nextDouble();
  System.out.println("1 day salary: "+(monthlySalary/30));
 }
}
