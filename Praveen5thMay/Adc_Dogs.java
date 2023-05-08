package Praveen5thMay;

public  class Adc_Dogs extends Adc_Animal
{	
	@Override
	public void dogs() {
		
		System.out.println("Dogs does BOW BOW ");
	}

	@Override
	public void cats() {
		this.dogs();
	}

}
