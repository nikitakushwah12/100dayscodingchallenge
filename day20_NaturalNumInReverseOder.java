import java.util.Scanner;
class naturalnumber{
public static void main(String args[])
{
  System.out.println("Enter a natural number form that you went to print reverse order");
 Scanner sc= new Scanner(System.in);
int n=sc.nextInt();
for(int i=n;i>=0;i--)
{
   System.out.println(i);
}}}