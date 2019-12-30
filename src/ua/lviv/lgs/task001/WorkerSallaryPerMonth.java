package ua.lviv.lgs.task001;

public class WorkerSallaryPerMonth implements Sallary {

	private double workExperience;
	private double monthSallary;

	public WorkerSallaryPerMonth(int workExperience, double monthSallary) {
		super();
		this.workExperience = workExperience;
		this.monthSallary = monthSallary;
	}

	public double getWorkExperience() {
		return workExperience;
	}

	public void setWorkExperience(int workExperience) {
		this.workExperience = workExperience;
	}

	public double getMonthSallary() {
		return monthSallary;
	}

	public void setMonthSallary(double monthSallary) {
		this.monthSallary = monthSallary;
	}

	@Override
	public String toString() {
		return "workerSallaryPerMonth [workExperience=" + workExperience + ", monthSallary=" + monthSallary + "]";
	}

	@Override
	public void getSallary() {
		double totalSallary = (workExperience / 10) * monthSallary;
		System.out.println("Total sallary for work per month - " + totalSallary);
	}

}
