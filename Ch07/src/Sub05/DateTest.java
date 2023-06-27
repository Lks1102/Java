package Sub05;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * 날짜 : 2023/06/27
 * 이름 : 이규석
 * 내용 : Java Date class 실습
 * 
 */
public class DateTest {
	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println("date : " + date);
		
		System.out.println("--------------------------");
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String result = sdf.format(date);
		
		System.out.println("result : " + result);
		
		System.out.println("--------------------------");
		
		Calendar cal = Calendar.getInstance();
		
		int year 	= cal.get(Calendar.YEAR);
		int month 	= cal.get(Calendar.MONTH) + 1;
		int d 		= cal.get(Calendar.DATE);
		int hour 	= cal.get(Calendar.HOUR_OF_DAY);
		int min 	= cal.get(Calendar.MINUTE);
		int sec 	= cal.get(Calendar.SECOND);
		
		System.out.printf("%d-%d-%d %d:%d:%d" , year,month,d,hour,min,sec);
	}
}
