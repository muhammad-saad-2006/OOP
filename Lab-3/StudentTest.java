import java.util.Scanner;
public class StudentTest{
	public static void main(String[] args){
		Student s1 = new Student("Muhammad Saad", 3.77, "Lahore");
		Student s2 = new Student("Abdullah Saleem", 3.01, "Pattoki");
		Student s3 = new Student("Muhammad Awaim", 3.87, "Fasilabad");
		Student s4 = new Student("Muhammad Umair", 3.8, "Chunian");
		Student s5 = new Student("Ali Abbas", 3.5, "Lahore");

		UserInfo info = new UserInfo();
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter user name: ");
		String user = input.next();
		System.out.print("Enter the password: ");
		String password = input.next();
		System.out.println();

		if(user.equals(info.getUserName()) && password.equals(info.getUserPassword())){			
			System.out.printf("%-10s%3s%10s%17s%20s\n","Sr No.","Regestration Id","Name","Cgpa","Address");
			System.out.println("------------------------------------------------------------------------");
			System.out.printf("%02d%20s%22s\t%.2f%19s\n",1,s1.getCompleteRollnumber(),s1.getName(),s1.getCgpa(),s1.getAddress());
			System.out.printf("%02d%20s%24s\t%.2f%20s\n",2,s2.getCompleteRollnumber(),s2.getName(),s2.getCgpa(),s2.getAddress());
			System.out.printf("%02d%20s%23s\t%.2f%22s\n",3,s3.getCompleteRollnumber(),s3.getName(),s3.getCgpa(),s3.getAddress());
			System.out.printf("%02d%20s%23s\t%.2f%20s\n",4,s4.getCompleteRollnumber(),s4.getName(),s4.getCgpa(),s4.getAddress());
			System.out.printf("%02d%20s%18s\t%.2f%19s\n",5,s5.getCompleteRollnumber(),s5.getName(),s5.getCgpa(),s5.getAddress());
		}
		else{
			System.out.print("Wrong user name or password!!");
		}
	}
}
