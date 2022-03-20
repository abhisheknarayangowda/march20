package polymorphism;
class Square 
{
	public void render()
	{
		System.out.println("rendering square.....");
	}
}
class Circle
{
	public void render()
	{
		System.out.println("rendering circle.....");
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Square s1 = new Square();
s1.render();
Circle c1 = new Circle();
c1.render();
	}

}
