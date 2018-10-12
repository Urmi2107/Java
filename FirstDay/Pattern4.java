package FirstDay;

class Pattern4
{
	public  String match4(int n)
	{
		  int ch=65;
		  String str="";
		for(int i=1;i<=n;i++)
		{
			
			for(int j=1;j<=i;j++)
				str+=(char)ch;
			ch=ch+1;
		str+="\n";
		}
		return str;
	}
}