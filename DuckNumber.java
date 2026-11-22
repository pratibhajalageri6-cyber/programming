class DuckNumber
{
	public static void main(String[] args)
	{
		int n=1025;
		while(n!=0)
		{
			int last=n%10;
			if(last==0)
			{
				System.out.println("Duck Number");
				break;
			}
			n=n/10;
		}
		System.out.println("not Duck Number");
	}
}