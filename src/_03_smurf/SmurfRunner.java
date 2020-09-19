package _03_smurf;

public class SmurfRunner {
	public static void main(String[] args) {
	Smurf HandySmurf = new Smurf("Handy");
	HandySmurf.eat();	
	HandySmurf.getName();
	Smurf PapaSmurf = new Smurf("Papa Smurf");
	PapaSmurf.getName();	
	PapaSmurf.getHatColor();	
	Smurf Smurfette = new Smurf("Smurfette");
	Smurfette.getName();	
	Smurfette.isGirlOrBoy();	
	
		
	}
}
