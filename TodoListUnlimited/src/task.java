import java.util.*;

public class task {
	Scanner in = new Scanner(System.in);
	private String name;
	private int status;
	private String description;
	
	public task() {
		String name;
		int status;
		String description;
	}
	
	public task(String name_Input, int status_Input, String description_Input) {
		name = name_Input;
		status = status_Input;
		description = description_Input;
	}

	
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
	
	public String toString() {
		String output = "";
		
		output =  "Name:\t" + name + "\n"
				+ "Status:\t" + status + "\n"
				+ "Description:\t" + description + "\n";
		return output;
	}
	
	public void populateTask() {
		System.out.print("Name of Task:\t");
		name = in.nextLine();
		System.out.println("");
		System.out.print("Description:\t");
		description = in.nextLine();
		status = 1;
		
	}
}
