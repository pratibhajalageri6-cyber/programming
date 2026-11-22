class Kaprekar
{
	public static void main(String[] args)
	{
		int n=45;
		int sq=n*n;
		int temp=sq;
		int count=0;
		while(sq!=0)
		{
			count++;
			sq=sq/10;
		}
		sq=temp;
		int div=1;
		for(int i=1;i<=count/2;i++)
		{
			div=div*10;
		}
		if(count % 2 != 0)
		{
			div=div*10;
		}
		int last=sq%div;
		int first=sq/div;
		int res=last+first;
		if(n==res)
			System.out.println("Kaprekar num");
		else
			System.out.println("not Kaprekar num");
	}
}