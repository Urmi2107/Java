package FirstDay;
public class Largest
{
    public int[]  large(int []a) 
    {
        
        int arr[] = new int[3];
        int temp=0;
        for (int i = 0; i < a.length; i++) 
        {
            for (int j = i + 1; j < a.length; j++) 
            {
                if (a[i] < a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Largest 3 numbers:");
        
        System.out.print(a[0]+","+a[1]+","+a[2]);
        arr[0]=a[0];
        arr[1]=a[1];
        arr[2]=a[2];
        return arr;
        
    }
}