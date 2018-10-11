package ExceptionExamples;

public class MyDate {
	int day,month,year;
	public MyDate()
	{
		day=0;
		month=0;
		year=0;
	}
	public MyDate(String dt)throws InvalidDayException,InvalidMonthException
	{
		String dt1[]=dt.split("/");
		day=Integer.parseInt(dt1[0]);
		month=Integer.parseInt(dt1[1]);
		year=Integer.parseInt(dt1[2]);
		if(month<1 ||month>12)
			throw new InvalidMonthException("Month should be between 1 and 12");
		
            if((day>=1 && day<=31) && (month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12))
               System.out.println("Valid date");
            else if((day>=1 && day<=30) && (month==4 || month==6 || month==9 || month==11))
            	System.out.println("Valid date");
            else if((day>=1 && day<=28) && (month==2))
            	System.out.println("Valid date");
            else if(day==29 && month==2 && (year%400==0 ||(year%4==0 && year%100!=0)))
            	System.out.println("Valid date");
            else
                throw new InvalidDayException("Day must be within range");
        
		
	}

}
