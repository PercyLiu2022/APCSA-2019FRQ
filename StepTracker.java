package apcsafrq.frq2019.question2;

/*
 * addDailySteps, which accumulates information about steps, in readings taken once per day
 * activeDays, which returns the number of active days
 * averageSteps, which returns the average number of steps per day, calculated by dividing the total number of steps taken by the number of days tracked
 */
public class StepTracker {
	private int minDailySteps;
	private int totalDays;
	private int totalSteps;
	private int activeDays;
	
	public StepTracker(int minDailySteps) {
		this.minDailySteps = minDailySteps;
		this.totalDays = 0;
		this.totalSteps = 0;
		this.activeDays = 0;
	}

	public int activeDays() {
		return activeDays;
	}
	
	public void addDailySteps(int steps){
		totalDays++;
		totalSteps += steps;
		if(steps >= minDailySteps) {
			activeDays++;
		}
	}
	
	public double averageSteps() {
		if(totalDays == 0) {
			return 0.0;
		}
		return totalSteps/totalDays;
	}
}
