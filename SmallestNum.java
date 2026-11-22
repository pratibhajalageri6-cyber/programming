class SmallestNum
{
	public static void main(String args[])
    {
        int n =893;
		int small=n%10;
		while(n!=0)
		{
			int last=n%10;
			if(last < small)
			{
				small=last;
			}
			n=n/10;
		}
		System.out.println(small);
	}
}