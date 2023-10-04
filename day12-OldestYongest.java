import java.util.Scanner;
class YoungestOldest
{
    public static void main(String args[])
    {

     Scanner input= new Scanner(System.in);
     System.out.print("Enter the Age of bhavesh <<<...");
     int age1 =input.nextInt();
     System.out.print("Enter the Age of siya <<<...");
     int age2 =input.nextInt();
      System.out.print("Enter the Age of vedu <<<...");
     int age3 =input.nextInt();
     if(age1<age2 && age1<age3)
             System.out.print("The youngest Age is bhavesh");
     else if(age2<age1 && age2<age3)
             System.out.print("The youngest Age is siya");
     else 
           
             System.out.print("The youngest Age is vedu");
        }
           
}

