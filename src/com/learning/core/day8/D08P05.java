package com.learning.core.day8;

import java.util.Scanner;

class Queue3
{
	int size;
	int arr[];
	int front,rear;
	Queue3(int size)
	{
		this.size=size;
		this.arr=new int[size];
		this.front=-1;
		this.rear=-1;
	}
	public boolean isFull()
	{
		return rear==size-1;
	}
	public boolean isEmpty()
	{
		return front==-1 && rear==-1;
	}
	public void enqueue(int data)
	{
	    if(isFull())
	    {
	    	System.out.println("Queue is full");
	    }
		else if(isEmpty())
		{
			front=0;
			rear=0;
			arr[rear]=data;
		}
		else
		{
			rear++;
			arr[rear]=data;
		}
	}
	public int dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty");
			return -1;
		}
		else if(front==rear)
		{
		    int temp=arr[front];
			front=-1;
			rear=-1;
			return temp;
		}
		else 
		{
			int temp=arr[front];
		    front=front+1;
		    return temp;
		}
		
	}
	public void display()
	{
		for(int i=front;i<rear+1;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
}
public class D08P05 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Queue3 q=new Queue3(7);
		Queue3[] arrq=new Queue3[2];
		Queue3 oddqueue=new Queue3(7);
		Queue3 evenqueue=new Queue3(7);
		arrq[0]=oddqueue;
		arrq[1]=evenqueue;
		for(int i=0;i<7;i++)
		{
			q.enqueue(sc.nextInt());
		}
		while(!q.isEmpty())
		{
			int data=q.dequeue();
			if(data%2==0)
			{
				evenqueue.enqueue(data);
			}
			else
			{
				oddqueue.enqueue(data);
			}
		}
		System.out.print("Odd Queue:");
		oddqueue.display();
		System.out.println("");
		System.out.print("Even Queue:");
		evenqueue.display();
		
	}

}
