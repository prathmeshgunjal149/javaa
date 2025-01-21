package absProgram;
import java.util.*;
interface Notifiable{
    public void SendNotification();	
     public void SetMassage(String x);	
}
class EmailNotification implements Notifiable
{  private String x;
  public  void SetMassage(String x)
  {
	this.x=x;  
  }
  public void SendNotification()
  {
	System.out.println("\t"+x);  
  }
}
class SmsNotification implements Notifiable
{  private String y;
  public  void SetMassage(String y)
  {
	this.y=y;  
  }
  public void SendNotification()
  {
	System.out.println("\t"+y);  
  }
}
public class Notification {
  public static void main(String args[])
  {    Scanner sc= new Scanner(System.in); 
	  System.out.println("How Many Massage u want send");
      int size=sc.nextInt();
	  Notifiable n[]= new Notifiable[size];
	  for(int i=0;i<n.length;i++)
	  {
		  if(i%2==0)
		  {
			  n[i]=new EmailNotification();
			  n[i].SetMassage("This is Email massage");
			  n[i].SendNotification();
		  }
		  else
		  {
			  n[i]=new SmsNotification();
	 
			  n[i].SetMassage("This is Sms massage");
			  n[i].SendNotification();
		  }
	  }
	 
	
	  
	 
  }


}
