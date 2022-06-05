import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class InvestmentCompany {

	public ArrayList<Project> projects = new ArrayList<Project>();

	public boolean addProject(Project p) {
		return projects.add(p);
	}

	public Project getBestInvestment() {
		Iterator<Project> it = projects.iterator();

		Project profitableProject = it.next();

		while (it.hasNext()) {
			Project project = it.next();

			if (project.getRisk() < profitableProject.getRisk())
				profitableProject = project;
		}

		return profitableProject;

	}

	public static void main(String[] args) {

		Member m1 = new Member("Member1", 30);
		Member m2 = new Member("Member2", 35);
		Member m3 = new Member("Member3", 40);
		Member m4 = new Member("Member4", 45);
		Member m5 = new Member("Member5", 50);

		HashSet<Member> members1 = new HashSet<Member>();
		members1.add(m1);
		members1.add(m2);
		members1.add(m3);

		HashSet<Member> members2 = new HashSet<Member>();
		members2.add(m2);
		members2.add(m3);
		members2.add(m4);

		HashSet<Member> members3 = new HashSet<Member>();
		members3.add(m3);
		members3.add(m4);
		members3.add(m5);

		Project p1 = new ComercialProject(m4, members1, "Comercial", 1000, "21.08.2001");
		Project p2 = new Military(m2, members2, "Comercial", 2000, "21.08.2001", "197218");
		Project p3 = new OpenSource(m5, members3, "Comercial", 3000);

		InvestmentCompany InvestimentCompany1 = new InvestmentCompany();

		InvestimentCompany1.addProject(p1);
		InvestimentCompany1.addProject(p2);
		InvestimentCompany1.addProject(p3);

		System.out.println(InvestimentCompany1.getBestInvestment().toString());

	}

}