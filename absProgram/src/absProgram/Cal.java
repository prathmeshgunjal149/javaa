package absProgram;
import java.util.*;
abstract class calu
{
	protected int a;
	protected int b;
 public   abstract void setvalue(int a,int b) ;
 public abstract void addition() ;
 public abstract void multiplication() ;
}
class Add extends calu

{  
	
	public void setvalue(int a,int b)
	{
	this.a=a;
	this.b=b;
	
	}
	public void addition() {
	System.out.println("Add is"+(a+b));	
		
	}
	public void multiplication() {
		
		System.out.println("mul is"+(a*b));
	}

	
	}
public class Cal {
 public static void main(String args[])
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the Two number");
	 int a=sc.nextInt();
	 int b =sc.nextInt();
	 calu c=new Add();
	 c.setvalue(a, b);
	 c.addition();
	 c.multiplication();
 }
}
