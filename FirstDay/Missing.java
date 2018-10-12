package FirstDay;
class Missing
{
	public  int num(int[] arr)
	{
		
	   for(int i=1;i<=arr.length+1;i++)
	   {
		   int count=0;
		   for(int j=0;j<=arr.length-2;j++)
		   {
			   if(arr[j]==i)
			   {
				   count=1;
				   break;
			   }
		   }
		   if(count==0)
		   {
			   System.out.println("Missing number is:"+i);
			   return i;
			  
		   }
		   
	   }
	   return -1;
	}
}
