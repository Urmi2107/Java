package FirstDay;
public class Zeroes
{
    public int[] zero(int[] a) 
    {
		
       int k=0;
		int anew[]=new int[a.length];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				anew[k]=a[i];
				k++;
		}
		}
		for(int i=k;i<=a.length-1;i++)
			anew[i]=0;
		for(int i=0;i<a.length;i++)
		{
			System.out.println(anew[i]);
		}
		return anew;
	}
}
	