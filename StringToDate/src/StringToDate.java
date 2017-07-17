import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class StringToDate {
	 @SuppressWarnings("resource")
	public static void main(String args[]) throws ParseException{
		 
		 System.out.println("Enter format No. from 1 to 3");
		 Scanner sc = new Scanner(System.in);
		 int i = sc.nextInt();
		 if( i == 1)
		 {
			 String input = "Jan 24 2017";
			 System.out.println("The Input date is "+ input);
			 SimpleDateFormat format = new SimpleDateFormat("MMM dd yyyy");
			 Date date = format.parse(input);
			 Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
			 calendar.setTime(date);
			 System.out.println(calendar.get(Calendar.YEAR)+"-"+ calendar.get(Calendar.DAY_OF_MONTH)+"-" + new SimpleDateFormat("MMM").format(calendar.getTime())) ;
		 }
		 
		 if(i == 2)
		 {
			 String input = "Jan,24,2017";
			 System.out.println("The Input date is "+ input);
			 SimpleDateFormat format = new SimpleDateFormat("MMM,dd,yyyy");
			 Date date = format.parse(input);
			 Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
			 calendar.setTime(date);
			 System.out.println(calendar.get(Calendar.YEAR)+"-"+ calendar.get(Calendar.DAY_OF_MONTH)+"-" + new SimpleDateFormat("MMM").format(calendar.getTime())) ;
		 }
		 
		 if(i == 3)
		 {
			 String input = "Jan, 24, 2017";
			 System.out.println("The Input date is "+ input);
			 SimpleDateFormat format = new SimpleDateFormat("MMM, dd, yyyy");
			 Date date = format.parse(input);
			 Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
			 calendar.setTime(date);
			 System.out.println(calendar.get(Calendar.YEAR)+"-"+ calendar.get(Calendar.DAY_OF_MONTH)+"-" + new SimpleDateFormat("MMM").format(calendar.getTime())) ;
			 
		 }
    }
	
}
	