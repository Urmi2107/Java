package FirstDay;
class Students
{
public int count( int [] a ) 
{
  
 
  int count=0;
  for(int i=0;i<20;i++)
  {
		
		if(a[i]>=86)
		count=count+1;
  }
  
  System.out.println("Total number of Students is ="+count);
  return count;
 }
 }