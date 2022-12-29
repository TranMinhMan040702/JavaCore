package map;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
	public static void main(String[] args) {
		Map<Integer, String> myMap = new HashMap<>();

		myMap.put(1, "one");
		myMap.put(2, "two");
		myMap.put(3, "three");

		// putAll(): them phan tu tu Map khac
		Map<Integer, String> myMap1 = new HashMap<>();
		myMap.put(4, "four");
		myMap.put(5, "five");
		myMap.putAll(myMap1);
		
		// remove(): xoa phan tu trong Map
		myMap.remove(2);
		
		// clear(): xoa tat ca phan tu trong Map
//		myMap.clear();
		
		// size(): xem kich thuc Map
		System.out.println(myMap.size());

		// duyet map
		for (Integer key : myMap.keySet()) {
			System.out.println(myMap.get(key));
		}
		
		// containsKey(): kiem tra key co ton tai
		System.out.println(myMap.containsKey(3));
		
		// containsValue(): kiem tra value co ton tai khong
		System.out.println(myMap.containsValue("a"));
		
		
	}
}
