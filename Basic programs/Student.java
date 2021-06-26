import java.util.*;
class Student
  {
    public static void main(String args[])
	{
	 
	 //String name[] = new String[50];
	// String subject[]= new String[10];
	 Scanner sc=new Scanner(System.in);
	 
	 
	 System.out.println("Enter record student  :\n");
	 
	 int x=0,y=0,z=0;
	 
	 for(int i=0;i<3;i++)
	 {
		 System.out.println("Enter the record of student :="+(i+1));
		 System.out.println("Enter marks of 1st subject :");
		 x=sc.nextInt();
		
		 System.out.println("Enter marks of 2nd subject :");
		 y=sc.nextInt();
		 
		 System.out.println("Enter the marks of 3rd subject :");
		 z=sc.nextInt();
	 
	 }
	 
	 int Total;
	 for(int i=0;i<5;i++)
	 { 
		System.out.println("Result of student "+i);
	    System.out.println("Marks of subject 1 =" +x);
		System.out.println("Marks of subject 2 =" +y);
		System.out.println("Marks of subject 3 =" +z);
	   
	    
		 Total= x+y+z;
		 
		 float percentage=(float)Total/3;
		 
		 System.out.println(" Total marks =" +Total);
	     System.out.println("Marks percentage ="+percentage);
	 }
	}
  }