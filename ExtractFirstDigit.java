class ExtractFirstDigit
{
	public static void main(String[] args)
	{
		int n=8923;
		while(n>9)
		{
			n=n/10;
		}
		System.out.println(n);
	}
}