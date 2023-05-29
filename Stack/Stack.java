package test1;

import java.util.Scanner;

public class Stack {
	int capacity;
	int topOfStack;
	int [] array;
	int capacity2;
	int topOfStack2;
	char [] array2;
	
	public void CreateStack() {
		capacity = 7;
		array = new int[capacity];
		topOfStack = 0;
		capacity2 = 20;
		array2 = new char[capacity];
		topOfStack2 = 0;
		
	}
	public void PushStack(int n) {
		if(topOfStack>array.length-1) {
			System.out.println("Error the stak is already full!!!");
		}
		else {
			array[topOfStack]=n;
			topOfStack++;
		}
	}
	public void push(char str) {    

        if (IsFull())
            System.out.println ("Stack is Full ");  
        else {
            array2[topOfStack2] = str;
            topOfStack2++;      
        } 
    }
	
	 public char pop() { 
	        if (IsEmpty())
	            System.out.println ("Stack is Empty "); 
	        else{
	            char value = array2[topOfStack2];
	            topOfStack2--;
	            return value;
	        }
	        return array2[topOfStack2];
	    }   
	
	public int PopStack() {
		int the_return = -1;
		if(topOfStack>0) {
			topOfStack--;
			the_return = array[topOfStack];
		}
		return the_return;
	}
	
	public int Peek() {
		int the_return = -1;
		if(topOfStack>0) {
			the_return = array[topOfStack-1];
		}
		return the_return;
	}
	public boolean IsEmpty() {
		return topOfStack==0;
	}
	public boolean IsFull() {
		return topOfStack==capacity;
	}
	public void reverse() {
		int x = capacity-1;
		for(int i = 0; i<x; i++) {
			System.out.print(array[i]+" ,");
		}
	}
	public String toString() {
		String s ="";
		int x = topOfStack;
		for(int i = x;i>0;i--) {
			s+=""+array[x-1]+" ,";
		    x--;
		}
		return s;
	}
}
	






