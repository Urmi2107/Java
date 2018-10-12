package FirstDay;

class Pattern3
{
	public  String  match3(int n)
	{
		String str="";
		for(int i=n;i>=1;i--)
		{
			
			for(int j=1;j<=i;j++)
				str+="*";
			
		str+="\n";
		}
		return str;
		
	}
}