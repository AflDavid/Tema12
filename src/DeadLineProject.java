import java.util.HashSet;

public abstract class DeadLineProject extends Project {

	private String deadLine;
	private final int maxNr = 15;

	public DeadLineProject(Member manager, HashSet<Member> members, String title, double fund, String deadLine) {
		super(manager, members, title, fund);
		this.deadLine = deadLine;
	}

	public String getDeadLine() {
		return deadLine;
	}

	public void setDeadLine(String deadLine) {
		this.deadLine = deadLine;
	}

	public boolean addMember(Member m) {
		if (getMembers().size() == maxNr)
			return false;
		return getMembers().add(m);
	}
}