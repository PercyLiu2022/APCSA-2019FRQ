package apcsafrq.frq2019.question1;

public class APCalendar {
	/** Returns true if year is a leap year and false otherwise. */
	private static boolean isLeapYear(int yearNumber) {
		if (yearNumber % 4 != 0){
    		return false;
    	}
		
    	if (yearNumber % 100 == 0 && yearNumber % 400 != 0) {
    		return false; 
    	}
    	
    	return true;
	}

	/**
	 * @Returns the number of leap years between year1 and year2, inclusive.
	 * @Precondition: 0 <= year1 <= year2
	 */
	public static int numberOfLeapYears(int year1, int year2) {
		int count = 0;
		/*
		 * for(; year1 <= year2; year1++) { if(isLeapYear(year1)) { count++; } }
		 */
		for(int i = year1; i <= year2; i++) {
			if(isLeapYear(i)) {
				count++;
			}
		}
		return count;
	}

	/**
	 * Returns the value representing the day of the week for the first day of year,
	 * where 0 denotes Sunday, 1 denotes Monday, ..., and 6 denotes Saturday.
	 */
	private static int firstDayOfYear(int year) {
		/* implementation not shown */ 
		return 6;
	}

	/**
	 * Returns n, where month, day, and year specify the nth day of the year.
	 * Returns 1 for January 1 (month = 1, day = 1) of any year. Precondition: The
	 * date represented by month, day, year is a valid date.
	 */
	private static int dayOfYear(int month, int day, int year) {
		/* implementation not shown */ 
		return 25;
	}

	/**
	 * Returns the value representing the day of the week for the given date (month,
	 * day, year), where 0 denotes Sunday, 1 denotes Monday, ..., and 6 denotes
	 * Saturday. Precondition: The date represented by month, day, year is a valid
	 * date.
	 */
	public static int dayOfWeek(int month, int day, int year) {
		/* to be implemented in part (b) */ 
		int firstDayOfWeek = firstDayOfYear(year);
		int days = dayOfYear(month, day, year);
		int a = days % 7;
		int dayOfWeek = (firstDayOfWeek+a-1)%7;
		return dayOfWeek;
	}
	// There may be instance variables, constructors, and other methods not shown.
}
