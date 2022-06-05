import java.util.HashSet;

public class Military extends DeadLineProject {

	private String password;

	public Military(Member manager, HashSet<Member> members, String title, double fund, String deadLine,
			String password) {
		super(manager, members, title, fund, deadLine);
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getRisk() {

		return this.getMembers().size() / password.length() / this.getFund();
	}

}