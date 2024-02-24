import java.util.Scanner;
public class Calculator
{
	private static Integer x = 10;
	private static Integer y = 20;
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args)
	{		
		Integer choice = null;
		do
		{
			showMenu();
			System.out.print("enter your choice:");
			choice = scanner.nextInt();
			operations(choice);
		}while(true);			
	}
	
	private static void showMenu(){
		System.out.println("\n1.Add\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modulo Division\n6.Exit");		
	}
	
	private static void readInput()
	{
		System.out.print("enter x:");
		x = scanner.nextInt();
		System.out.print("enter y:");
		y = scanner.nextInt();		
	}
	
	private static void operations(Integer choice)
	{
		switch(choice){
			case 1 : readInput();System.out.print("Add : " + (x+y));break;
			case 2 : readInput();System.out.print("Sub : " + (x-y));break;
			case 3 : readInput();System.out.print("Multiply : "+ (x*y));break;
			case 4 : readInput();System.out.print("Division");break;
			case 5 : readInput();System.out.print("Modulo");break;
			case 6 : System.exit(0);
			default : System.out.print("Invalid choice");break;
		}
	}
}