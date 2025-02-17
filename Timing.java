
public class Timing {

	public Timing() {
		
	}
	
	public void waitShort() {
		try {	
			Thread.sleep(1000);
		}catch(InterruptedException ex){
		}
	}
	
	public void waitLong() {
		try {	
			Thread.sleep(1500);
		}catch(InterruptedException ex){
		}
	}
}
