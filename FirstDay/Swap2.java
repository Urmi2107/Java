package FirstDay;
class Swap2
{
public  int[] interchange(int a,int b) 
{
	int arr[]=new int[2];
  
    System.out.println("Values Before Swapping:a="+a+",b="+b);
  a=a+b;
  b=a-b;
  a=a-b;
  System.out.println("Values After Swapping:a="+a+",b="+b);
  arr[0]=a;
  arr[1]=b;
  return arr;
 }
 }