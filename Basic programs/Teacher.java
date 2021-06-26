class TeacherDetail
{

  String Name ;
  String Address ;

  int Phone ;

  String SubjectSpecialization ;

  double MonthlySalary ;

  double IncomeTax ;

  void details (String a, String b, String N, String c, double d)
  {
   Name = a;
   Address = b;
   //Phone = N;
   SubjectSpecialization = c;
   MonthlySalary  = d;
  }

  public void show ( )
  {
    System.out.println("Name" + Name);
    System.out.println("Address" + Address);
    System.out.println("Phone" + Phone);
    System.out.println("Subject Specialization" + SubjectSpecialization );
    System.out.println("Monthly Salary" + MonthlySalary);
  }
}
class Tax extends TeacherDetail{
  void Income_Tax ( )
  {
   double IncomeTax=0;
   double AnnualSalary = 12 * MonthlySalary;
   if (AnnualSalary > 175000)
   IncomeTax = (5/100)*(AnnualSalary - 175000);
   System.out.println(IncomeTax);
  }
}


class Teacher{
public static void main (String args[])
{
  Tax p = new Tax( );
  p.details("XYZ","Coimbatore","9735736374","PHYSIOLOGY",32000.0);
  //Tax tx=new Tax();
  p.Income_Tax( );
  p.show();
}

}
