package thirtyDaysOfCode;

import java.util.*;

public class SortUsersComparable {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt(); // Nr of test cases
		List<User> users = new ArrayList<>();
		in.nextLine();
		
		for (int i = 0; i < t; i++) {
			// read line and split
			String[] tokens = in.nextLine().split(" ");
			// Add to list only if email contains "@gmail.com"
			if (tokens[1].contains("@gmail.com")) {
				users.add(new User(tokens[0], tokens[1]));
			}	
		}
		Collections.sort(users);
		
		for (User user: users) {
			System.out.println(user.name);
		}
	}
}

