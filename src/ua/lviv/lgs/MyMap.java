package ua.lviv.lgs;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class MyMap<K, V> extends MyEntry<K, V> {

	LinkedHashMap<K, V> mHashMap = new LinkedHashMap<>();

	public MyMap() {
		super();
	}

	public MyMap(K ob1, V ob2) {
		super(ob1, ob2);
	}

	public void addNewObject(K ob1, V ob2) {
		mHashMap.put(ob1, ob2);
	}

	public void removeFromMapByKey(K ob1) {
		mHashMap.remove(ob1);
	}

	public void removeFromMapByValue(V ob2) {
		mHashMap.values().remove(ob2);
	}

	public void printMapSet() {
		Iterator<Entry<K, V>> iter = mHashMap.entrySet().iterator();
		while (iter.hasNext()) {
			Entry<K, V> next = iter.next();
			System.out.println(next.getKey().toString());
		}
	}

	public void printMapValue() {
		Iterator<Entry<K, V>> iter = mHashMap.entrySet().iterator();
		while (iter.hasNext()) {
			Entry<K, V> next = iter.next();
			System.out.println(next.getValue().toString());
		}
	}

	public void printAllMap() {
		Iterator<Entry<K, V>> iter = mHashMap.entrySet().iterator();
		while (iter.hasNext()) {
			Entry<K, V> next = iter.next();
			System.out.println(next.getKey().toString() + "<--->" + next.getValue().toString());
		}
	}
}
