package ua.lviv.lgs;

public class Application {

	public static void main(String[] args) {

		MyMap<Integer, String> newMap = new MyMap<Integer, String>();
		newMap.addNewObject(11, "45");
		newMap.addNewObject(45, "abba");
		newMap.addNewObject(1, "town");
		newMap.addNewObject(24, "city");
		newMap.addNewObject(99, "contry");
		newMap.printAllMap();
		System.out.println();
		System.out.println("Remove from map by key 99:");
		newMap.removeFromMapByKey(99);
		newMap.printAllMap();
		System.out.println();
		System.out.println("Remove from map by value 45:");
		newMap.removeFromMapByValue("45");
		newMap.printAllMap();
		System.out.println();
		System.out.println("Print keys:");
		newMap.printMapSet();
		System.out.println();
		System.out.println("Print values:");
		newMap.printMapValue();
	}

}
