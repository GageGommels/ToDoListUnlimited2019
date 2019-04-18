import java.util.*;

public class task {
	Scanner in = new Scanner(System.in);
	private String name;
	private int status;
	private String description;
	private int priority;
	private String date;
	
	public task() {
		String name;
		int status;
		String description;
		int priority;
		String date;
	}
	
	public task(String name_Input, int status_Input, String description_Input) {
		name = name_Input;
		status = status_Input;
		description = description_Input;
	}

	
	
	
	/*
	 * All the getters and setters for the information in task
	 */
	
	public void set_Name(String name_Input) {
		name = name_Input;
	}
	
	public String get_Name() {
		return name;
	}
	
	public int get_Status() {
		return status;
	}
	public void set_Status(int input) {
		status = input;
	}
	
	public void set_Description(String description_Input) {
		description = description_Input;
	}
	
	public String get_Description() {
		return description;
	}
	
	public void set_priority(int priority_Input) {
		priority = priority_Input;
	}
	
	public int get_priority() {
		return priority;
	}
	
	public void set_date(String date_Input) {
		date = date_Input;
	}
	
	public String get_date() {
		return date;
	}
	
	
	
	
	
	
	public String toString() {
		String output = "";
		
		output =  "Name:\t" + name + "\n"
				+ "Status:\t" + status + "\n"
				+ "Description:\t" + description + "\n"
				+ "Pritority:\t" + priority + "\n"
				+ "Due Date:\t" + date + "\n";
		return output;
	}
	
	
	
	public void populateTask() {
		System.out.print("Name of Task:\t");
		name = in.nextLine();
		System.out.println("");
		
		System.out.print("Description:\t");
		description = in.nextLine();
		status = 1;
		
		System.out.print("What is the priority\t");
		priority = in.nextInt();
		System.out.println("");
		
		System.out.print("What is the due date:\t");
		date = in.nextLine();
		date = in.nextLine();
		System.out.println("");
		
		
	}
}
