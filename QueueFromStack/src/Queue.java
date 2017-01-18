import java.util.Stack;

public class Queue {
	
	private Stack<Integer> oldStack;
	private Stack<Integer> newStack;
	private Integer topElement = -1;
	
	public Queue() {
		oldStack = new Stack<Integer>();
		newStack = new Stack<Integer>();
	}
	
	public boolean isEmpty() {
		return (oldStack.empty() && newStack.empty());
	}
	
	public int size() {
		return oldStack.size() + newStack.size();
	}
	
	public boolean enqueue(int element) {
		boolean rvalue = true;
		
		try {
			newStack.push(new Integer(element));
		} catch (Exception error) {
			rvalue  = false;
			System.out.println("There was an error adding the item to the Queue : " + error.getMessage());;
		}
		
		return rvalue;
	}
	
	public Integer dequeue() {
		topElement = -1;
		if(oldStack.empty()) {
			while(!newStack.empty()) {
				topElement = newStack.peek();
				oldStack.push(topElement);
				newStack.pop();
			}
		}
		
		if(!oldStack.empty()) {
			Integer i = oldStack.peek();
			topElement = i.intValue();
			oldStack.pop();
		}
		
		return topElement;
	}
	
	
	
	

}
