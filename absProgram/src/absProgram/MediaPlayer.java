package absProgram;
import java.util.*;

abstract class media
{
  public abstract void play();
  public  void  stop()
  {
	  System.out.println("Stopped the Song Playback");
  }
}
interface Playable {
    void play();
}

interface Stoppable {
    void stop();
}

class Audio extends media implements Playable,Stoppable
{
	private String Song;
	public Audio(String Song)
	{
		this.Song=Song;
	}
    public void play()
    {
    	System.out.println("The Song is play-->"+Song);
    }
    public void stop()
    {
    	System.out.println("The Song Is Pasued-->"+Song);
    }
}

class vidio extends media implements Playable,Stoppable
{
  private String video;
  public vidio(String video)
  {
	  this.video=video;
  }
  public void play()
  {
	System.out.println("The Video Is Play-->"+video);  
  }
  public void stop()
  {
	  System.out.println("The Video Is Pasued-->"+video);
  }
  }
 

public class MediaPlayer 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("How Many Time U want To Play");
		int size=sc.nextInt();
		System.out.println("Enter The Song Name");
		sc.nextLine();
		String s=sc.nextLine();
		System.out.println("Enter The video Name");
		
		String k=sc.nextLine();
		 media[] m = new media[size];
for(int i=0;i<m.length;i++)
{
	     if(i%2==0)
	     {
	        m[i] = new Audio(s);
	        m[i].play();
            m[i].stop();
	     }else {
	        m[i] = new vidio(k);
	        m[i].play();
            m[i].stop();

}      
	     
	System.out.println("-----------------------------------------------------------");            
	           
	        
	}
	}
}
