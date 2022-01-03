class recursive6_1
{
	public static void main(String[] args)
	{
		int a=4;
		System.out.println("a=4");
		int b=6;
		System.out.println("b=6");
		System.out.println("a*b="+mult(a,b));
		System.out.println();
		a=9;
		System.out.println("a=9");
		b=13;
		System.out.println("b=13");
		System.out.println("a*b="+mult(a,b));
		System.out.println();
		a=36;
		System.out.println("a=36");
		b=2;
		System.out.println("b=2");
		System.out.println("a*b="+mult(a,b));


	}
	public static int mult(int a, int b)
	{
		if(b==1)
		{
			return(a);
		}
		else
		{
			return(a+mult(a,b-1));
		}
	}
}