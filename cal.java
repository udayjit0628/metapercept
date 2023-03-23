public class cal
{
private int a;
private int b;
private int c;
private int sum;
private int diff;

public void inoutdata()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the First number: ");
a = sc.nextInt();
System.out.println("Enter the sencond number: ");
b = sc.nextInt();
System.out.println("Enter the Third number: ");
c = sc.nextInt();
}
public void calculate(){
sum = a + b + c;
diff = a - b - c;

}

public void outputdata(){
System.out.println("sum = " +sum);
System.out.println("Diffrence = " +diff);
}
public static void main(String args[]){
Calculate obj = new Calculate();
obj.inputdata();
obj.calculate();
obj.outputdata();

}

}