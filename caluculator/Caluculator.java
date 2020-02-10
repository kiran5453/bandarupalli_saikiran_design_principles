package caluculator;
import java.util.Scanner;
public class Caluculator extends Operations{
	public static void main(String[] args)
	{
		float num1,num2;
		int ch;
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.print("Enter the two numbers:\nNumber1:");
			num1=sc.nextFloat();
			System.out.print("Number2:");
			num2=sc.nextFloat();
			float op[]= {add(num1,num2),sub(num1,num2),mul(num1,num2),div(num1,num2)};
			System.out.println("Operations:\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n");
			System.out.print("Enter the operation to be performed:");
			ch=sc.nextInt();
			if(ch<1 || ch>=5)
			{
				System.out.println("Invalid choice......\nProgram Terminated");
				return;
			}
			else
			{
				System.out.println("Result is : "+op[ch-1]);
			}
			System.out.println("Do you want to continue:\n1.Yes\n2.No\nEnter your choice:");
			int ch1=sc.nextInt();
			if(ch1==2)
			{
				System.out.println("Task completed Successfully");
				return;
			}
		}
	}
}
