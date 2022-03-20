package polymorphism;
class Language 
{
	public void displayInfo()
	{
		System.out.println("Swami Vivekananda founder of Ramakrishna matt/mission ");
	}
}
class Java extends Language
{
	@Override
	public void displayInfo()
	{
		System.out.println("Swami Brahmananda was the 1st president of Ramakrishna matt/mission ");
	}
}
public class Mains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Java j1 = new Java();
j1.displayInfo();
Language l1 = new Language();
l1.displayInfo();
	}

}
