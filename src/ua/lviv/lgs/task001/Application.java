package ua.lviv.lgs.task001;

public class Application {
	
	public static void main(String[] args) {
		
		WorkerSallaryPerHour worker1 = new WorkerSallaryPerHour(248, 16.50);
		worker1.getSallary();
		
		System.out.println();
		
		WorkerSallaryPerMonth worker2 = new WorkerSallaryPerMonth(5, 8350);
		worker2.getSallary();
		
	}
	

}
