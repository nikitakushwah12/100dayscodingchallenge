import java.util.Scanner;
class CheckNumAlpha
{
   public static void main(String[]args)
{
  Scanner input = new Scanner(System.in);
   System.out.println("Enter the values :");
   char ch = input.next().charAt(0);
if(ch>='a' && ch<='z' || ch>='A' && ch<='Z' )
{
	System.out.println(" This is a Alaphabet ");
}
else if(ch>='0' && ch<='9')
{
	System.out.println(" This is a Number ");
}
else
     {
	System.out.println("This is a Special character");

     }

}

}