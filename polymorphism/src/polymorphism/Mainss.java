package polymorphism;
class Pattern
{
	public void display()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("*");
		}
	}
	public void display(char symbol)
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("symbol");
		}
	}
}
public class Mainss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Pattern d1 = new Pattern();
d1.display();
System.out.println("\n");
d1.display('#');
	}

}
