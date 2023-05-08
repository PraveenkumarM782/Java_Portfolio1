package Praveen5thMay;

public class SmartTelephone extends Telephone {
	
	public void lift(){
		
		System.out.println("You lift the Telephone :");
	}
	
	public void disconnected(){
		
		System.out.println("You disconnected the Telephone :");
	}

	public static void main(String[] args) {
		
		Telephone tobj = new SmartTelephone();
		tobj.lift();
		tobj.disconnected();
		
	}

}
