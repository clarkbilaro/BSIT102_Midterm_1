/**
 * @(#)Birthday.java
 *
 * Birthday application
 *
 * @author 
 * @version 1.00 2019/9/3
 */
 import java.util.Scanner;
 import java.util.Date;
 import java.util.Calendar;
 import java.text.SimpleDateFormat;
 import java.util.GregorianCalendar;
public class Birthday {
    
    public static void main(String[] args) throws Exception {
    
    
 		Date date = new Date();
 		SimpleDateFormat format = new SimpleDateFormat("dd-M-yyyy");
 		Calendar calendar = new GregorianCalendar();
 		
 		String input_bday="29-7-1997";
 		Date bday = format.parse(input_bday);
 		
 		int year = calendar.get(Calendar.YEAR);
 		calendar.setTime(bday);
 		int byear = calendar.get(Calendar.YEAR);
 		
 		int age = year-byear;
 		System.out.println("My age: " + age);
    
    
    
    }
}
