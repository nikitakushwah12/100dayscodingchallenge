import java. util.Scanner;
class Lanthbreath{
public static void main(String args[])
{
  Scanner sc= new Scanner(System.in);
  
  System.out.println("please enter the length of square");
  float a = sc.nextFloat();
  
  System.out.println("please enter the breath of square");
  float b=sc.nextFloat();
  if (a==b)
  {
   System.out.println("this is square");
  }
  else
  {
   System.out.println("this is not square");
  }
}
}
  