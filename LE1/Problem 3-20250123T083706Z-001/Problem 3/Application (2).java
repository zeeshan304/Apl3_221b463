
public class Application
{
	public static void main(String[] args) {
		//overriding
		
		Mother m=new Mother();
		m.show();
		Child ch=new Child();
		ch.show();
		Mother m1=new Child();
		m1.show();
	}
}
