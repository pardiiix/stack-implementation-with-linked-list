package empLLStack;
import java.io.*;
import java.util.*;

public class input {

	public static void main(String[] args) throws Exception {
		
		File text = new File ("C:\\Users\\Pardis\\eclipse-workspace\\401\\Lab\\week 6\\emp(2).txt");
		
		Scanner in = new Scanner(text);
		LinkedStack<Employee> lls =  new LinkedStack<Employee>(); //creates a new Linked List stack called lls

		

		  while (in.hasNext()) 
		  {
			  Employee newEmployee = new Employee(); //an Employee object called newEmployee is created

			  try {
				  String name = in.next(); //put the next String in name
				  newEmployee.setName(name); //set name to newEmployees name
				  int ID = in.nextInt(); //put the next int in ID
				  newEmployee.setID(ID); //set ID to newEmployees ID
				  lls.push(newEmployee);// push newEmployee object to Linked List Stack
				  in.nextLine(); //go to next line in text
			  }
			  catch (NoSuchElementException e){
				  System.out.println("no elements found");
			  }
		  }
		  in.close();
	
		  Employee emp;
		  emp = lls.peek();
		  System.out.println(emp.name + " "+ emp.ID);
		  lls.pop();
		  lls.pop();
		  emp = lls.peek();
		  System.out.println(emp.name + " "+ emp.ID);

//		  traversal 		  
//		  LLNode<Employee> currNode = lls.top();
//		  while (currNode != null) {
//			  System.out.println(currNode.getInfo().name + ", " + currNode.getInfo().ID);
//			  currNode = currNode.getLink();
//		  }
	}

}
