package apcsafrq.frq2019.question1;

public class APCalendarTest {

	public static void main(String[] args) {
		//APCalendar apCalendar=new APCalendar();
		//���� 2000~2100���������
		int leapYears = APCalendar.numberOfLeapYears(1900, 2100);
		System.out.println(leapYears);
		
		System.out.println(APCalendar.dayOfWeek(2, 1, 2022));
	}

}
