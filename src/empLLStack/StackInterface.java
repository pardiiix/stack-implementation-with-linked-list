package empLLStack;

public interface StackInterface<T> {
	
	void push (T emp);
	
	void pop();
	
	LLNode<T> top();
	
	boolean isFull();
	
	boolean isEmpty();
	
	
}
