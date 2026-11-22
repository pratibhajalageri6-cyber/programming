class Spay1
{
	public static boolean isSpay(int n)
	{
		int sum=0,product=1;
		while(n!=0)
		{
			int last=n%10;
			sum=sum+last;
			product=product*last;
			n=n/10;
		}
		if(sum==product)
			return true;
		else
			return false;
	}
}
class SpayRange
{
	public static void main(String args[])
    {
        int start=100,end=200;
		for(int i=start;i<end;i++)
		{
			boolean l=Spay1.isSpay(i);
			if(l==true)
			{
				System.out.println(i);
			}
		}
	}
}