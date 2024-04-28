package java8feautures;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.zone.*;
import java.time.ZonedDateTime;

public class ClassG {
	
	public void m1()
	{
		System.out.println("implementing zoneId's");
		for(String s:ZoneId.getAvailableZoneIds()) {
		System.out.println(s);
		}
	}
	public static void main(String[] args) {
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		System.out.println(ZonedDateTime.now());
		System.out.println(LocalTime.now(ZoneId.of("America/Chicago")));
		new ClassG().m1();
	}

}
