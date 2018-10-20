package empLLStack;

public class LinkedList<Employee> {
    private LLNode<Employee> first;
    private LLNode<Employee> last;
    private int N;

    public LinkedList() {
        first = null;
        last = null;
        N = 0;
    }
    
    public boolean isEmpty() {
    	return (first == null);
    }

    public void add(Employee emp) {
        if (emp == null) { throw new NullPointerException("The first argument for addLast() is null."); }
        if (!isEmpty()) {
        	LLNode<Employee> prev = last;
            last = new LLNode<Employee>(emp);
            prev.link = last;
        }
        else {
            last = new LLNode<Employee>(emp);
            first = last;
        }
        N++;
    }
}
