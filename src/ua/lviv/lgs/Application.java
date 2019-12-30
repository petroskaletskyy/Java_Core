package ua.lviv.lgs;

public class Application {

	public static void main(String[] args) {

		Su27 plane = new Su27(12, 8, 254, 1287, "gray");
		
		System.out.println(plane.toString());
		System.out.println();

		plane.EngineStart();
		plane.TakeOffAirplane();
		plane.MoveUp();
		plane.MoveDown();
		plane.MoveUp();
		plane.MoveRight();
		plane.MoveLeft();
		plane.StelthTechnology();
		plane.NuclearStrike();
		plane.TurboAcceleration();
		plane.LandindAirplane();
		

	}

}
