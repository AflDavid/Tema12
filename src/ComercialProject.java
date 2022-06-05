import java.util.HashSet;

public class ComercialProject extends DeadLineProject {

	private double marketingFund;
	private int teamNr = 0;

	public ComercialProject(Member manager, HashSet<Member> members, String title, double fund, String deadLine) {
		super(manager, members, title, fund, deadLine);
		marketingFund = this.getFund() / 2;
	}

	public double getMarketingFund() {

		return marketingFund;

	}

	public int getTeamNr() {
		return teamNr;
	}

	public boolean setTeamNr(int teamNr) {
		if (teamNr < this.getMembers().size()) {
			this.teamNr = teamNr;
			return true;
		}
		return false;
	}

	@Override
	public double getRisk() {
		return this.teamNr * 3 / this.getMembers().size() / (this.getFund() - this.marketingFund);
	}

}