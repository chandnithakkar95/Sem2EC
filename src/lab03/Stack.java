package lab03;

import java.util.ArrayList;

public class Stack {
	private static int top;
	//private int size;
	ArrayList<Object> stack;
	public Stack() {
		stack=new ArrayList<Object>();
		setTop(-1);
	}
	//creates an empty stack object
	public void push(Object s){
		
			stack.add(s);
			top++;
	}
	public Object peek(){
		System.out.println(top);
		System.out.println(stack.size());
		System.out.println(stack.get(top));
		
		return stack.get(top);	
		}
	//returns object at the top of stack
	//may return Null if stack is empty
	public Object pop() throws RuntimeException{
		Object poped=stack.get(top);
		stack.remove(top);
		top--;
		return poped;
	}
	//removes and returns Object from the top of Stack
	public boolean isEmpty(){
		if(top==-1)
		{
			return true;
		}
		else
			return false;
	}
	public static int getTop() {
		return top;
	}
	public static void setTop(int top) {
		Stack.top = top;
	}
}
