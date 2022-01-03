class recursive6_2
{
	public static void main(String[] args)
	{
		int a=4;
		System.out.println("a=4");
		int b=6;
		System.out.println("b=6");
		System.out.println("a*b="+pow(a,b));
		System.out.println();
		a=3;
		System.out.println("a=3");
		b=3;
		System.out.println("b=3");
		System.out.println("a*b="+pow(a,b));
		System.out.println();
		a=36;
		System.out.println("a=36");
		b=2;
		System.out.println("b=2");
		System.out.println("a*b="+pow(a,b));


	}
	public static int pow(int a, int b)
	{
		if(b==1)
		{
			return(a);
		}
		else
		{
			return(a*pow(a,b-1));
		}
	}
}