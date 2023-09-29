import java.util.Scanner;
class Weekname{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("please enter the week number :- ");
int num =sc.nextInt();

     if(num==0)
     System.out.println(num+" :monday");
     else if(num==1)
     System.out.println(num+" :tuesday");
     else if(num==2)
     System.out.println(num+" :wednesday");
     else if(num==3)
     System.out.println(num+" :thursday");
     else if(num==4)
     System.out.println(num+" :friday");
     else if(num==5)
     System.out.println(num+" :saturday");
     else if(num==6) 
     System.out.println(num+" :sunday");
     else 
     System.out.println("week number is wrong");
  }
}