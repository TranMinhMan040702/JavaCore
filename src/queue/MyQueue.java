package queue;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
	public static void main(String[] args) {
		Queue<String> myQueue = new LinkedList<>();
		
		// add(), offer(): them phan tu
		myQueue.add("a");
		myQueue.offer("b");
		
		// peek(), element(): lay phan tu o dau hang doi
		System.out.println(myQueue.peek());
		System.out.println(myQueue.element());
		
		// poll(), remove(): lay ra phan tu o dau hang doi va xoa no
//		System.out.println(myQueue.poll());
//		System.out.println(myQueue.remove());
		
		// clear(): xoa tat ca
		
		
		// isEmpty(): kiem tra hang doi co rong khong
		System.out.println(myQueue.isEmpty());
		
		// containts(): kiem tra phan tu co trong hang doi
		System.out.println(myQueue.contains("a"));
		
		// size(): kich thuoc cua queue
		System.out.println(myQueue.size());
		
		// duyet hang doi
		for (String element : myQueue) {
			System.out.println(element + "\t");
		}
	}
}
