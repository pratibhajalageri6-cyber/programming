class Automarphic
{
	public static void main(String[] args)
	{
		int n=25;
		int sq=n*n;
		while(sq!=0)
		{
			int l1=n%10;
			int l2=sq%10;
			if(l1==l2)
			{
				System.out.println("not Automarphic");
			}
			n=n/10;
			sq=sq/10;
		}
		System.out.println("Automarphic");
	}
}
			
