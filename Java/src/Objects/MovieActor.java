package Objects;

public class MovieActor {
	String aname;
	int age;
	int nof;
	String favtf;
	MovieActor(String aname, int age, int nof, String favtf){
		this.aname=aname;
		this.age=age;
		this.nof=nof;
		this.favtf=favtf;
	}
	void details() {
		System.out.println("The name of actor "+aname);
		System.out.println("Age of actor "+age);
		System.out.println("Total number of films "+nof);
		System.out.println("Favourite film is "+favtf);
		System.out.println("**********************");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieActor p1= new MovieActor("Salman Khan", 56, 200, "Dabang");
		MovieActor p2= new MovieActor("Shahrukh Khan", 50, 210, "Dil se" );
		MovieActor p3= new MovieActor("Saif Ali Khan", 52, 140, "Adipurush");
		MovieActor p4= new MovieActor("Aamir Khan", 53, 20, "Dangal");
		MovieActor p5= new MovieActor("Nana Patekar", 62, 90, "Welcome");
		
		p1.details();
		p2.details();
		p3.details();
		p4.details();
		p5.details();
		
	}
}
