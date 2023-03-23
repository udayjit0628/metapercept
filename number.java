import java.util.Scanner;

public class number
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);

System.out.println("Enter email");

String str = sc.nextLine();

String reversestr = "";

for(int i = str.length()-1; i >= 0; i--)
{
reversestr = reversestr + str.charAt(i);

}

if(str.equals(reversestr )){

System.out.println("student01@gmail.com");

}
else{

System.out.println("Valid Email Id");

}

}
}