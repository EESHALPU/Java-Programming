import java.util.Scanner;
class BookFairdetail 
{ 
   String Bname;
   double price;
   BookFairdetail() 
   { 
     Bname = " ";
     price = 0; 
   }

   void input() 
   { 
     Scanner S = new Scanner (System.in); 
     System.out.println ("Enter Book name");
     Bname = S.nextLine();
     System.out.println("Enter Price"); 
     price = S.nextDouble(); 
   }

   void calculate() 
   { 
		double d;
		if (price <= 1000)  
		{   
			d = 2.0/100*price; 
			price = price - d;
		}
    
		else if (price <= 3000)
		{  
			d = 10.0/100 * price;
			price = price - d;			
		}
    
		else 
		{
			d = 15.0/100*price;
			price = price - d;
		} 
		
	}
	
	void display()   
	{ 
		System.out.println ("Book name" + Bname); 
		System.out.println ("Price" + price);
	} 
}

class BookFair
{   
  public static void main (String args[]) 
 { 
   BookFairdetail b = new BookFairdetail();
   b.input();
   b.calculate();
   b. display(); 
 }
}