import java.util.Scanner;
class UppercaseOrLowercase{
public static void main(String args[]){
	Scanner sc = new Scanner (System.in);
	System.out.println(" Please enter a Character :");
	char ch = sc.next().charAt(0);
if(ch>='a' && ch<='z')
	System.out.println(ch+" --> Is a Lowercase Alphabet");
else if(ch>='A' && ch<='Z')
	System.out.println(ch+" --> Is a Uppercase Alphabet");
else
	System.out.println(ch+" --> Is not a Alphabet");
	}
}