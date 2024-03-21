package polymorphism;

public class Son extends Fat {

	@Override
	void run(){
		System.out.println("Son running");
	}
		public static void main(String[] args) 
		{
			Fat f = new Son();
			f.run();
	}
		// TODO Auto-generated method stub

}


