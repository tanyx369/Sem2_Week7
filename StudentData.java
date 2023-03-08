import java.util.Scanner;

public class StudentData 
{
	private String StudentName;
	private int StudentID;
	private String StudentContact;
	
	
	//Constructor

    //readName() to get student name
	public void readName(String name)
	{
		
		System.out.println("Student Name for object: " + name );
		
	}
	
	//To get student ID from user
	public void readID(int id)
	{
		System.out.println("Student ID for object: " + id );
		
	}
	
	//To get contact number from user
	public void readContact(String contact)
	{
		System.out.println("Student contact for object: " + contact );
	
	}
	
	//return student name
	public String getName()
	{
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Please Enter Student Name: ");
		String name = scan1.nextLine();
		
		return name;
	
	}
	
	//return student ID
	public int getID()
	{
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Please Enter Student ID: ");
		int ID = scan2.nextInt();
		
		return ID;
	
	}
	
	//return student contact
	public String getContact()
	{
		
		Scanner scan3 = new Scanner(System.in);
		System.out.println("Please Enter Student Contact: ");
		String contact = scan3.nextLine();
		
		return contact;
	}	
	
	
	public static void main(String[] args) {
		
		StudentData s1 = new StudentData();
		
	
		
		
		s1.readName(s1.getName());
		s1.readID(	s1.getID());
		s1.readContact(s1.getContact());
		
	}
}
