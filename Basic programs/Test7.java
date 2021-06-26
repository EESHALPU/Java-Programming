import java.util.*;
class Test5  
{
	public  static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Your name =");
		String name=s.nextLine();
		int count=0;
		
		 for(int i = 0; i < name.length(); i++) 
		 {    
            if(name.charAt(i) != ' ')    
                count++;    
		 }
		 
		//System.out.println("Your Entered ="+name);
		System.out.println("Length of Character ="+count);
	}
}