package textAdventure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Helper {
	public List<String> options = new ArrayList<String>();
	
	public void setOptions(String[] str) {
		options.clear();
		for (int i = 0; i < str.length; i++) {
			options.add(str[i]);
		}
	}
	
	public void prompt(String msg) {
		System.out.println("==========================");
		System.out.println("# " + msg);
		System.out.println("==========================");
	}
	
	public void showOptions() {
		System.out.println("==========================");
		for (int i = 0; i < options.size(); i++) {
			System.out.println("# " + (i+1) + ". " + options.get(i));
		}
		System.out.println("==========================");
	}
	
	public String getString() {
		Scanner input = new Scanner(System.in);
		return input.nextLine();
	}
	
	public int getInt() {
		Scanner input = new Scanner(System.in);
		int input1 = input.nextInt();
		input.nextLine();
		return input1;
	}
}
