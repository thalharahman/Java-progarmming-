package interfaces;


interface laptop
{
	void display();
	
	void battery();
	
	void bill();
	
}
interface pc
{
	void cpu();
	void keybord();
	void mouse();
}
class showroom implements laptop,pc
{
	public void xic()
	{
		System.out.println("hi ");
	}
	public void display()
	{
		System.out.println("15.6 inchs");
	
	}
	public void battery()
	{
		System.out.println("5000 mhs");
		
		
	}
	public void bill()
	{
		System.out.println("i give bill then 1 year warenty");
	}
	public void cpu()
	{
		System.out.println("cpu");
	}
	public void keybord()
	{
		System.out.println("keybord");
	}
	public void mouse()
	{
		System.out.println("its working");
	}
	
}
public class Interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		showroom s=new showroom();
		s.xic();
		s.battery();
		s.bill();
		s.cpu();
		s.display();
		
	}

}
