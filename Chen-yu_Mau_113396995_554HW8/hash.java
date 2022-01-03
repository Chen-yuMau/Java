class Hash
{
	private String[]S table;
	public Hash(int a) // constructor
	{
		table = new String[26]; 
	}
	public save(String a)
	{
		char c = a[0];
		int b = c;
		table[b] = a;
	}
	public read(int a)
	{
		System.out.println(table[a]);
	}
}