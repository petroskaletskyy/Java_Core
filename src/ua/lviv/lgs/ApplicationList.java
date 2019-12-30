package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ApplicationList {
	public static void main(String[] args) {

		// Для збеження в List різнотипних даних можна використати тип Object для даних,
		// які будуть зберігатися в List. Але
		// це погана практика.
		List<Object> data = new ArrayList<>();
		data.add(11);
		data.add("23");
		data.add(11.3);

		System.out.println(data);

		// Інший варіант - використати Map

		Map<Integer, String> newMap = new HashMap<Integer, String>();
		newMap.put(12, "45");
		newMap.put(34, "23");
		Iterator<Entry<Integer, String>> iter = newMap.entrySet().iterator();
		while (iter.hasNext()) {
			Entry<Integer, String> next = iter.next();
			System.out.println(next.getKey().toString() + " <-> " + next.getValue().toString());
		}
	}

}
