package com.java.datastructres;

class QueueUsingArray{
	int front_q, rear_q;
	int capacityOfQueue;
	static int[] q1;
	
	QueueUsingArray(int size){
		capacityOfQueue = size;
		q1 = new int [capacityOfQueue];
		
	}
	
	void enQueue(int value) {
		if(rear_q == capacityOfQueue) {
			System.out.println("Queue is already full you can not insert element");
		}else {
			q1[rear_q] = value;
			rear_q++;
		}
	}
	
	void deQueue() {
		if(rear_q == 0) {
			System.out.println("Queue is empty , there is nothing to delete");
		}
		else
		{
			for(int i=0; i<rear_q-1; i++) {
				q1[i] = q1[i+1];
			}
			rear_q--;
		}
	}
	
	void display() {
		if(rear_q == 0) {
			System.out.println("Queue is empty, nothing to disply");
		}
		else {
			for(int i=0; i<rear_q; i++) {
				System.out.println(q1[i]+ " ");
			}
		}
	}		
}

public class QueueArraySolution {

	public static void main(String[] args) {
		
		QueueUsingArray q2 = new QueueUsingArray(50);
		q2.enQueue(6);
		q2.enQueue(31);
		q2.enQueue(3);
		q2.enQueue(10);
		q2.deQueue();
		q2.deQueue();
		q2.deQueue();
		q2.deQueue();
		q2.deQueue();
		q2.display();
		
	}
}
