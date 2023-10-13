import java.util.Scanner;
class Digit
{
public static void main(String args[])
{
long n,sum;
    Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
n=sc.nextLong();
for(sum=0 ; n!=0 ; n/=10)
{
sum+=n%10;
}
System.out.println("sum of digit of a number is "+sum);
}
}