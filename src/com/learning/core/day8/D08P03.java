package com.learning.core.day8;

import java.util.Scanner;

class CircularQueue
{
	int size;
	int arr[];
	int front,rear;
	CircularQueue(int size)
	{
		this.size=size;
		this.arr=new int[size];
		this.front=-1;
		this.rear=-1;
	}
	public void enqueue(int data)
	{
		if(front==-1 && rear==-1)
		{
			front=0;
			rear=0;
			arr[rear]=data;
		}
		else
		{
			rear=(rear+1)%size;
			arr[rear]=data;
		}
	}
	public void dequeue()
	{
		if(front==-1 && rear==-1)
		{
			System.out.println("Queue is empty");
		}
		front=(front+1)%size;
		if(front==rear)
		{
			front=-1;
			rear=-1;
		}
	}
	public void display()
	{
		for(int i=front;i<rear+1;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
	
}
public class D08P03 {
	public static void main(String[] args)
	{
		CircularQueue q=new CircularQueue(4);
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<4;i++)
		{
			q.enqueue(sc.nextInt());
		}
		q.dequeue();
		q.display();
		
	}

}


