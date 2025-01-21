//Q1. WAP to create class name as Employee with field id,name and salary and create array of object of size 5 and perform following operation on it.
//
//Case 1: Add New Employee details 
//Case 2: View all employee details
//Case 3: Sort All employee records by using its id.
//Case 4: Search employee by using name means you have to input the name of employee and search employee present in array or not 

package absProgram;
import java.util.*;
class Empi
{
   private int id;
   private String name;
   private int salary;
   
   public void setId(int id)
   {
	   this.id=id;
   }
   public int getId()
   {
	   return id;
   }
   public void setName(String name)
   {
	   this.name=name;
   }
   public String getName()
   {
	   return name;
   }
   public void setSalary(int salary)
   {
	   this.salary=salary;
   }
   public int getSalary()
   {
	   return salary;
   }
}
public class Employeeee 
{
	public static void main(String args[])
	{   Empi e[]=new Empi[5];
		Scanner sc=new Scanner(System.in);
		int choise;
	
		do {
			
			
			System.out.println(" 1: Add New Employee details");
			System.out.println(" 2: View all employee details");
			System.out.println(" 3: Sort All employee records by using its id.");
			System.out.println(" 4: Search employee by using name means you have to input the name of employee and search employee present in array or not ");
			System.out.println(" 5: Exit");
			choise=sc.nextInt();
			
			switch(choise){
			
			case 1:
				for(int i=0;i<e.length;i++) {
					
					e[i] = new Empi();
				  System.out.println("Enter The Id");
				  int id=sc.nextInt();
			      e[i].setId(id);
			      sc.nextLine();
			      System.out.println("Enter The Name");
			      String ch=sc.nextLine();
			      
			      e[i].setName(ch);
			      
			      System.out.println("Enter The Salaray");
			      int salary=sc.nextInt();
			      e[i].setSalary(salary);
				}
				break;
				
			case 2:
				 for(int i=0;i<e.length;i++)
				 {
					 System.out.println("The "+(i+1)+" Employee details");
					 System.out.println("Name :"+e[i].getName()+"    id :"+e[i].getId()+"   salary :"+e[i].getSalary());
				 }
				 break;
				 
			case 3:
			      for(int i=0;i<e.length;i++)
			      {
			    	  for(int j=i+1;j<e.length;j++)
			    	  {
			    		  if(e[i].getId()>e[j].getId())
			    		  {
			    			  Empi temp=e[i];
			    			  e[i]=e[j];
			    			  e[j]=temp;
			    		  }
			    	  }
			      }
			      break;
			case 4:
				sc.nextLine();
			      System.out.println("Enter the Employee Name For Search");
			      String k=sc.nextLine();
			      int count=0;
			      for(int i=0;i<e.length;i++)
			      {
			    	  if((e[i].getName()).equals(k))
			    	  {
			    		  System.out.println(" Found Name :"+e[i].getName()+"    id :"+e[i].getId()+"   salary :"+e[i].getSalary());
			    		  count=1;
			    	  }
			      }
			      if(count==0)
			      {
			    	  System.out.println("Employee Not Found");
			      }else
			      {
			    	  System.out.println("Employee Found Succesfully");
			      }
			      break;
			case 5:
				 System.out.println("Thak you................");
				 break;
				 default:
					  System.out.println("Please Enter The Valid Choise..");
			}
			
			
			
		}while(choise!=5);
	}

}
