package _02_smurf;

public class Smurf_Runner {
	public static void main(String[] args) {
	Smurf handy = new Smurf ("Handy Smurf");
	handy.eat();
	handy.getName();
	
	Smurf papa = new Smurf ("Papa Smurf");
	System.out.println(papa.getName()); 
	System.out.println(papa.getHatColor());
	System.out.println(papa.isGirlOrBoy());
	
	Smurf smurfette = new Smurf ("Smurfette");
	System.out.println(smurfette.getName());
	System.out.println(smurfette.getHatColor());
	System.out.println(smurfette.isGirlOrBoy());
		
	}
}
