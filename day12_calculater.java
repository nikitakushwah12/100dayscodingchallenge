import java.util.Scanner;
class Calculater

{
  public static void main(String args[])
 
{
  
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter 1 st number");
 int A = sc.nextInt();
 System.out.println("Enter 2 nd number");
 int B = sc.nextInt();
 System.out.println("choose and enter the type of operation you want to perform\n 1.Addition (+)\n 2.Substraction(-)\n 3.Multiply(*)\n 4.Devide (/)");
 char operation = sc.next().charAt(0);
  if (operation == '+')
  {
    System.out.println("Your Ans is="+(A+B));
  }
else if (operation == '-')

{
   System.out.println("Your Ans is="+(A-B));
 }
  else if (operation == '*')
{
    System.out.println("Your Ans is="+(A*B));
 }
 
else if (operation == '/')

{
  System.out.println("Your Ans is="+(A/B));
}
      
}


}
  