package empLLStack;

public class LinkedStack<T> implements StackInterface<T> {

	protected LLNode<T> topNode; // the pointer is topNode
	
	public LinkedStack() {
		topNode = null;
	}
	
	public LLNode<T> top() {
		return topNode;
	}
	
	public void push(T element) { // pushes an element 
		LLNode<T> newT = new LLNode<T>(element); //create a new Node
		newT.setLink(topNode); //sets a link from the new Node to the top
		topNode = newT; // new Node is the new top
	}
	
	public void pop() { //pops the top Node
		topNode = topNode.getLink(); //the previous Node is now top
	}
	
	public T peek() { //shows the top Nodes info
		T toReturn = topNode.getInfo();
		return toReturn;
	}
	
	public boolean isEmpty() {
		return topNode==null; // if there is no top Node, the stack is empty.
	}
	
	public boolean isFull() {
		return false; // a linked stack is never full.
	}
	
	
}
