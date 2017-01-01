package thirtyDaysOfCode;

import java.util.*;
import java.util.regex.*;

public class RegexSortUsersComparable {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt(); // Nr of test cases
		List<User> users = new ArrayList<>();
        String emailRegEx = ".+@gmail\\.com$";
        Pattern pattern = Pattern.compile(emailRegEx);
		in.nextLine();
		
		for (int i = 0; i < t; i++) {
			// read line and split
			String[] tokens = in.nextLine().split(" ");
			String name = tokens[0];
			String email = tokens[1];
			// Add to list only if email contains "@gmail.com"
            Matcher matcher = pattern.matcher(email);
            if (matcher.find()){
            	users.add(new User(name, email));
            }	
		}
		Collections.sort(users);
		
		for (User user: users) {
			System.out.println(user.name);
		}
	}
}

