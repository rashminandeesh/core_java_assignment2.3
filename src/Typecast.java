
public class Typecast {
byte b=10;
short s=20;
int i;
long l;
float f;
double d;


public static void main(String args[])
{
	Typecast obj=new Typecast();
	obj.display();
}

	void display()
	{
	i=b+s;
	System.out.println("sum b and s:"+i);
	l=i+s;
	System.out.println("sum i and s:"+l);
	f=i+l;
	System.out.println("sum i and l:"+f);
	d=i+f;
	System.out.println("sum i and f:"+d);
	b=(byte)(i+(int)d);
	System.out.println("sum i and d:"+b);
	d=i+b;
	System.out.println("sum i and b:"+d);
	i=(int)d+b;
	System.out.println("sum d and b:"+i);
	f=(float)d+i;
	System.out.println("sum d and i:"+f);
	}
}