package stack;

import java.util.Iterator;
import java.util.Stack;

public class MyStack {

	public static void main(String[] args) {
		Stack<Integer> myStack = new Stack<>();

		// push(): them phan tu
		myStack.push(1);
		myStack.push(2);
		myStack.push(3);
		myStack.push(4);

		// peek(): phan tu o dinh Stack
		System.out.println(myStack.peek());

		// pop(): lay phan tu o dau va xoa
		System.out.println(myStack.pop());

		// size(): kich thuoc Stack
		System.out.println("size: " + myStack.size());
		
		// search(): tra ve vi tri cua phan tu tim duoc trong Stack
		System.out.println(myStack.search(2));
		
		// duyet phan tu trong Stack dung Iterator hay ForEach
		Iterator<Integer> iterator = myStack.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
