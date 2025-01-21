////Q2. WAP to create class name as Product as POJO class with field id,name and qty and price and you have to create Shop as class with following methods 
//void setProducts(Customer customer,Product …p): this method can accept the n number of products 
//void findBill(): this function can find the bill of a customer using the following format.
//  

package absProgram;
import java.util.*;
import java.lang.*;
abstract class Bi extends Thread
{
   protected long id;
   protected String name;
   protected double prise;
   protected int qty;
   
   public abstract void  setId(int id) ;
   public abstract long getId() ;
   public abstract void setNamePr(String name) ;
   public abstract String getNamePr();
   public abstract void setPrise(double prise );
   public  abstract double getPrise();
   public  abstract void setQty(int qty);
   public  abstract int getQty();
   
   
   
    

}

interface Calculations
{  public void ShowDetails();
   public void BuyProduct();
   public void CalculateBill();
   public void SearchProduct();
   
}
class Billing extends Bi implements Calculations
{
    public void setId(int id)
    {
    	this.id=id;
    }
	public long getId()
	{
		return id;
	}
	
	public void setNamePr(String name)
	{
		this.name=name;
	}
	public String getNamePr()
	{
		return name;
	}
	public void setPrise(double prise)
	{
		this.prise=prise;
	}
	public double getPrise()
	{
		return prise;
	}
	public void setQty(int qty) {
		this.qty=qty;
		
	}
	public int getQty()
	{
		return qty;
	}
	public void ShowDetails() {
		try 
		{
		System.out.println("Product Id : "+getId()+"  Product_Name : "+getNamePr()+"  Product_Prise : "+getPrise()+"  Product_Quantity : "+getQty());
		sleep(1000);
		}
		catch(Exception  e)
		{
			System.out.println("The Error is-->"+e);
		}
		
	}

	
	public void BuyProduct() {
		
		
	}

	
	public void CalculateBill() {
		
		
	}

	public void SearchProduct() {
		
		
	}
	
	
 	
}
public class Billiing_System {
   public static void main(String args[])
   {   Bi b2=new Billing();
        b2.start();
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Welcome to Billing System Program..");
	   System.out.println("======================================//====================================");
	   int choise;
	  do {
		 System.out.println("1 : Fill The Details..(Add product and Rate)");
		 System.out.println("2 : Show The Product Details ");
		 System.out.println("3 : buy The product  ");
		 System.out.println("4 : Total Bill");
		 System.out.println("5 : Check product prise");
		 System.out.println("6 : Bill With Gst Without gst");
		 System.out.println("7 :  Exit");
		 choise=sc.nextInt();
		 
		
		 Billing b[]=new Billing[10];
		 switch(choise)
		 {
		 case 1:
			  System.out.println("How Many Product U Want To Add..?");
			  int size=sc.nextInt();
			  try {
			  if(size<=10)
			  {
				  System.out.println("You Have The Suffecient Storage space To Add The Product Details..");
				  
			  }else {
				  System.out.println("You Do Not Have A sufficent Storage Space..");
			  }
			  }catch(Exception e)
			  {
				  System.out.println("The Error is..."+e);
			  }
			  System.out.println("Please Fill The Details As Per The Requirement..");
			 try { 
			  for(int i=0;i<b.length;i++)
			  {
				  b[i]=new Billing();
				  
				  System.out.println("Enter The Product ID..");
				  int id=sc.nextInt();
				  b[i].setId(id);
				  sc.nextLine();
				  System.out.println("Enter The Product Name...");
				  String name=sc.nextLine();
				  b[i].setName(name);
				  System.out.println("Enter The Product prise per pis..");
				  double rs=sc.nextDouble();
				  b[i].setPrise(rs);
				  System.out.println("Enter The Quantity...");
				  int qty=sc.nextInt();
				  b[i].setQty(qty);
			  }
			  break;
			 }catch(Exception e)
			 {
				 System.out.println("The Error Is..."+e);
			 }
		 case 2:
			 
			  System.out.println("Here The Product Details...");
			  for(int i=0;i<b.length;i++)
			  {
				b[i].ShowDetails();
			
			  }
			  break;
		 case 3:
			  System.out.println("Which Product  want to Buy Enter The (id,name)");
			   System.out.println("1 : buy from Id..");
			   System.out.println("2 : buy from Name");
			   int cc=sc.nextInt();
			   switch(cc)
			   {
			   case 1:
				    int pp=sc.nextInt();
				    
				    break;
			   case 2:
				   sc.nextLine();
				   String na=sc.nextLine();
				   
			   }
			  
			   
			  break;		  
		 case 4:
			  break;
		 case 5:
			  break;
		 case 6:
			  break;
		 case 7:
			  break;
		   default:
			   System.out.println("Please Enter The Valid Choise") ;
		 }
		  
		  
	  }
	  
	  while (choise!=5);
	   
   }
}
