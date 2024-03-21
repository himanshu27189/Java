package Objects;

public class CricketTeam {
	String pname;
	int macthes;
	int jno;
	int hscore;
	CricketTeam(String pname, int matches, int jno, int hscore){
		this.pname=pname;
		this.macthes=matches;
		this.jno=jno;
		this.hscore=hscore;
	}
	void details() {
		System.out.println("The name of player "+pname);
		System.out.println("Matches played "+macthes);
		System.out.println("Jersey number is "+jno);
		System.out.println("Highest Score is "+hscore);
		System.out.println("**********************");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CricketTeam p1= new CricketTeam("Virat", 523, 18, 183);
		CricketTeam p2= new CricketTeam("Dhoni", 600, 7, 183);
		CricketTeam p3= new CricketTeam("Rohit", 567, 45, 264);
		CricketTeam p4= new CricketTeam("Jaddu", 467, 8, 156);
		CricketTeam p5= new CricketTeam("ABD", 550, 17, 180);
		
		p1.details();
		p2.details();
		p3.details();
		p4.details();
		p5.details();
		
	}

}
