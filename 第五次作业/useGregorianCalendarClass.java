package fiveth;

import java.util.GregorianCalendar;
public class useGregorianCalendarClass {
	public static void main(String[] args) {
		
		GregorianCalendar object=new GregorianCalendar(2020,4,8);
		
		System.out.println(object.get(GregorianCalendar.YEAR)+"year"
				+ object.get(GregorianCalendar.MONTH)+"month"
				+ object.get(GregorianCalendar.DATE)+"day");
 
		
		object.setTimeInMillis(1234567898765L);
		
		System.out.println(object.get(GregorianCalendar.YEAR)+"year"
				+ object.get(GregorianCalendar.MONTH)+"month"
				+ object.get(GregorianCalendar.DATE)+"day");
		
	}
}
