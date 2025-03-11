class LibraryApp{
	public static void main(String[] args){
		Library library = new Library("The Modern Library", 
      		new Book("Revolutions with AI", "1234-567-890", new Date(10, 12, 2025), 
          	new Person("Muhammad Saad", new Address("Badar Colony", "Pattoki"))),
      		new Incharge("Incharge", new Person("Ahmed", new Address("Ali Street", "Lahore"))),
      		new Staff("Janitor", new Person("Muhammad Ali", new Address("Quaid Road", "Lahore")))
		);

	
		System.out.println(library);
	}
}