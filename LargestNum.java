class LargestNum
{
	public static void main(String args[])
    {
        int n =893;
		int large=n%10;
		while(n!=0)
		{
			int last=n%10;
			if(last > large)
			{
				large=last;
			}
			n=n/10;
		}
		System.out.println(large);
	}
}