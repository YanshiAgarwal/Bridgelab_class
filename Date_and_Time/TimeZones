package Date_and_Time;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;


public class Time_Zones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss z");
		
		ZonedDateTime currentTime = ZonedDateTime.now();
		System.out.println("Current System Time: " + currentTime.format(formatter));
		
		ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));
		System.out.println("Current Time in GMT: " + gmtTime.format(formatter));
		
		ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Current Time in IST: " + istTime.format(formatter));

        ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println("Current Time in PST: " + pstTime.format(formatter));
	}

}

