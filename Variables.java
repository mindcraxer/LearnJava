import java.lang.*;

class Variables
{
	public static void main(String arg[])
	/*{
		byte b=5;
		System.out.println(b);
		b=25;
		System.out.println(b);
	}*/
	
	/*{
		byte b=130;     // error: incompatible types: possible lossy conversion from int to byte byte b=130;
		System.out.println(b);
	}*/
	
	/*{
		int b=130;
		System.out.println(b);
	}*/
	
	{
		byte b=127;
		short s=300;
		int i=20000;
		
		float f=25.3f;
		char c='A';
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(f);
		System.out.println(c);
	}
}