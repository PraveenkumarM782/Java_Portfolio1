package Praveen5thMay;

public class TV implements TV_Remote1,Smart_Tv_Remote2 {

	@Override
	public void changeChanneLOLDTV() {
		
		System.out.println("I have old TV so , I want basic TV Remote..");
		
	}
	
	public void changeChannelSmartTv(){
		
		System.out.println("I have NEW Smart Tv so, I Want Smart Tv Remote..");
	}
		
	
	public static void main(String[] args) {	
		TV oldTv = new TV();
		  oldTv.changeChanneLOLDTV();
		
		TV NewTv = new TV();
		  NewTv.changeChannelSmartTv();
		
	}
	
	

}
