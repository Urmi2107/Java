package FirstDay;
class Common
{
   
    public  String elem(int []ar1,int[]ar2,int[]ar3)
    {
        
        int i = 0, j = 0, k = 0;
        int n1=ar1.length;
        int n2=ar2.length;
        int n3=ar3.length;
        String str="";
		 System.out.println("Common elements are ");
		
        while (i < n1 && j < n2 && k < n3)
        {
            
             if (ar1[i] == ar2[j] && ar2[j] == ar3[k])
             {   
		 System.out.print(ar1[i]+" ");  
		 str+=ar1[i]+" ";
					i++;
					j++; 
					k++; 
					}
 
            
             else if (ar1[i] < ar2[j])
                 i++;
 
            
             else if (ar2[j] < ar3[k])
                 j++;
 
            
             else
                 k++;
        }
      
        return str;
    }
 
        
        
    }
