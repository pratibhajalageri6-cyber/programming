class Harshad
{
	public static void main(String[] args)
	{
		int n=18,temp=n,sum=0;
		while(n!=0)
		{
			int last=n%10;
			sum=sum+last;
			n=n/10;
		}
		if(temp%sum==0)
		{
		System.out.println(sum);
		}
	}
}