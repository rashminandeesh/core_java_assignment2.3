
public class Maximum {
int a=55,b=79,c=32;
public static void main(String args[])
{
Maximum obj=new Maximum();
obj.display();
}
void display()
{
	if(a>b)
	{
		if(a>c)
			System.out.println("Highest number is:"+a);
		else if(c>a)
			System.out.println("Highest number is:"+c);
	}
	else
		System.out.println("Highest number is:"+b);
	
}
}
