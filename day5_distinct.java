import java.util.Scanner;
class Distinnumber{
public static void main(String args[]){
Scanner input1= new Scanner(System.in);
System.out.println("please enter english subject marks:");
double englishMarks=input1.nextDouble();
System.out.println("please enter hindi subject marks:");
double hindiMarks=input1.nextDouble();
System.out.println("please enter maths subject marks:");
double mathsMarks=input1.nextDouble();
if(englishMarks>=75){
    System.out.println("you get distinct in english:"+englishMarks);
   }
if(hindiMarks>=75){
    System.out.println("you get distinct in hindi:"+hindiMarks);
   }
if(mathsMarks>=75){
    System.out.println("you get distinct in maths:"+mathsMarks);
   }
}
}


