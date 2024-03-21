package Objects;

public class Book {
	static {
			System.out.println("Welcome");
			System.out.println("SB - 1");
		}
		static String bookname ="Java";
		public static void read()
		{
			System.out.println("Reading Java book");
		}
		{
			System.out.println("NSB - 1");
		}
		String author ="rahul";
		void write()
		{
			System.out.println("Writing Java book");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Book.bookname);
		Book.read();
		Book b = new Book();
		System.out.println(b.author);
		b.write();
	}

}
