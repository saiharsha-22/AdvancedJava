import java.io.*; 
interface intfA 
{ 
	void StudentName(); 
} 
interface intfB extends intfA 
{ 
	void StudentInstitute(); 
} 
class program implements intfB 
{
	public void StudentName() 
	{ 
		System.out.println("Sai Harsha Vardhan AVN"); 
	} 
	public void StudentInstitute() 
	{ 
		System.out.println("Amity University Mumbai"); 
	} 

	public static void main (String[] args) 
	{ 
		program ob1 = new program(); 
		ob1.StudentName(); 
		ob1.StudentInstitute(); 
	} 
} 