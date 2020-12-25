package chapter_2;

public class ShowCurrentTime {
	public static void main(String[] args) {
		long totalMilliseconds = System.currentTimeMillis();
		
		long totalSeconds = totalMilliseconds / 1000;
		
		long currentSecond = totalSeconds % 60;
		
		long totalMinutes = totalSeconds / 60;
		
		long currentMinute = totalMinutes % 60;
		
		long totalHours = totalMinutes / 60;
		
		long currentHours = totalHours % 24;
		
		System.out.println("Current time is " + currentHours + ":" + currentMinute + ":" + currentSecond + "GMT");
	}
}
