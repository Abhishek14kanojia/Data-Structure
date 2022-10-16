package org.DataStructure;

public class BankCounter {

	int Amount = 0;
	int head = -1;
	int tail = -1;
	String queue [];
	
	public BankCounter(int size) {
		queue = new String[size];
		
	}
	
	public void enqueue(int amount, String name) {
		if(tail < queue.length -1) {
			queue[++tail] = name;
			Amount = Amount + amount;
			if(head == -1)
				head++;
				return;
			
			
		}System.out.println("Full");
	
	}
	public void dequeue() {
		if(head < queue.length && head < tail) {
			head++;
			
		}
	}
	public void display() {
		if(head > tail || head == -1) {
			System.out.println("Empty");
			return;
		}
		for (int i = head; i <= tail; i++) {
			System.out.print(queue[i]);
		}
		System.out.println();
	}
}
