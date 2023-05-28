package com.java.stack;

class QueueArray {

	int front_q, rear_q, capacityOfQueue;
	static int q1[];
	
	QueueArray(int size){		
		capacityOfQueue = size;		
		q1 = new int[capacityOfQueue];
	}
	
	void enQueue(int value) {
		if(rear_q == capacityOfQueue) {
			System.out.println("You can not insert there is no element full");
		}else {
			q1[rear_q] = value;
			rear_q++;
		}		
	}	
	
	void deQueue() {
		if(rear_q == 0) {
			System.out.println("You can not delete because array is empty");
		}
		else {
			for(int i=0; i<rear_q-1; i++) {
				q1[i] = q1[i+1];
			}
			rear_q--;
		}
	}
	
	void disply() {
		if(rear_q == 0) {
			System.out.println("You cannot disply beacuse array is no data");
		}
		else {
			for(int i=0; i<rear_q; i++)
			System.out.println(q1[i] + " ");
		}
	}
	  
	
}

public class QueueExample {
	
	public static void main(String[] args) {
		
		QueueArray data = new QueueArray(3);
		data.enQueue(6);
		data.enQueue(3);
		data.enQueue(10);
	//	data.enQueue(10);
	
	//	data.deQueue();
	//	data.deQueue();
	//	data.deQueue();
	//	data.deQueue();
	
		data.disply();
		data.disply();
		
	}

}
