package absProgram;

import java.util.*;
class Emp
{
 private String name,role;
 private int id,salary;
  public Emp(String name,int id,int salary,String role)
  {
	this.name=name;
	this.id=id;
	this.salary=salary;
	this.role=role;
	  
  }
  
  public   String getName()
  {
	  return name;
  }
  public int getId()
  {
	  return id;
  }
  public int getSalary()
  {
	  return salary;
  }
  public String getRole()
  {
	  return role;
  }
}
public class PoJo_practice {
	
	public static void main(String args[]) {
		Emp a[]=new Emp[2];	
	Scanner sc= new Scanner(System.in);
	System.out.println("Please Enter Your Choise For The Further Process....");
	int choise; 
	do
	  {	
	System.out.println("1 For Fill The Details...(Employee)");
	System.out.println("2 For Show The Details...");
	System.out.println("3.For Search Employee by Name...");
	System.out.println("4.For finding How many Employee With these Salary");
	System.out.println("5.For Exit");
	
	

	 choise=sc.nextInt();
	 sc.nextLine();
	switch(choise)
	{
	case 1:
		for(int i=0;i<a.length;i++)
		{
		 System.out.println("Enter The Name..");
		 
		 String name=sc.nextLine();
		 System.out.println("Enter The Id");
		 int id=sc.nextInt();
		 System.out.println("Enter The Salary");
		 int salary=sc.nextInt();
		 System.out.println("Enter The Role");
		 sc.nextLine();
		 String rol=sc.nextLine();
		 a[i]=new Emp(name,id,salary,rol);
		 
		} 
		break;
	case 2:
		System.out.println("============================================================================");
		for(int i=0;i<a.length;i++)
		{
		 System.out.println("The "+(i+1)+" Employee Details..");
		 System.out.println("Name-->"+a[i].getName()+" \n id-->"+a[i].getId()+"\n Salary--->"+a[i].getSalary()+"\n Employee Role-->"+a[i].getRole()+"\n");
		}
		System.out.println("============================================================================");
		break;
	case 3:
		break;
	case 4:
		break;
	case 5: 
		break;
	default:
		System.out.println("Nit imput tak................");
		
	}
  }
 while(choise!=5);
	}

}
