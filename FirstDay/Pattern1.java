package FirstDay;

class Pattern1
{
	public  String  match1(int n)
	{
		String str="";
        
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n-1;j++)
				str+=" ";
			for(int k=1;k<=i;k++)
				str+=k;
			for(int j=i-1;j>=1;j--)
				str+=j;
		str+="\n";
		}
	return str;
	}
}