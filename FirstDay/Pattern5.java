package FirstDay;

class Pattern5
{
	public  String match5(int n)
	{
		String str="";
		for(int i=1;i<=n;i++)
		{
			
			for(int j=i;j<=n-1;j++)
				str+=" ";
		  for(int j=1;j<=i;j++)
			  str+="*";
			
		str+="\n";
		}
		return str;
	}
}