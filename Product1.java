class Product1
{
	public static void main(String[] args)
	{
		int n=1234,product=1;
		while(n!=0)
		{
		int last=n%10;
		product=product*last;
		n=n/10;
		}
		System.out.println(product);
	}
}