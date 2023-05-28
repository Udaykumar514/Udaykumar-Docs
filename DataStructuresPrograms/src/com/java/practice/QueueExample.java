package com.java.practice;

class QueueArray{
	int front_q, rear_q, capityOfSize;
	static int[] q1;
	
	QueueArray(int size){
		capityOfSize = size;
		q1 = new int[capityOfSize];
	}
	
	void enqueue(int value) {
		if(rear_q == capityOfSize) {
			System.out.println("You can not insert element beacuse array size is full");
		}
		else {
			q1[rear_q] = value;
			rear_q++;
		}
	}
	
	void deQueue()
	{
		if(rear_q == 0) {
			System.out.println("You can not delete beacuse there is no element in arry");
		}
		else {
			for(int i=0; i<rear_q-1; i++) {
				q1[i] = q1[i+1];	
			}
			rear_q--;
		}
	}
	
	void disply() {
		if(rear_q ==0) {
			System.out.println("You cannot disply beacuse ther is no element in array");
		}
		else {
			for(int i=0; i<rear_q; i++) {
				System.out.println(q1[i]+ " ");
			}
		}
	}
}

public class QueueExample {
	public static void main(String[] args) {
		
		QueueArray data = new QueueArray(6);
		data.enqueue(5);
		data.enqueue(10);
		data.enqueue(25);
		data.deQueue();
		data.deQueue();
		data.deQueue();
		data.deQueue();
		data.disply();

	}
}
