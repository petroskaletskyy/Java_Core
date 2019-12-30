package ua.lviv.lgs.task001;

public class WorkerSallaryPerHour implements Sallary {

	private int hour;
	private double rate;

	public WorkerSallaryPerHour(int hour, double rate) {
		super();
		this.hour = hour;
		this.rate = rate;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "workerSallaryPerHour [hour=" + hour + ", rate=" + rate + "]";
	}

	@Override
	public void getSallary() {
		double totalSallary = hour * rate;
		System.out.println("Total sallary for work per hour - " + totalSallary);
	}

}
