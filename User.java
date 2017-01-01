package thirtyDaysOfCode;

public class User implements Comparable<User> {
	String name;
	String email;
	
	public User(String name, String email) {
		this.name = name;
		this.email = email;
	}

	@Override
	public int compareTo(User user) {
		if (this.name.compareTo(user.name) > 0) {
			return 1;
		} else if (this.name.compareTo(user.name) < 0) {
			return -1;
		}	
		return 0;
	}
}

