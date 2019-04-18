import java.io.*;
import java.util.*;

public class main {

	public static void main(String[] args) {
		int input = 0;

		Scanner scan = new Scanner(System.in);

		ArrayList<task> tList = new ArrayList<task>();

		while (true) {

			printMenu();
			
			input = scan.nextInt();

			switch (input) {
			case 1:
				task nTask = new task();
				nTask.populateTask();
				tList.add(nTask);
				System.out.println("Task was added!");
				break;
			case 2:
				for(int i = 0; i < tList.size(); i++) {
					System.out.println(tList.get(0).toString());
				}
				
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.print("Please enter a valid input!");
				break;
			}
		}
	}
	
	
	public static void printMenu() {
		System.out.printf("1: Add Task\n"
						+ "2: Print List\n"
						+ "3: Exit Program\n");
	}
}
