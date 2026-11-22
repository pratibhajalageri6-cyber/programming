class 2ndLargestNum
{
	public static void main(String args[])
    {
        int n =893;
		int l=0,sl=0;
		while(n!=0)
		{
			int last=n%10;
			if(last > l)
			{
				sl=l;
				l=last;
			}
			else if(last < l && last > sl)
			{
				sl=last;
			}
			n=n/10;
		}
		System.out.println(sl);
	}
}