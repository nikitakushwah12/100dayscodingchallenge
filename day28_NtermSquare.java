
import java.util.Scanner;

class squareseries{

public static void main(String args[])
{

Scanner sc = new Scanner(System.in);
System.out.print("Enter the number: ");
int n = sc.nextInt();

int square = 0;

for (int i=2; i<=n; i++)
{
   square = i*i;

System.out.println("square of " + i + " is: " + square);
 }

 }

}