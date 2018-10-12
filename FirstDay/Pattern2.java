package FirstDay;

class Pattern2
{
	public  String match2(int n)
	{
		String str="";
		for(int i=1;i<=n;i++)
		{
			
			for(int j=1;j<=i;j++)
				str+=j;
			
		str+="\n";
		}
		return str;
	}
}