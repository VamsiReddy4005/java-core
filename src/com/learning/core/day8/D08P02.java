package com.learning.core.day8;

import java.util.Scanner;

class Node
{
	int data;
	Node next;
}
class Queue1
{
	Node front;
	Node rear;
	Queue1()
	{
		this.front=null;
		this.rear=null;
	}
	public void enqueue(int data)
	{
		Node temp=new Node();
		temp.data=data;
		if(rear==null)
		{
			front=temp;
			rear=temp;
		}
		rear.next=temp;
		rear=temp;
	}
	public void dequeue()
	{
		if(front==null && rear==null)
		{
			System.out.println("Queue is empty");
		}
		front=front.next;
		if(front==rear)
		{
			front=null;
			rear=null;
		}
	}
	public void display()
	{
		Node current=front;
		while(current!=null)
		{
			System.out.println(current.data);
			current=current.next;
		}
	}
}
public class D08P02 {
	public static void main(String[] args)
	{
		Queue1 q=new Queue1();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			q.enqueue(sc.nextInt());
		}
		q.dequeue();
		q.dequeue();
		q.display();
		
	}

}
