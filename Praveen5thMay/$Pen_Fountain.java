package Praveen5thMay;

public class $Pen_Fountain extends $Pen {
	
	public void  changeNib() {	
		System.out.println("Pen Nib is changed..");
	}

	@Override
	public void write() {
		System.out.println("Pen is Writable");
	}

	@Override
	public void refill() {
		System.out.println("We can refill the pen");
	}
	
	public static void main(String[] args) {
		
		$Pen_Fountain pobj = new $Pen_Fountain();
		pobj.write();
		pobj.refill();
		pobj.changeNib();
	}
	

}
