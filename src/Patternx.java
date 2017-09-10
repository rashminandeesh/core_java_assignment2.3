import project2.Patternx;

public class Patternx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patternx obj1=new Patternx();
		obj1.display(2);
		 
			}
			public void display(int row)
			{
				 int i,j;
				for(i=1;i<=(row*2+1);i++)
				{
					for(j=0;j<=(row*2+1);j++)
					{
						if(i==j)
						{
							System.out.print("*");
						}
						else if(i+j==(row*2+2))
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
						}
					}
					System.out.println();
				}
	}

}
