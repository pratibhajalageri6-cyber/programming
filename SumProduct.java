class SumProduct
{
	public static void main(String[] args)
	{
		int n=19,sum=0;
		int product=1;
		while(n!=0)
		{
			int last=n%10;
			sum=sum+last;
			product=product*last;
			n=n/10;
		}
		System.out.println(sum);
		System.out.println(product);
		
		if(int result==n)
		System.out.println("Special 2 digit number);
		else
		System.out.println("Not Special 2 digit number);
	}
}