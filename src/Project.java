import java.util.HashSet;

public abstract class Project implements Risky {

	private Member manager;
	private String title;
	private String goal;
	private double fund;
	private HashSet<Member> members;

	public Project(Member manager, HashSet<Member> members, String title, double fund) {
		this.manager = manager;
		members = new HashSet<Member>();
		members.add(manager);
		this.members = members;
		this.title = title;
		this.fund = fund;
	}

	public boolean addMember(Member m) {
		return members.add(m);
	}

	public boolean removeMember(Member m) {
		return members.remove(m);
	}

	public Member getManager() {
		return manager;
	}

	public void setManager(Member manager) {
		members.remove(manager);
		this.manager = manager;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getFund() {
		return fund;
	}

	public void setFund(double fund) {
		this.fund = fund;
	}

	public HashSet<Member> getMembers() {
		return members;
	}

	public void setMembers(HashSet<Member> members) {
		this.members = members;
	}

	public String toString() {
		return "manager=" + manager + ", title=" + title + ", goal=" + goal + ", fund=" + fund + ", members=" + members
				+ "";
	}

}