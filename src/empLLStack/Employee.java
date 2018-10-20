package empLLStack;

public class Employee { /// Employee has a name and ID
	
	protected String name;
	protected int ID;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) { //gets the name as a string and sets it to the Employees name
		this.name = name;
	}
	
	public int getID(){
		return ID;
	}
	
	public void setID(int ID){ //gets the ID as an int and sets it to the Employees ID
		this.ID = ID;
	}
}
