package set;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class MySet {

	public static void main(String[] args) {
		SortedSet<String> sortedSet = new TreeSet<>();
		
		// add()
		sortedSet.add("a");
		sortedSet.add("c");
		sortedSet.add("b");
		sortedSet.add("e");
		sortedSet.add("g");
		
		// remove()
		sortedSet.remove("a");
		
		// first()
		System.out.println("First element: " + sortedSet.first());
		// last()
		System.out.println("Last element: " + sortedSet.last());
		// duyet cac phan tu
		Iterator<String> iterator = sortedSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("===========================");
		// headSet(): lay phan tu tu dau Set den phan tu truyen vao
		SortedSet<String> headSet = sortedSet.headSet("e");
		Iterator<String> iterator1 = headSet.iterator();
		while(iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
		System.out.println("===========================");
		// tailSet(): lay phan tu phan tu truyen vao den phan tu cuoi cung
		SortedSet<String> tailSet = sortedSet.tailSet("b");
		Iterator<String> iterator2 = tailSet.iterator();
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
	}

}
