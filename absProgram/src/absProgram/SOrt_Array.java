package absProgram;
import java.util.*;
interface Sortable{
  public  void SortArray(); 
  public void CharSortArray();
  public void PrintArray();
	
}
class integerArray implements Sortable
{ 
	private String ch[];
	private  int a[];
	
	public integerArray(int a[],String ch[])
	{
		this.a=a;
		this.ch=ch;
	}
	public  void SortArray()
	{
	 
	  
	  for(int i=0;i<a.length-1;i++)
	  {
		  for(int j=i+1;j<a.length;j++)
		  {
			  if(a[i]>a[j])
			  {
				   int temp=a[i];
				   a[i]=a[j];
				   a[j]=temp;
				  
			  }
				  
			  
		  }
		  
	  }
	  
	  
		
	}
	public void CharSortArray()
	{
		for(int i=0;i<ch.length-1;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				 if(ch[i].compareTo(ch[j])>0)
				 {
					String temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				 }
			}
		}
	}
	public  void PrintArray()
	{
		System.out.println("\n Integer Array Sort");
		for(int i=0;i<a.length;i++)
		{
			System.out.print("\t"+a[i]);
		}
		
		System.out.println("\n String Array Sort");
		
		for(int i=0;i<ch.length;i++)
			
		{
			System.out.print("\t"+ch[i]);
		}
	}
	
}
public class SOrt_Array {
	public static void main(String args[])
	{
	  Scanner sc= new Scanner(System.in);
	  System.out.println("Enter The Arry Size");
	  int size=sc.nextInt();
	  System.out.println("Enter The Array Element");
	  int a[]=new int[size];
	  for(int i=0;i<a.length;i++)
	  {
        a[i]=sc.nextInt();
	  }
	  
	  System.out.println("Enter The Second Arry Size");
	  int size1=sc.nextInt();
	  System.out.println("Enter The Second Array Element");
	  String ch[]=new String[size];
	  sc.nextLine();
	  for(int i=0;i<ch.length;i++)
	  {
        ch[i]=sc.nextLine();
	  }
	  
	  Sortable s=new integerArray(a,ch) ;
	     s.SortArray();
	     s.CharSortArray();
	     s.PrintArray();
	  
	} 
}
