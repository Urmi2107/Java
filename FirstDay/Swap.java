package FirstDay;
class Swap
{
public  int[] interchange(int a,int b) 
{
  
  int arr[]=new int[2];
  System.out.println("Values Before Swapping:a="+a+",b="+b);
  int c=a;
  a=b;
  b=c;
  arr[0]=a;
  arr[1]=b;
  System.out.println("Values After Swapping:a="+a+",b="+b);
  return arr;
 }
 }