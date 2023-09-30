import java.util.Scanner;
class triangle{
public static void main (String args[])
{
 Scanner sc = new Scanner (System.in);
 System.out.println(" please enter the 1st angle => ");
 int angle1 = sc.nextInt();
 System.out.println(" please enter the 2nd angle => ");
 int angle2 = sc.nextInt();
 System.out.println(" please enter the 3rd angle => ");
 int angle3 = sc.nextInt();
 
 if((angle1+angle2+angle3)==180)
 {
  System.out.println(" the triangleis valid");
 }
 else
 {
 System.out.println(" the triangleis is not valid"); 
 }
}
}